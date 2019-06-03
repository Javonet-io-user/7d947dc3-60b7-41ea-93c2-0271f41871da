package Irony.Parsing;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Irony.Parsing.*;
import jio.System.*;

public interface ISourceStream {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Token CreateToken(Terminal terminal);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Token CreateToken(Terminal terminal, Object value);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean MatchSymbol(java.lang.String symbol);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EOF();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getText();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public SourceLocation getLocation();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPosition();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPreviewPosition();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getPreviewChar();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getNextPreviewChar();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setLocation(SourceLocation value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setPosition(java.lang.Integer value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setPreviewPosition(java.lang.Integer value);
}
