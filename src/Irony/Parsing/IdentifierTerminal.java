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

public class IdentifierTerminal extends CompoundTerminalBase {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getAllFirstChars() {
    try {
      java.lang.String res = javonetHandle.get("AllFirstChars");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setAllFirstChars(java.lang.String param) {
    try {
      javonetHandle.set("AllFirstChars", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getAllChars() {
    try {
      java.lang.String res = javonetHandle.get("AllChars");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setAllChars(java.lang.String param) {
    try {
      javonetHandle.set("AllChars", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TokenEditorInfo getKeywordEditorInfo() {
    try {
      Object res = javonetHandle.<NObject>get("KeywordEditorInfo");
      if (res == null) return null;
      return new TokenEditorInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setKeywordEditorInfo(TokenEditorInfo param) {
    try {
      javonetHandle.set("KeywordEditorInfo", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public IdOptions getOptions() {
    try {
      Object res = javonetHandle.<NEnum>get("Options");
      if (res == null) return null;
      return IdOptions.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setOptions(IdOptions param) {
    try {
      javonetHandle.set("Options", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public CaseRestriction getCaseRestriction() {
    try {
      Object res = javonetHandle.<NEnum>get("CaseRestriction");
      if (res == null) return null;
      return CaseRestriction.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setCaseRestriction(CaseRestriction param) {
    try {
      javonetHandle.set("CaseRestriction", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public UnicodeCategoryList getStartCharCategories() {
    try {
      Object res = javonetHandle.<NObject>get("StartCharCategories");
      if (res == null) return null;
      return new UnicodeCategoryList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setStartCharCategories(UnicodeCategoryList param) {
    try {
      javonetHandle.set("StartCharCategories", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public UnicodeCategoryList getCharCategories() {
    try {
      Object res = javonetHandle.<NObject>get("CharCategories");
      if (res == null) return null;
      return new UnicodeCategoryList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setCharCategories(UnicodeCategoryList param) {
    try {
      javonetHandle.set("CharCategories", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public UnicodeCategoryList getCharsToRemoveCategories() {
    try {
      Object res = javonetHandle.<NObject>get("CharsToRemoveCategories");
      if (res == null) return null;
      return new UnicodeCategoryList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setCharsToRemoveCategories(UnicodeCategoryList param) {
    try {
      javonetHandle.set("CharsToRemoveCategories", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public IdentifierTerminal(java.lang.String name) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.IdentifierTerminal", name);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public IdentifierTerminal(java.lang.String name, IdOptions options) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Irony.Parsing.IdentifierTerminal", name, NEnum.fromJavaEnum(options));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public IdentifierTerminal(
      java.lang.String name, java.lang.String extraChars, java.lang.String extraFirstChars) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Irony.Parsing.IdentifierTerminal", name, extraChars, extraFirstChars);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public IdentifierTerminal(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddPrefix(java.lang.String prefix, IdOptions options) {
    try {
      javonetHandle.invoke("AddPrefix", prefix, NEnum.fromJavaEnum(options));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
