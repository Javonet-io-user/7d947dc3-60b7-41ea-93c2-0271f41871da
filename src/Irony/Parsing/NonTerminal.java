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
import Irony.Ast.*;

public class NonTerminal extends BnfTerm {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public BnfExpression getRule() {
    try {
      Object res = javonetHandle.<NObject>get("Rule");
      if (res == null) return null;
      return new BnfExpression((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setRule(BnfExpression param) {
    try {
      javonetHandle.set("Rule", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public BnfExpression getErrorRule() {
    try {
      Object res = javonetHandle.<NObject>get("ErrorRule");
      if (res == null) return null;
      return new BnfExpression((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setErrorRule(BnfExpression param) {
    try {
      javonetHandle.set("ErrorRule", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getNodeCaptionTemplate() {
    try {
      java.lang.String res = javonetHandle.get("NodeCaptionTemplate");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setNodeCaptionTemplate(java.lang.String param) {
    try {
      javonetHandle.set("NodeCaptionTemplate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NonTerminal(java.lang.String name) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.NonTerminal", name);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "Reduced",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReducedEventArgs> handler : _ReducedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ReducedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NonTerminal(java.lang.String name, java.lang.String errorAlias) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.NonTerminal", name, errorAlias);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "Reduced",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReducedEventArgs> handler : _ReducedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ReducedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NonTerminal(java.lang.String name, java.lang.String errorAlias, jio.System.Type nodeType) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.NonTerminal", name, errorAlias, nodeType);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "Reduced",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReducedEventArgs> handler : _ReducedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ReducedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NonTerminal(
      java.lang.String name, java.lang.String errorAlias, AstNodeCreator nodeCreator) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.NonTerminal", name, errorAlias, nodeCreator);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "Reduced",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReducedEventArgs> handler : _ReducedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ReducedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NonTerminal(java.lang.String name, jio.System.Type nodeType) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.NonTerminal", name, nodeType);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "Reduced",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReducedEventArgs> handler : _ReducedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ReducedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NonTerminal(java.lang.String name, AstNodeCreator nodeCreator) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.NonTerminal", name, nodeCreator);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "Reduced",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReducedEventArgs> handler : _ReducedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ReducedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NonTerminal(java.lang.String name, BnfExpression expression) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.NonTerminal", name, expression);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "Reduced",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReducedEventArgs> handler : _ReducedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ReducedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NonTerminal(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
  public void Init(GrammarData grammarData) {
    try {
      javonetHandle.invoke("Init", grammarData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddHintToAll(GrammarHint hint) {
    try {
      javonetHandle.invoke("AddHintToAll", hint);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetNodeCaption(ParseTreeNode node) {
    try {
      java.lang.String res = javonetHandle.invoke("GetNodeCaption", node);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandler<ReducedEventArgs>> _ReducedListeners =
      new java.util.ArrayList<EventHandler<ReducedEventArgs>>();

  public void addReduced(EventHandler<ReducedEventArgs> toAdd) {
    _ReducedListeners.add(toAdd);
  }

  public void removeReduced(EventHandler<ReducedEventArgs> toRemove) {
    _ReducedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
