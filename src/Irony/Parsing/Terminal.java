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
import jio.System.Collections.Generic.*;
import jio.System.*;

public class Terminal extends BnfTerm {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public Terminal getOutputTerminal() {
    try {
      Object res = javonetHandle.<NObject>get("OutputTerminal");
      if (res == null) return null;
      return new Terminal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TokenCategory getCategory() {
    try {
      Object res = javonetHandle.<NEnum>get("Category");
      if (res == null) return null;
      return TokenCategory.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setCategory(TokenCategory param) {
    try {
      javonetHandle.set("Category", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPriority() {
    try {
      java.lang.Integer res = javonetHandle.get("Priority");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setPriority(java.lang.Integer param) {
    try {
      javonetHandle.set("Priority", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TokenEditorInfo getEditorInfo() {
    try {
      Object res = javonetHandle.<NObject>get("EditorInfo");
      if (res == null) return null;
      return new TokenEditorInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setEditorInfo(TokenEditorInfo param) {
    try {
      javonetHandle.set("EditorInfo", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte getMultilineIndex() {
    try {
      java.lang.Byte res = javonetHandle.get("MultilineIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setMultilineIndex(java.lang.Byte param) {
    try {
      javonetHandle.set("MultilineIndex", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Terminal getIsPairFor() {
    try {
      Object res = javonetHandle.<NObject>get("IsPairFor");
      if (res == null) return null;
      return new Terminal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setIsPairFor(Terminal param) {
    try {
      javonetHandle.set("IsPairFor", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getLowestPriority() {
    try {
      java.lang.Integer res = Javonet.getType("Irony.Parsing.Terminal").get("LowestPriority");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLowestPriority(java.lang.Integer param) {
    try {
      Javonet.getType("Irony.Parsing.Terminal").set("LowestPriority", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getHighestPriority() {
    try {
      java.lang.Integer res = Javonet.getType("Irony.Parsing.Terminal").get("HighestPriority");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHighestPriority(java.lang.Integer param) {
    try {
      Javonet.getType("Irony.Parsing.Terminal").set("HighestPriority", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getReservedWordsPriority() {
    try {
      java.lang.Integer res =
          Javonet.getType("Irony.Parsing.Terminal").get("ReservedWordsPriority");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setReservedWordsPriority(java.lang.Integer param) {
    try {
      Javonet.getType("Irony.Parsing.Terminal").set("ReservedWordsPriority", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Terminal(java.lang.String name) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.Terminal", name);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ValidateToken",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ValidateTokenEventArgs> handler : _ValidateTokenListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidateTokenEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ParserInputPreview",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ParsingEventArgs> handler : _ParserInputPreviewListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ParsingEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Terminal(java.lang.String name, TokenCategory category) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.Terminal", name, NEnum.fromJavaEnum(category));
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ValidateToken",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ValidateTokenEventArgs> handler : _ValidateTokenListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidateTokenEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ParserInputPreview",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ParsingEventArgs> handler : _ParserInputPreviewListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ParsingEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Terminal(
      java.lang.String name, java.lang.String errorAlias, TokenCategory category, TermFlags flags) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Irony.Parsing.Terminal",
              name,
              errorAlias,
              NEnum.fromJavaEnum(category),
              NEnum.fromJavaEnum(flags));
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ValidateToken",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ValidateTokenEventArgs> handler : _ValidateTokenListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidateTokenEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ParserInputPreview",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ParsingEventArgs> handler : _ParserInputPreviewListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ParsingEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Terminal(java.lang.String name, TokenCategory category, TermFlags flags) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Irony.Parsing.Terminal",
              name,
              NEnum.fromJavaEnum(category),
              NEnum.fromJavaEnum(flags));
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ValidateToken",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ValidateTokenEventArgs> handler : _ValidateTokenListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidateTokenEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ParserInputPreview",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ParsingEventArgs> handler : _ParserInputPreviewListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ParsingEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Terminal(NObject handle) {
    super(handle);
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
  public IList<java.lang.String> GetFirsts() {
    try {
      Object res = javonetHandle.invoke("GetFirsts");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Token TryMatch(ParsingContext context, ISourceStream source) {
    try {
      Object res = javonetHandle.invoke("TryMatch", context, source);
      if (res == null) return null;
      return new Token((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String TokenToString(Token token) {
    try {
      java.lang.String res = javonetHandle.invoke("TokenToString", token);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ByPriorityReverse(Terminal x, Terminal y) {
    try {
      java.lang.Integer res =
          Javonet.getType("Irony.Parsing.Terminal").invoke("ByPriorityReverse", x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetOutputTerminal(Grammar grammar, Terminal outputTerminal) {
    try {
      javonetHandle.invoke("SetOutputTerminal", grammar, outputTerminal);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String TerminalsToString(IEnumerable<Terminal> terminals) {
    try {
      java.lang.String res =
          Javonet.getType("Irony.Parsing.Terminal").invoke("TerminalsToString", terminals);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandler<ValidateTokenEventArgs>> _ValidateTokenListeners =
      new java.util.ArrayList<EventHandler<ValidateTokenEventArgs>>();

  public void addValidateToken(EventHandler<ValidateTokenEventArgs> toAdd) {
    _ValidateTokenListeners.add(toAdd);
  }

  public void removeValidateToken(EventHandler<ValidateTokenEventArgs> toRemove) {
    _ValidateTokenListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<ParsingEventArgs>> _ParserInputPreviewListeners =
      new java.util.ArrayList<EventHandler<ParsingEventArgs>>();

  public void addParserInputPreview(EventHandler<ParsingEventArgs> toAdd) {
    _ParserInputPreviewListeners.add(toAdd);
  }

  public void removeParserInputPreview(EventHandler<ParsingEventArgs> toRemove) {
    _ParserInputPreviewListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
