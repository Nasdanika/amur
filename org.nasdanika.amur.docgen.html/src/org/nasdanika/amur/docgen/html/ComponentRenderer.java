package org.nasdanika.amur.docgen.html;

import org.nasdanika.amur.*;
import java.util.*;
import org.apache.commons.lang3.StringEscapeUtils;

public class ComponentRenderer {


  protected static String nl;
  public static synchronized ComponentRenderer create(String lineSeparator)
  {
    nl = lineSeparator;
    ComponentRenderer result = new ComponentRenderer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "<a name=\"";
  protected final String TEXT_2 = "\"><H1>";
  protected final String TEXT_3 = "</H1></a>";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL + NL;
  protected final String TEXT_12 = NL;

public String generate(org.nasdanika.amur.Component component, GenerationHelper helper, java.util.Map<Object, Object> context) throws Exception
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(component.getId());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.genLabel(component));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.writeDiagram(component));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(helper.genDescription(component));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.genSource(component));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.genTarget(component));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.genInboundConnections(component));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(helper.genOutboundConnections(component));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.genImplementationType(component));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    return stringBuffer.toString();
  }
}