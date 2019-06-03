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
import Irony.Ast.*;

public class StringLiteral extends CompoundTerminalBase {
  protected NObject javonetHandle;

  public StringLiteral(java.lang.String name) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.StringLiteral", name);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringLiteral(
      java.lang.String name, java.lang.String startEndSymbol, StringOptions options) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Irony.Parsing.StringLiteral", name, startEndSymbol, NEnum.fromJavaEnum(options));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringLiteral(java.lang.String name, java.lang.String startEndSymbol) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.StringLiteral", name, startEndSymbol);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringLiteral(
      java.lang.String name,
      java.lang.String startEndSymbol,
      StringOptions options,
      jio.System.Type astNodeType) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Irony.Parsing.StringLiteral",
              name,
              startEndSymbol,
              NEnum.fromJavaEnum(options),
              astNodeType);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringLiteral(
      java.lang.String name,
      java.lang.String startEndSymbol,
      StringOptions options,
      AstNodeCreator astNodeCreator) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Irony.Parsing.StringLiteral",
              name,
              startEndSymbol,
              NEnum.fromJavaEnum(options),
              astNodeCreator);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringLiteral(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddStartEnd(java.lang.String startEndSymbol, StringOptions stringOptions) {
    try {
      javonetHandle.invoke("AddStartEnd", startEndSymbol, NEnum.fromJavaEnum(stringOptions));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddStartEnd(
      java.lang.String startSymbol, java.lang.String endSymbol, StringOptions stringOptions) {
    try {
      javonetHandle.invoke(
          "AddStartEnd", startSymbol, endSymbol, NEnum.fromJavaEnum(stringOptions));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddPrefix(java.lang.String prefix, StringOptions flags) {
    try {
      javonetHandle.invoke("AddPrefix", prefix, NEnum.fromJavaEnum(flags));
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

  public enum StringFlagsInternal {
    HasEscapes(256L),
    ;
    private long numVal;

    StringFlagsInternal(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
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
