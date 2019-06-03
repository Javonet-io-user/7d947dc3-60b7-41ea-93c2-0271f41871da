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
import Irony.Ast.*;
import jio.System.*;

public abstract class BnfTerm {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public Grammar getGrammar() {
    try {
      Object res = javonetHandle.<NObject>get("Grammar");
      if (res == null) return null;
      return new Grammar((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAstConfig(AstNodeConfig value) {
    try {
      javonetHandle.set("AstConfig", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public AstNodeConfig getAstConfig() {
    try {
      Object res = javonetHandle.<NObject>get("AstConfig");
      if (res == null) return null;
      return new AstNodeConfig((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getName() {
    try {
      java.lang.String res = javonetHandle.get("Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setName(java.lang.String param) {
    try {
      javonetHandle.set("Name", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getErrorAlias() {
    try {
      java.lang.String res = javonetHandle.get("ErrorAlias");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setErrorAlias(java.lang.String param) {
    try {
      javonetHandle.set("ErrorAlias", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TermFlags getFlags() {
    try {
      Object res = javonetHandle.<NEnum>get("Flags");
      if (res == null) return null;
      return TermFlags.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setFlags(TermFlags param) {
    try {
      javonetHandle.set("Flags", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPrecedence() {
    try {
      java.lang.Integer res = javonetHandle.get("Precedence");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setPrecedence(java.lang.Integer param) {
    try {
      javonetHandle.set("Precedence", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Associativity getAssociativity() {
    try {
      Object res = javonetHandle.<NEnum>get("Associativity");
      if (res == null) return null;
      return Associativity.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setAssociativity(Associativity param) {
    try {
      javonetHandle.set("Associativity", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getNoPrecedence() {
    try {
      java.lang.Integer res = Javonet.getType("Irony.Parsing.BnfTerm").get("NoPrecedence");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNoPrecedence(java.lang.Integer param) {
    try {
      Javonet.getType("Irony.Parsing.BnfTerm").set("NoPrecedence", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BnfTerm(java.lang.String name) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.BnfTerm", name);
      javonetHandle.addEventListener(
          "Shifting",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ParsingEventArgs> handler : _ShiftingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ParsingEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AstNodeCreated",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<AstNodeEventArgs> handler : _AstNodeCreatedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], AstNodeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BnfTerm(java.lang.String name, java.lang.String errorAlias, jio.System.Type nodeType) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.BnfTerm", name, errorAlias, nodeType);
      javonetHandle.addEventListener(
          "Shifting",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ParsingEventArgs> handler : _ShiftingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ParsingEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AstNodeCreated",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<AstNodeEventArgs> handler : _AstNodeCreatedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], AstNodeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BnfTerm(java.lang.String name, java.lang.String errorAlias, AstNodeCreator nodeCreator) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.BnfTerm", name, errorAlias, nodeCreator);
      javonetHandle.addEventListener(
          "Shifting",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ParsingEventArgs> handler : _ShiftingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ParsingEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AstNodeCreated",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<AstNodeEventArgs> handler : _AstNodeCreatedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], AstNodeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BnfTerm(java.lang.String name, java.lang.String errorAlias) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.BnfTerm", name, errorAlias);
      javonetHandle.addEventListener(
          "Shifting",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ParsingEventArgs> handler : _ShiftingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ParsingEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AstNodeCreated",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<AstNodeEventArgs> handler : _AstNodeCreatedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], AstNodeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BnfTerm(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Init(GrammarData grammarData) {
    try {
      javonetHandle.invoke("Init", grammarData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetParseNodeCaption(ParseTreeNode node) {
    try {
      java.lang.String res = javonetHandle.invoke("GetParseNodeCaption", node);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetHashCode() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetHashCode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetFlag(TermFlags flag) {
    try {
      javonetHandle.invoke("SetFlag", NEnum.fromJavaEnum(flag));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetFlag(TermFlags flag, java.lang.Boolean value) {
    try {
      javonetHandle.invoke("SetFlag", NEnum.fromJavaEnum(flag), value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean HasAstConfig() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("HasAstConfig");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public BnfExpression Q() {
    try {
      Object res = javonetHandle.invoke("Q");
      if (res == null) return null;
      return new BnfExpression((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandler<ParsingEventArgs>> _ShiftingListeners =
      new java.util.ArrayList<EventHandler<ParsingEventArgs>>();

  public void addShifting(EventHandler<ParsingEventArgs> toAdd) {
    _ShiftingListeners.add(toAdd);
  }

  public void removeShifting(EventHandler<ParsingEventArgs> toRemove) {
    _ShiftingListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<AstNodeEventArgs>> _AstNodeCreatedListeners =
      new java.util.ArrayList<EventHandler<AstNodeEventArgs>>();

  public void addAstNodeCreated(EventHandler<AstNodeEventArgs> toAdd) {
    _AstNodeCreatedListeners.add(toAdd);
  }

  public void removeAstNodeCreated(EventHandler<AstNodeEventArgs> toRemove) {
    _AstNodeCreatedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
