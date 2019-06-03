package Irony.Parsing.Construction;

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
import Irony.Parsing.Construction.*;
import Irony.Parsing.*;

public class ParserStateData {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public TransitionTable getTransitions() {
    try {
      Object res = javonetHandle.<NObject>get("Transitions");
      if (res == null) return null;
      return new TransitionTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ParserStateSet getReadStateSet() {
    try {
      Object res = javonetHandle.<NObject>get("ReadStateSet");
      if (res == null) return null;
      return new ParserStateSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public ParserState getState() {
    try {
      Object res = javonetHandle.<NObject>get("State");
      if (res == null) return null;
      return new ParserState((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setState(ParserState param) {
    try {
      javonetHandle.set("State", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public LRItemSet getAllItems() {
    try {
      Object res = javonetHandle.<NObject>get("AllItems");
      if (res == null) return null;
      return new LRItemSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setAllItems(LRItemSet param) {
    try {
      javonetHandle.set("AllItems", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public LRItemSet getShiftItems() {
    try {
      Object res = javonetHandle.<NObject>get("ShiftItems");
      if (res == null) return null;
      return new LRItemSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setShiftItems(LRItemSet param) {
    try {
      javonetHandle.set("ShiftItems", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public LRItemSet getReduceItems() {
    try {
      Object res = javonetHandle.<NObject>get("ReduceItems");
      if (res == null) return null;
      return new LRItemSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setReduceItems(LRItemSet param) {
    try {
      javonetHandle.set("ReduceItems", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public LRItemSet getInitialItems() {
    try {
      Object res = javonetHandle.<NObject>get("InitialItems");
      if (res == null) return null;
      return new LRItemSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setInitialItems(LRItemSet param) {
    try {
      javonetHandle.set("InitialItems", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public BnfTermSet getShiftTerms() {
    try {
      Object res = javonetHandle.<NObject>get("ShiftTerms");
      if (res == null) return null;
      return new BnfTermSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setShiftTerms(BnfTermSet param) {
    try {
      javonetHandle.set("ShiftTerms", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TerminalSet getShiftTerminals() {
    try {
      Object res = javonetHandle.<NObject>get("ShiftTerminals");
      if (res == null) return null;
      return new TerminalSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setShiftTerminals(TerminalSet param) {
    try {
      javonetHandle.set("ShiftTerminals", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TerminalSet getConflicts() {
    try {
      Object res = javonetHandle.<NObject>get("Conflicts");
      if (res == null) return null;
      return new TerminalSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setConflicts(TerminalSet param) {
    try {
      javonetHandle.set("Conflicts", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsInadequate() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsInadequate");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setIsInadequate(java.lang.Boolean param) {
    try {
      javonetHandle.set("IsInadequate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public LR0ItemSet getAllCores() {
    try {
      Object res = javonetHandle.<NObject>get("AllCores");
      if (res == null) return null;
      return new LR0ItemSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setAllCores(LR0ItemSet param) {
    try {
      javonetHandle.set("AllCores", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParserStateData(ParserState state, LR0ItemSet kernelCores) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.Construction.ParserStateData", state, kernelCores);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParserStateData(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddItem(LR0Item core) {
    try {
      javonetHandle.invoke("AddItem", core);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ParserState GetNextState(BnfTerm shiftTerm) {
    try {
      Object res = javonetHandle.invoke("GetNextState", shiftTerm);
      if (res == null) return null;
      return new ParserState((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TerminalSet GetShiftReduceConflicts() {
    try {
      Object res = javonetHandle.invoke("GetShiftReduceConflicts");
      if (res == null) return null;
      return new TerminalSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TerminalSet GetReduceReduceConflicts() {
    try {
      Object res = javonetHandle.invoke("GetReduceReduceConflicts");
      if (res == null) return null;
      return new TerminalSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
