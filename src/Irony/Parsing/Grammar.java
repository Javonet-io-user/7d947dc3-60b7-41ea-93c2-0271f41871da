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
import Irony.*;
import jio.System.Globalization.*;

public class Grammar {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public static Grammar getCurrentGrammar() {
    try {
      Object res = Javonet.getType("Irony.Parsing.Grammar").<NObject>get("CurrentGrammar");
      if (res == null) return null;
      return new Grammar((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCaseSensitive() {
    try {
      java.lang.Boolean res = javonetHandle.get("CaseSensitive");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setCaseSensitive(java.lang.Boolean param) {
    try {
      javonetHandle.set("CaseSensitive", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDelimiters() {
    try {
      java.lang.String res = javonetHandle.get("Delimiters");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDelimiters(java.lang.String param) {
    try {
      javonetHandle.set("Delimiters", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getWhitespaceChars() {
    try {
      java.lang.String res = javonetHandle.get("WhitespaceChars");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setWhitespaceChars(java.lang.String param) {
    try {
      javonetHandle.set("WhitespaceChars", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public LanguageFlags getLanguageFlags() {
    try {
      Object res = javonetHandle.<NEnum>get("LanguageFlags");
      if (res == null) return null;
      return LanguageFlags.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setLanguageFlags(LanguageFlags param) {
    try {
      javonetHandle.set("LanguageFlags", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TermReportGroupList getTermReportGroups() {
    try {
      Object res = javonetHandle.<NObject>get("TermReportGroups");
      if (res == null) return null;
      return new TermReportGroupList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setTermReportGroups(TermReportGroupList param) {
    try {
      javonetHandle.set("TermReportGroups", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TerminalSet getNonGrammarTerminals() {
    try {
      Object res = javonetHandle.<NObject>get("NonGrammarTerminals");
      if (res == null) return null;
      return new TerminalSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setNonGrammarTerminals(TerminalSet param) {
    try {
      javonetHandle.set("NonGrammarTerminals", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public NonTerminal getRoot() {
    try {
      Object res = javonetHandle.<NObject>get("Root");
      if (res == null) return null;
      return new NonTerminal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setRoot(NonTerminal param) {
    try {
      javonetHandle.set("Root", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public NonTerminalSet getSnippetRoots() {
    try {
      Object res = javonetHandle.<NObject>get("SnippetRoots");
      if (res == null) return null;
      return new NonTerminalSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setSnippetRoots(NonTerminalSet param) {
    try {
      javonetHandle.set("SnippetRoots", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getGrammarComments() {
    try {
      java.lang.String res = javonetHandle.get("GrammarComments");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setGrammarComments(java.lang.String param) {
    try {
      javonetHandle.set("GrammarComments", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public CultureInfo getDefaultCulture() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultCulture");
      if (res == null) return null;
      return new CultureInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultCulture(CultureInfo param) {
    try {
      javonetHandle.set("DefaultCulture", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getConsoleTitle() {
    try {
      java.lang.String res = javonetHandle.get("ConsoleTitle");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setConsoleTitle(java.lang.String param) {
    try {
      javonetHandle.set("ConsoleTitle", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getConsoleGreeting() {
    try {
      java.lang.String res = javonetHandle.get("ConsoleGreeting");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setConsoleGreeting(java.lang.String param) {
    try {
      javonetHandle.set("ConsoleGreeting", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getConsolePrompt() {
    try {
      java.lang.String res = javonetHandle.get("ConsolePrompt");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setConsolePrompt(java.lang.String param) {
    try {
      javonetHandle.set("ConsolePrompt", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getConsolePromptMoreInput() {
    try {
      java.lang.String res = javonetHandle.get("ConsolePromptMoreInput");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setConsolePromptMoreInput(java.lang.String param) {
    try {
      javonetHandle.set("ConsolePromptMoreInput", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Terminal getEmpty() {
    try {
      Object res = javonetHandle.<NObject>get("Empty");
      if (res == null) return null;
      return new Terminal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setEmpty(Terminal param) {
    try {
      javonetHandle.set("Empty", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUsesNewLine() {
    try {
      java.lang.Boolean res = javonetHandle.get("UsesNewLine");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setUsesNewLine(java.lang.Boolean param) {
    try {
      javonetHandle.set("UsesNewLine", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Terminal getIndent() {
    try {
      Object res = javonetHandle.<NObject>get("Indent");
      if (res == null) return null;
      return new Terminal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setIndent(Terminal param) {
    try {
      javonetHandle.set("Indent", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Terminal getDedent() {
    try {
      Object res = javonetHandle.<NObject>get("Dedent");
      if (res == null) return null;
      return new Terminal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDedent(Terminal param) {
    try {
      javonetHandle.set("Dedent", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Terminal getEof() {
    try {
      Object res = javonetHandle.<NObject>get("Eof");
      if (res == null) return null;
      return new Terminal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setEof(Terminal param) {
    try {
      javonetHandle.set("Eof", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Terminal getSkip() {
    try {
      Object res = javonetHandle.<NObject>get("Skip");
      if (res == null) return null;
      return new Terminal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setSkip(Terminal param) {
    try {
      javonetHandle.set("Skip", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Terminal getLineStartTerminal() {
    try {
      Object res = javonetHandle.<NObject>get("LineStartTerminal");
      if (res == null) return null;
      return new Terminal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setLineStartTerminal(Terminal param) {
    try {
      javonetHandle.set("LineStartTerminal", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Terminal getSyntaxError() {
    try {
      Object res = javonetHandle.<NObject>get("SyntaxError");
      if (res == null) return null;
      return new Terminal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setSyntaxError(Terminal param) {
    try {
      javonetHandle.set("SyntaxError", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public KeyTermTable getKeyTerms() {
    try {
      Object res = javonetHandle.<NObject>get("KeyTerms");
      if (res == null) return null;
      return new KeyTermTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setKeyTerms(KeyTermTable param) {
    try {
      javonetHandle.set("KeyTerms", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Grammar() {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.Grammar");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Grammar(java.lang.Boolean caseSensitive) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.Grammar", caseSensitive);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Grammar(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MarkReservedWords(java.lang.String[] reservedWords) {
    try {
      javonetHandle.invoke("MarkReservedWords", new Object[] {reservedWords});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RegisterOperators(java.lang.Integer precedence, java.lang.String[] opSymbols) {
    try {
      javonetHandle.invoke("RegisterOperators", precedence, new Object[] {opSymbols});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RegisterOperators(
      java.lang.Integer precedence, Associativity associativity, java.lang.String[] opSymbols) {
    try {
      javonetHandle.invoke(
          "RegisterOperators",
          precedence,
          NEnum.fromJavaEnum(associativity),
          new Object[] {opSymbols});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RegisterOperators(java.lang.Integer precedence, BnfTerm[] opTerms) {
    try {
      javonetHandle.invoke("RegisterOperators", precedence, new Object[] {opTerms});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RegisterOperators(
      java.lang.Integer precedence, Associativity associativity, BnfTerm[] opTerms) {
    try {
      javonetHandle.invoke(
          "RegisterOperators",
          precedence,
          NEnum.fromJavaEnum(associativity),
          new Object[] {opTerms});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RegisterBracePair(java.lang.String openBrace, java.lang.String closeBrace) {
    try {
      javonetHandle.invoke("RegisterBracePair", openBrace, closeBrace);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MarkPunctuation(java.lang.String[] symbols) {
    try {
      javonetHandle.invoke("MarkPunctuation", new Object[] {symbols});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MarkPunctuation(BnfTerm[] terms) {
    try {
      javonetHandle.invoke("MarkPunctuation", new Object[] {terms});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MarkTransient(NonTerminal[] nonTerminals) {
    try {
      javonetHandle.invoke("MarkTransient", new Object[] {nonTerminals});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MarkMemberSelect(java.lang.String[] symbols) {
    try {
      javonetHandle.invoke("MarkMemberSelect", new Object[] {symbols});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MarkNotReported(BnfTerm[] terms) {
    try {
      javonetHandle.invoke("MarkNotReported", new Object[] {terms});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MarkNotReported(java.lang.String[] symbols) {
    try {
      javonetHandle.invoke("MarkNotReported", new Object[] {symbols});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CreateTokenFilters(LanguageData language, TokenFilterList filters) {
    try {
      javonetHandle.invoke("CreateTokenFilters", language, filters);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
  public void OnScannerSelectTerminal(ParsingContext context) {
    try {
      javonetHandle.invoke("OnScannerSelectTerminal", context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SkipWhitespace(ISourceStream source) {
    try {
      javonetHandle.invoke("SkipWhitespace", source);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsWhitespaceOrDelimiter(java.lang.Character ch) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsWhitespaceOrDelimiter", ch);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnGrammarDataConstructed(LanguageData language) {
    try {
      javonetHandle.invoke("OnGrammarDataConstructed", language);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnLanguageDataConstructed(LanguageData language) {
    try {
      javonetHandle.invoke("OnLanguageDataConstructed", language);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ConstructParserErrorMessage(
      ParsingContext context, StringSet expectedTerms) {
    try {
      java.lang.String res =
          javonetHandle.invoke("ConstructParserErrorMessage", context, expectedTerms);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReportParseError(ParsingContext context) {
    try {
      javonetHandle.invoke("ReportParseError", context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public BnfExpression MakePlusRule(NonTerminal listNonTerminal, BnfTerm listMember) {
    try {
      Object res = javonetHandle.invoke("MakePlusRule", listNonTerminal, listMember);
      if (res == null) return null;
      return new BnfExpression((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public BnfExpression MakePlusRule(
      NonTerminal listNonTerminal, BnfTerm delimiter, BnfTerm listMember) {
    try {
      Object res = javonetHandle.invoke("MakePlusRule", listNonTerminal, delimiter, listMember);
      if (res == null) return null;
      return new BnfExpression((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public BnfExpression MakeStarRule(NonTerminal listNonTerminal, BnfTerm listMember) {
    try {
      Object res = javonetHandle.invoke("MakeStarRule", listNonTerminal, listMember);
      if (res == null) return null;
      return new BnfExpression((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public BnfExpression MakeStarRule(
      NonTerminal listNonTerminal, BnfTerm delimiter, BnfTerm listMember) {
    try {
      Object res = javonetHandle.invoke("MakeStarRule", listNonTerminal, delimiter, listMember);
      if (res == null) return null;
      return new BnfExpression((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public KeyTerm ToTerm(java.lang.String text) {
    try {
      Object res = javonetHandle.invoke("ToTerm", text);
      if (res == null) return null;
      return new KeyTerm((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public KeyTerm ToTerm(java.lang.String text, java.lang.String name) {
    try {
      Object res = javonetHandle.invoke("ToTerm", text, name);
      if (res == null) return null;
      return new KeyTerm((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BuildAst(LanguageData language, ParseTree parseTree) {
    try {
      javonetHandle.invoke("BuildAst", language, parseTree);
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
