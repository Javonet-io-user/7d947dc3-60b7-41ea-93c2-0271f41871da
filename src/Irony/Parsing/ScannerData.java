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

public class ScannerData {
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
  public TerminalLookupTable getTerminalsLookup() {
    try {
      Object res = javonetHandle.<NObject>get("TerminalsLookup");
      if (res == null) return null;
      return new TerminalLookupTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setTerminalsLookup(TerminalLookupTable param) {
    try {
      javonetHandle.set("TerminalsLookup", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TerminalList getMultilineTerminals() {
    try {
      Object res = javonetHandle.<NObject>get("MultilineTerminals");
      if (res == null) return null;
      return new TerminalList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setMultilineTerminals(TerminalList param) {
    try {
      javonetHandle.set("MultilineTerminals", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TerminalList getNoPrefixTerminals() {
    try {
      Object res = javonetHandle.<NObject>get("NoPrefixTerminals");
      if (res == null) return null;
      return new TerminalList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setNoPrefixTerminals(TerminalList param) {
    try {
      javonetHandle.set("NoPrefixTerminals", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TerminalLookupTable getNonGrammarTerminalsLookup() {
    try {
      Object res = javonetHandle.<NObject>get("NonGrammarTerminalsLookup");
      if (res == null) return null;
      return new TerminalLookupTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setNonGrammarTerminalsLookup(TerminalLookupTable param) {
    try {
      javonetHandle.set("NonGrammarTerminalsLookup", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ScannerData(LanguageData language) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.ScannerData", language);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ScannerData(NObject handle) {
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
