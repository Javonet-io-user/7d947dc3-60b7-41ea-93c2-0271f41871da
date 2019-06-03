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
import jio.System.Collections.Generic.*;
import Irony.Ast.*;
import jio.System.Collections.*;
import jio.System.Runtime.Serialization.*;

public class NumberLiteral extends CompoundTerminalBase {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public NumberOptions getOptions() {
    try {
      Object res = javonetHandle.<NEnum>get("Options");
      if (res == null) return null;
      return NumberOptions.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setOptions(NumberOptions param) {
    try {
      javonetHandle.set("Options", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getDecimalSeparator() {
    try {
      java.lang.Character res = javonetHandle.get("DecimalSeparator");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDecimalSeparator(java.lang.Character param) {
    try {
      javonetHandle.set("DecimalSeparator", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TypeCode[] getDefaultIntTypes(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("DefaultIntTypes");
      if (res == null) return null;
      return (TypeCode[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultIntTypes(TypeCode[] param) {
    try {
      javonetHandle.set("DefaultIntTypes", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TypeCode getDefaultFloatType() {
    try {
      Object res = javonetHandle.<NEnum>get("DefaultFloatType");
      if (res == null) return null;
      return TypeCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultFloatType(TypeCode param) {
    try {
      javonetHandle.set("DefaultFloatType", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TypeCode getTypeCodeBigInt() {
    try {
      Object res = Javonet.getType("Irony.Parsing.NumberLiteral").<NEnum>get("TypeCodeBigInt");
      if (res == null) return null;
      return TypeCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTypeCodeBigInt(TypeCode param) {
    try {
      Javonet.getType("Irony.Parsing.NumberLiteral")
          .set("TypeCodeBigInt", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TypeCode getTypeCodeImaginary() {
    try {
      Object res = Javonet.getType("Irony.Parsing.NumberLiteral").<NEnum>get("TypeCodeImaginary");
      if (res == null) return null;
      return TypeCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTypeCodeImaginary(TypeCode param) {
    try {
      Javonet.getType("Irony.Parsing.NumberLiteral")
          .set("TypeCodeImaginary", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NumberLiteral(java.lang.String name) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.NumberLiteral", name);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NumberLiteral(java.lang.String name, NumberOptions options, jio.System.Type astNodeType) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Irony.Parsing.NumberLiteral", name, NEnum.fromJavaEnum(options), astNodeType);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NumberLiteral(
      java.lang.String name, NumberOptions options, AstNodeCreator astNodeCreator) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Irony.Parsing.NumberLiteral", name, NEnum.fromJavaEnum(options), astNodeCreator);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NumberLiteral(java.lang.String name, NumberOptions options) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.NumberLiteral", name, NEnum.fromJavaEnum(options));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NumberLiteral(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddPrefix(java.lang.String prefix, NumberOptions options) {
    try {
      javonetHandle.invoke("AddPrefix", prefix, NEnum.fromJavaEnum(options));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddExponentSymbols(java.lang.String symbols, TypeCode floatType) {
    try {
      javonetHandle.invoke("AddExponentSymbols", symbols, NEnum.fromJavaEnum(floatType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsSet(NumberOptions option) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsSet", NEnum.fromJavaEnum(option));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
  public jio.System.Collections.Generic.IList<java.lang.String> GetFirsts() {
    try {
      Object res = javonetHandle.invoke("GetFirsts");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public enum NumberFlagsInternal {
    HasDot(4096L),
    HasExp(8192L),
    ;
    private long numVal;

    NumberFlagsInternal(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  public static class ExponentsTable extends Dictionary<java.lang.Character, TypeCode>
      implements jio.System.Collections.Generic.IDictionary<java.lang.Character, TypeCode>,
          jio.System.Collections.Generic.ICollection<KeyValuePair<java.lang.Character, TypeCode>>,
          jio.System.Collections.Generic.IEnumerable<KeyValuePair<java.lang.Character, TypeCode>>,
          jio.System.Collections.IEnumerable,
          jio.System.Collections.IDictionary,
          jio.System.Collections.ICollection,
          IReadOnlyDictionary<java.lang.Character, TypeCode>,
          IReadOnlyCollection<KeyValuePair<java.lang.Character, TypeCode>>,
          ISerializable,
          IDeserializationCallback {
    protected NObject javonetHandle;

    public ExponentsTable() {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("Irony.Parsing.NumberLiteral+ExponentsTable");
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ExponentsTable(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
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
