package Irony;

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
import Irony.*;
import jio.System.Resources.*;
import jio.System.Globalization.*;

public class Resources {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public static ResourceManager getResourceManager() {
    try {
      Object res = Javonet.getType("Irony.Resources").<NObject>get("ResourceManager");
      if (res == null) return null;
      return new ResourceManager((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCulture(CultureInfo value) {
    try {
      Javonet.getType("Irony.Resources").set("Culture", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static CultureInfo getCulture() {
    try {
      Object res = Javonet.getType("Irony.Resources").<NObject>get("Culture");
      if (res == null) return null;
      return new CultureInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getConsoleNoChars() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ConsoleNoChars");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getConsoleYesChars() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ConsoleYesChars");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrAmbigGrammarRR() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrAmbigGrammarRR");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrAmbigGrammarSR() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrAmbigGrammarSR");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrArgListNotFound() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrArgListNotFound");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrAssignLiteralValue() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrAssignLiteralValue");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrBadChar() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrBadChar");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrBadStrLiteral() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrBadStrLiteral");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrBadUnEscape() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrBadUnEscape");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrBadXEscape() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrBadXEscape");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrCannotConvertValue() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrCannotConvertValue");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrCannotConvertValueToType() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrCannotConvertValueToType");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrCannotMoveBackInSource() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrCannotMoveBackInSource");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrConflictMsgTemplate() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrConflictMsgTemplate");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrConsoleFatalError() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrConsoleFatalError");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrConstructNotSupported() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrConstructNotSupported");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrDsvNoClosingQuote() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrDsvNoClosingQuote");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrDupRegexSwitch() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrDupRegexSwitch");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrDupStartSymbolStr() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrDupStartSymbolStr");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrFailedCreateNode() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrFailedCreateNode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrFreeTextNoEndTag() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrFreeTextNoEndTag");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrImpliedOpUseParserLink() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrImpliedOpUseParserLink");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrInternalErrDataPopFailed() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrInternalErrDataPopFailed");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrInterpreterIsBusy() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrInterpreterIsBusy");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrInvalidArgsForIncDec() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrInvalidArgsForIncDec");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrInvalidAstMode() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrInvalidAstMode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrInvalidChar() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrInvalidChar");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrInvalidEmbeddedPrefix() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrInvalidEmbeddedPrefix");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrInvDedent() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrInvDedent");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrInvEscape() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrInvEscape");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrInvEscSeq() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrInvEscSeq");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrInvEscSymbol() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrInvEscSymbol");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrInvNumber() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrInvNumber");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrInvRegexSwitch() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrInvRegexSwitch");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrInvStrDef() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrInvStrDef");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrLastTermOfErrorProd() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrLastTermOfErrorProd");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrListCannotBeTransient() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrListCannotBeTransient");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrNewLineExpected() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrNewLineExpected");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrNoClosingBrace() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrNoClosingBrace");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrNodeTypeNotSetOn() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrNodeTypeNotSetOn");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrNoEndForRegex() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrNoEndForRegex");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrNoEndTagInEmbExpr() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrNoEndTagInEmbExpr");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrNoImplForUnaryOp() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrNoImplForUnaryOp");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrNoLetterAfterNum() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrNoLetterAfterNum");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrNoLkhds() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrNoLkhds");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrNtRuleIsNull() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrNtRuleIsNull");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrNullNodeEval() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrNullNodeEval");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrOpNotDefinedForType() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrOpNotDefinedForType");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrOpNotDefinedForTypes() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrOpNotDefinedForTypes");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrOpNotImplemented() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrOpNotImplemented");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrOutErrorPrintFormat() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrOutErrorPrintFormat");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrOutlineFilterContSymbol() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrOutlineFilterContSymbol");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrParserUnexpectedInput() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrParserUnexpectedInput");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrParseTreeNull() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrParseTreeNull");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrParseTreeRootNull() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrParseTreeRootNull");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrRootAstNodeNull() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrRootAstNodeNull");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrRootAstNoInterface() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrRootAstNoInterface");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrRootNotRegistered() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrRootNotRegistered");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrRootNotSet() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrRootNotSet");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrRRConflict() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrRRConflict");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrRuleContainsNull() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrRuleContainsNull");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrSRConflict() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrSRConflict");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrSyntaxErrorExpected() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrSyntaxErrorExpected");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrSyntaxErrorNoInfo() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrSyntaxErrorNoInfo");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrTemplExprNotRoot() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrTemplExprNotRoot");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrTemplMissingExprRoot() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrTemplMissingExprRoot");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrTemplNoSettings() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrTemplNoSettings");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrTerminalHasEmptyPrefix() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrTerminalHasEmptyPrefix");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrTransientNtMustHaveOneTerm() {
    try {
      java.lang.String res =
          Javonet.getType("Irony.Resources").get("ErrTransientNtMustHaveOneTerm");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrUnclosedComment() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrUnclosedComment");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrUnexpEof() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrUnexpEof");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrUnexpIndent() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrUnexpIndent");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrUnmatchedCloseBrace() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrUnmatchedCloseBrace");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrVarIsNotCallable() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrVarIsNotCallable");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrVarNotDefined() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrVarNotDefined");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrWrongArgCount() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("ErrWrongArgCount");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFmtRowCol() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("FmtRowCol");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLabelActionAccept() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("LabelActionAccept");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLabelActionOp() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("LabelActionOp");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLabelActionReduce() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("LabelActionReduce");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLabelActionShift() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("LabelActionShift");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLabelActionUnknown() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("LabelActionUnknown");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLabelEofMark() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("LabelEofMark");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLabelEosLabel() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("LabelEosLabel");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLabelInitialState() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("LabelInitialState");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLabelKeySymbol() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("LabelKeySymbol");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLabelKeyword() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("LabelKeyword");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLabelLineBreak() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("LabelLineBreak");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLabelLocation() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("LabelLocation");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLabelNone() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("LabelNone");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLabelSrcHaveMore() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("LabelSrcHaveMore");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLabelUnnamed() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("LabelUnnamed");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgAbortScriptYN() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgAbortScriptYN");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgDefaultConsoleGreeting() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgDefaultConsoleGreeting");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgDefaultConsoleTitle() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgDefaultConsoleTitle");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgErrorCustomActionDidNotAdvance() {
    try {
      java.lang.String res =
          Javonet.getType("Irony.Resources").get("MsgErrorCustomActionDidNotAdvance");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgExitConsoleYN() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgExitConsoleYN");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgNLALRAdvice() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgNLALRAdvice");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgPressAnyKeyToExit() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgPressAnyKeyToExit");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgSrcPosToString() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgSrcPosToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgTraceConflictResolved() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgTraceConflictResolved");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgTraceExecCustomAction() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgTraceExecCustomAction");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgTraceOpResolved() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgTraceOpResolved");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgTracePoppedState() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgTracePoppedState");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgTraceRecoverAction() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgTraceRecoverAction");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgTraceRecoverFailed() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgTraceRecoverFailed");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgTraceRecoverFoundState() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgTraceRecoverFoundState");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgTraceRecovering() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgTraceRecovering");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgTraceRecoverReducing() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgTraceRecoverReducing");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgTraceRecoverShiftError() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgTraceRecoverShiftError");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgTraceRecoverShiftTillEnd() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgTraceRecoverShiftTillEnd");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMsgTraceRecoverSuccess() {
    try {
      java.lang.String res = Javonet.getType("Irony.Resources").get("MsgTraceRecoverSuccess");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public Resources(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
