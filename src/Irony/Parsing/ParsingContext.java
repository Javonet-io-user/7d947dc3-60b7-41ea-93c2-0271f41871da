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
import Irony.*;
import jio.System.Globalization.*;
import jio.System.Collections.Generic.*;

public class ParsingContext {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public ParseTree getCurrentParseTree() {
    try {
      Object res = javonetHandle.<NObject>get("CurrentParseTree");
      if (res == null) return null;
      return new ParseTree((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ParserState getCurrentParserState() {
    try {
      Object res = javonetHandle.<NObject>get("CurrentParserState");
      if (res == null) return null;
      return new ParserState((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ParseTreeNode getCurrentParserInput() {
    try {
      Object res = javonetHandle.<NObject>get("CurrentParserInput");
      if (res == null) return null;
      return new ParseTreeNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ParserStatus getStatus() {
    try {
      Object res = javonetHandle.<NEnum>get("Status");
      if (res == null) return null;
      return ParserStatus.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Parser getParser() {
    try {
      Object res = javonetHandle.<NObject>get("Parser");
      if (res == null) return null;
      return new Parser((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setParser(Parser param) {
    try {
      javonetHandle.set("Parser", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
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
  public ParseOptions getOptions() {
    try {
      Object res = javonetHandle.<NEnum>get("Options");
      if (res == null) return null;
      return ParseOptions.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setOptions(ParseOptions param) {
    try {
      javonetHandle.set("Options", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getTracingEnabled() {
    try {
      java.lang.Boolean res = javonetHandle.get("TracingEnabled");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setTracingEnabled(java.lang.Boolean param) {
    try {
      javonetHandle.set("TracingEnabled", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public ParseMode getMode() {
    try {
      Object res = javonetHandle.<NEnum>get("Mode");
      if (res == null) return null;
      return ParseMode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setMode(ParseMode param) {
    try {
      javonetHandle.set("Mode", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMaxErrors() {
    try {
      java.lang.Integer res = javonetHandle.get("MaxErrors");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setMaxErrors(java.lang.Integer param) {
    try {
      javonetHandle.set("MaxErrors", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public CultureInfo getCulture() {
    try {
      Object res = javonetHandle.<NObject>get("Culture");
      if (res == null) return null;
      return new CultureInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setCulture(CultureInfo param) {
    try {
      javonetHandle.set("Culture", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TokenStack getOpenBraces() {
    try {
      Object res = javonetHandle.<NObject>get("OpenBraces");
      if (res == null) return null;
      return new TokenStack((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setOpenBraces(TokenStack param) {
    try {
      javonetHandle.set("OpenBraces", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public ParserTrace getParserTrace() {
    try {
      Object res = javonetHandle.<NObject>get("ParserTrace");
      if (res == null) return null;
      return new ParserTrace((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setParserTrace(ParserTrace param) {
    try {
      javonetHandle.set("ParserTrace", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Token getCurrentToken() {
    try {
      Object res = javonetHandle.<NObject>get("CurrentToken");
      if (res == null) return null;
      return new Token((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setCurrentToken(Token param) {
    try {
      javonetHandle.set("CurrentToken", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TokenList getCurrentCommentTokens() {
    try {
      Object res = javonetHandle.<NObject>get("CurrentCommentTokens");
      if (res == null) return null;
      return new TokenList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setCurrentCommentTokens(TokenList param) {
    try {
      javonetHandle.set("CurrentCommentTokens", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Token getPreviousToken() {
    try {
      Object res = javonetHandle.<NObject>get("PreviousToken");
      if (res == null) return null;
      return new Token((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setPreviousToken(Token param) {
    try {
      javonetHandle.set("PreviousToken", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public SourceLocation getPreviousLineStart() {
    try {
      Object res = javonetHandle.<NObject>get("PreviousLineStart");
      if (res == null) return null;
      return new SourceLocation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setPreviousLineStart(SourceLocation param) {
    try {
      javonetHandle.set("PreviousLineStart", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TerminalList getCurrentTerminals() {
    try {
      Object res = javonetHandle.<NObject>get("CurrentTerminals");
      if (res == null) return null;
      return new TerminalList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setCurrentTerminals(TerminalList param) {
    try {
      javonetHandle.set("CurrentTerminals", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public ISourceStream getSource() {
    try {
      Object res = javonetHandle.<NObject>get("Source");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setSource(ISourceStream param) {
    try {
      javonetHandle.set("Source", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public VsScannerStateMap getVsLineScanState() {
    try {
      Object res = javonetHandle.<NObject>get("VsLineScanState");
      if (res == null) return null;
      return new VsScannerStateMap((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setVsLineScanState(VsScannerStateMap param) {
    try {
      javonetHandle.set("VsLineScanState", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getHasErrors() {
    try {
      java.lang.Boolean res = javonetHandle.get("HasErrors");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setHasErrors(java.lang.Boolean param) {
    try {
      javonetHandle.set("HasErrors", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Dictionary<java.lang.String, Object> getValues() {
    try {
      Object res = javonetHandle.<NObject>get("Values");
      if (res == null) return null;
      return new Dictionary<java.lang.String, Object>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setValues(Dictionary<java.lang.String, Object> param) {
    try {
      javonetHandle.set("Values", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getTabWidth() {
    try {
      java.lang.Integer res = javonetHandle.get("TabWidth");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setTabWidth(java.lang.Integer param) {
    try {
      javonetHandle.set("TabWidth", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParsingContext(Parser parser) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.ParsingContext", parser);
      javonetHandle.addEventListener(
          "TokenCreated",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ParsingEventArgs> handler : _TokenCreatedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ParsingEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParsingContext(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Token CreateErrorToken(java.lang.String message, Object[] args) {
    try {
      Object res = javonetHandle.invoke("CreateErrorToken", message, new Object[] {args});
      if (res == null) return null;
      return new Token((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddParserError(java.lang.String message, Object[] args) {
    try {
      javonetHandle.invoke("AddParserError", message, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddParserMessage(
      ErrorLevel level, SourceLocation location, java.lang.String message, Object[] args) {
    try {
      javonetHandle.invoke(
          "AddParserMessage", NEnum.fromJavaEnum(level), location, message, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddTrace(java.lang.String message, Object[] args) {
    try {
      javonetHandle.invoke("AddTrace", message, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddTrace(java.lang.Boolean asError, java.lang.String message, Object[] args) {
    try {
      javonetHandle.invoke("AddTrace", asError, message, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetSourceLocation(SourceLocation location) {
    try {
      javonetHandle.invoke("SetSourceLocation", location);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SourceSpan ComputeStackRangeSpan(java.lang.Integer nodeCount) {
    try {
      Object res = javonetHandle.invoke("ComputeStackRangeSpan", nodeCount);
      if (res == null) return null;
      return new SourceSpan((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public StringSet GetExpectedTermSet() {
    try {
      Object res = javonetHandle.invoke("GetExpectedTermSet");
      if (res == null) return null;
      return new StringSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandler<ParsingEventArgs>> _TokenCreatedListeners =
      new java.util.ArrayList<EventHandler<ParsingEventArgs>>();

  public void addTokenCreated(EventHandler<ParsingEventArgs> toAdd) {
    _TokenCreatedListeners.add(toAdd);
  }

  public void removeTokenCreated(EventHandler<ParsingEventArgs> toRemove) {
    _TokenCreatedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
