package Irony.Ast;

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
import Irony.Ast.*;
import Irony.*;
import Irony.Parsing.*;
import jio.System.*;
import jio.System.Collections.Generic.*;

public class AstContext {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public LanguageData getLanguage() {
    try {
      Object res = javonetHandle.<NObject>get("Language");
      if (res == null) return null;
      return new LanguageData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setLanguage(LanguageData param) {
    try {
      javonetHandle.set("Language", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Type getDefaultNodeType() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultNodeType");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultNodeType(jio.System.Type param) {
    try {
      javonetHandle.set("DefaultNodeType", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Type getDefaultLiteralNodeType() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultLiteralNodeType");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultLiteralNodeType(jio.System.Type param) {
    try {
      javonetHandle.set("DefaultLiteralNodeType", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Type getDefaultIdentifierNodeType() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultIdentifierNodeType");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultIdentifierNodeType(jio.System.Type param) {
    try {
      javonetHandle.set("DefaultIdentifierNodeType", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Dictionary<Object, Object> getValues() {
    try {
      Object res = javonetHandle.<NObject>get("Values");
      if (res == null) return null;
      return new Dictionary<Object, Object>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setValues(Dictionary<Object, Object> param) {
    try {
      javonetHandle.set("Values", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public LogMessageList getMessages() {
    try {
      Object res = javonetHandle.<NObject>get("Messages");
      if (res == null) return null;
      return new LogMessageList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setMessages(LogMessageList param) {
    try {
      javonetHandle.set("Messages", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AstContext(LanguageData language) {
    try {
      javonetHandle = Javonet.New("Irony.Ast.AstContext", language);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AstContext(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddMessage(
      ErrorLevel level, SourceLocation location, java.lang.String message, Object[] args) {
    try {
      javonetHandle.invoke(
          "AddMessage", NEnum.fromJavaEnum(level), location, message, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
