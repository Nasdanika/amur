package org.nasdanika.common.jedit.tokenmarker;

import javax.swing.text.Segment;

import org.syntax.jedit.tokenmarker.JavaTokenMarker;
import org.syntax.jedit.tokenmarker.Token;
import org.syntax.jedit.tokenmarker.TokenMarker;

public class JetTokenMarker extends TokenMarker {
	
	private JavaTokenMarker javaTokenMarker = new JavaTokenMarker() {
		
		@Override
		protected void addToken(int length, byte id) {
			JetTokenMarker.this.addToken(length, id);
		}
	};

	@Override
	protected byte markTokensImpl(byte token, Segment line, int lineIndex) {
		char[] array = line.array;
		int offset = line.offset;
		int lastOffset = offset;
		int length = line.count + offset;
		boolean inMarkup = token == Token.LABEL || lineIndex==0;
		byte prevType = inMarkup ? Token.NULL : token;
		for (int i=offset; i<length; ++i) {			
			if (inMarkup && array[i]=='<' && i+1<length && array[i+1]=='%') {
				if (i!=lastOffset) {
					addToken(i-lastOffset, Token.METHOD);
				}
				int tokenLength = i+2<length && array[i+2]=='=' ? 3 : 2;
				addToken(tokenLength, Token.LABEL);				
				i+=tokenLength-1;
				lastOffset=i+1;
				inMarkup = false;
			} else if (!inMarkup && array[i]=='%' && i+1<length && array[i+1]=='>') {
					if (i!=lastOffset) {
						Segment javaSegment = new Segment(array, lastOffset, i-lastOffset);
						prevType = javaTokenMarker.markTokensImpl(prevType, javaSegment, lineIndex);
					}
					addToken(2, Token.LABEL);
					++i;
					lastOffset=i+1;
					inMarkup = true;
			} else if (i==length-1 && lastOffset!=i) {
				if (inMarkup) {
					addToken(i+1-lastOffset, Token.METHOD);
				} else {
					Segment javaSegment = new Segment(array, lastOffset, i+1-lastOffset);
					prevType = javaTokenMarker.markTokensImpl(prevType, javaSegment, lineIndex);
				}
			}
		}
		return inMarkup ? Token.LABEL : prevType;
	}

}
