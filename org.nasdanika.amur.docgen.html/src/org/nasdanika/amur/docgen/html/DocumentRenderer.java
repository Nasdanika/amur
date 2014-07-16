package org.nasdanika.amur.docgen.html;

import org.nasdanika.amur.*;
import java.util.*;

public class DocumentRenderer {


  protected static String nl;
  public static synchronized DocumentRenderer create(String lineSeparator)
  {
    nl = lineSeparator;
    DocumentRenderer result = new DocumentRenderer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "<html>" + NL + "\t<head>" + NL + "\t\t<meta charset=\"utf-8\">" + NL + "\t\t" + NL + "\t\t<style>" + NL + "\t\t\tbody {font-family: Arial, sans-serif;}" + NL + "\t\t" + NL + "\t\t\t.standard {" + NL + "\t\t\t\tFONT-SIZE: 12px; " + NL + "\t\t\t\tCOLOR: #000000; " + NL + "\t\t\t\tLINE-HEIGHT: 16px; " + NL + "\t\t\t\tFONT-FAMILY: Arial, Helvetica, sans-serif; " + NL + "\t\t\t\tTEXT-DECORATION: none" + NL + "\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\tTH.standard { " + NL + "\t\t\t\tbackground: #D1D1FF" + NL + "\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\tTABLE.standard { " + NL + "\t\t\t\tbackground: #202040" + NL + "\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\tTR.standard { " + NL + "\t\t\t\tbackground: #FAFAFF" + NL + "\t\t\t}" + NL + "\t\t" + NL + "\t\t\t@media print {" + NL + "\t\t\t" + NL + "\t\t\t\t.nonprintable {" + NL + "\t\t\t\t\tdisplay: none\t\t" + NL + "\t\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\t\tTABLE.standard { " + NL + "\t\t\t\t\tborder: solid 1px black" + NL + "\t\t\t\t}" + NL + "\t\t\t\t" + NL + "\t\t\t\tTD.standard { " + NL + "\t\t\t\t\tborder-bottom: dashed 1px black; " + NL + "\t\t\t\t\tborder-right: dashed 1px black; " + NL + "\t\t\t\t}" + NL + "\t\t\t\t" + NL + "\t\t\t\tTH.standard { " + NL + "\t\t\t\t\tborder: solid 1px black" + NL + "\t\t\t\t}\t\t\t" + NL + "\t\t\t}" + NL + "\t\t\t\t\t" + NL + "\t\t</style>\t\t" + NL + "\t</head>" + NL + "\t<body>" + NL + "\t\t<H1>Model tree</H1>" + NL + "\t\t<UL>" + NL + "\t\t\t";
  protected final String TEXT_2 = NL + "\t\t</UL>" + NL + "\t" + NL + "\t\t";
  protected final String TEXT_3 = NL + "\t\t\t";
  protected final String TEXT_4 = NL + "\t\t";
  protected final String TEXT_5 = "\t" + NL + "\t</body>" + NL + "</html>";
  protected final String TEXT_6 = NL;

public String generate(org.nasdanika.amur.Component component, GenerationHelper helper, java.util.Map<Object, Object> context) throws Exception
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(helper.genModelTree(component));
    stringBuffer.append(TEXT_2);
     for (Component cmp: helper.allContent(component)) { 
    stringBuffer.append(TEXT_3);
    stringBuffer.append(new ComponentRenderer().generate(cmp, helper, context));
    stringBuffer.append(TEXT_4);
     } 
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}