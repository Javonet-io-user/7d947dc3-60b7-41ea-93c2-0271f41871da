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

public class SourceStream implements ISourceStream {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getText() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Irony.Parsing.ISourceStream").invoke("get_Text");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPosition(java.lang.Integer value) {
    try {
      javonetHandle.explicitInterface("Irony.Parsing.ISourceStream").invoke("set_Position", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPosition() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Irony.Parsing.ISourceStream").invoke("get_Position");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLocation(SourceLocation value) {
    try {
      javonetHandle.explicitInterface("Irony.Parsing.ISourceStream").invoke("set_Location", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SourceLocation getLocation() {
    try {
      Object res =
          javonetHandle.explicitInterface("Irony.Parsing.ISourceStream").invoke("get_Location");
      if (res == null) return null;
      return new SourceLocation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPreviewPosition(java.lang.Integer value) {
    try {
      javonetHandle
          .explicitInterface("Irony.Parsing.ISourceStream")
          .invoke("set_PreviewPosition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPreviewPosition() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Irony.Parsing.ISourceStream")
              .invoke("get_PreviewPosition");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getPreviewChar() {
    try {
      java.lang.Character res =
          javonetHandle.explicitInterface("Irony.Parsing.ISourceStream").invoke("get_PreviewChar");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getNextPreviewChar() {
    try {
      java.lang.Character res =
          javonetHandle
              .explicitInterface("Irony.Parsing.ISourceStream")
              .invoke("get_NextPreviewChar");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SourceStream(
      java.lang.String text, java.lang.Boolean caseSensitive, java.lang.Integer tabWidth) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.SourceStream", text, caseSensitive, tabWidth);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SourceStream(
      java.lang.String text,
      java.lang.Boolean caseSensitive,
      java.lang.Integer tabWidth,
      SourceLocation initialLocation) {
    try {
      javonetHandle =
          Javonet.New("Irony.Parsing.SourceStream", text, caseSensitive, tabWidth, initialLocation);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SourceStream(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean MatchSymbol(java.lang.String symbol) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("Irony.Parsing.ISourceStream")
              .invoke("MatchSymbol", symbol);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Token CreateToken(Terminal terminal) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Irony.Parsing.ISourceStream")
              .invoke("CreateToken", terminal);
      if (res == null) return null;
      return new Token((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Token CreateToken(Terminal terminal, Object value) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Irony.Parsing.ISourceStream")
              .invoke("CreateToken", terminal, value);
      if (res == null) return null;
      return new Token((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EOF() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("Irony.Parsing.ISourceStream").invoke("EOF");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
