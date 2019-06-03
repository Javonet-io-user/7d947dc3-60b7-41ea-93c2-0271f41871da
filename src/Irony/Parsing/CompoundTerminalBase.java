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

public abstract class CompoundTerminalBase extends Terminal {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getEscapeChar() {
    try {
      java.lang.Character res = javonetHandle.get("EscapeChar");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setEscapeChar(java.lang.Character param) {
    try {
      javonetHandle.set("EscapeChar", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public EscapeTable getEscapes() {
    try {
      Object res = javonetHandle.<NObject>get("Escapes");
      if (res == null) return null;
      return new EscapeTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setEscapes(EscapeTable param) {
    try {
      javonetHandle.set("Escapes", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCaseSensitivePrefixesSuffixes() {
    try {
      java.lang.Boolean res = javonetHandle.get("CaseSensitivePrefixesSuffixes");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setCaseSensitivePrefixesSuffixes(java.lang.Boolean param) {
    try {
      javonetHandle.set("CaseSensitivePrefixesSuffixes", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CompoundTerminalBase(java.lang.String name) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.CompoundTerminalBase", name);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CompoundTerminalBase(java.lang.String name, TermFlags flags) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Irony.Parsing.CompoundTerminalBase", name, NEnum.fromJavaEnum(flags));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CompoundTerminalBase(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddSuffix(java.lang.String suffix, TypeCode[] typeCodes) {
    try {
      javonetHandle.invoke("AddSuffix", suffix, new Object[] {typeCodes});
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
  public static EscapeTable GetDefaultEscapes() {
    try {
      Object res =
          Javonet.getType("Irony.Parsing.CompoundTerminalBase").invoke("GetDefaultEscapes");
      if (res == null) return null;
      return new EscapeTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public static class CompoundTokenDetails {
    protected NObject javonetHandle;
    /** GetProperty */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getText() {
      try {
        java.lang.String res = javonetHandle.get("Text");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPrefix() {
      try {
        java.lang.String res = javonetHandle.get("Prefix");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPrefix(java.lang.String param) {
      try {
        javonetHandle.set("Prefix", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getBody() {
      try {
        java.lang.String res = javonetHandle.get("Body");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setBody(java.lang.String param) {
      try {
        javonetHandle.set("Body", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getSuffix() {
      try {
        java.lang.String res = javonetHandle.get("Suffix");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setSuffix(java.lang.String param) {
      try {
        javonetHandle.set("Suffix", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getSign() {
      try {
        java.lang.String res = javonetHandle.get("Sign");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setSign(java.lang.String param) {
      try {
        javonetHandle.set("Sign", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Short getFlags() {
      try {
        java.lang.Short res = javonetHandle.get("Flags");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFlags(java.lang.Short param) {
      try {
        javonetHandle.set("Flags", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getError() {
      try {
        java.lang.String res = javonetHandle.get("Error");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setError(java.lang.String param) {
      try {
        javonetHandle.set("Error", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public TypeCode[] getTypeCodes(Class<?> returnArrayType) {
      try {
        Object[] res = javonetHandle.<NObject[]>get("TypeCodes");
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
    public void setTypeCodes(TypeCode[] param) {
      try {
        javonetHandle.set("TypeCodes", new Object[] {param});
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getExponentSymbol() {
      try {
        java.lang.String res = javonetHandle.get("ExponentSymbol");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setExponentSymbol(java.lang.String param) {
      try {
        javonetHandle.set("ExponentSymbol", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getStartSymbol() {
      try {
        java.lang.String res = javonetHandle.get("StartSymbol");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setStartSymbol(java.lang.String param) {
      try {
        javonetHandle.set("StartSymbol", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getEndSymbol() {
      try {
        java.lang.String res = javonetHandle.get("EndSymbol");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setEndSymbol(java.lang.String param) {
      try {
        javonetHandle.set("EndSymbol", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public Object getValue() {
      try {
        Object res = javonetHandle.<NObject>get("Value");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setValue(Object param) {
      try {
        javonetHandle.set("Value", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getPartialOk() {
      try {
        java.lang.Boolean res = javonetHandle.get("PartialOk");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPartialOk(java.lang.Boolean param) {
      try {
        javonetHandle.set("PartialOk", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getIsPartial() {
      try {
        java.lang.Boolean res = javonetHandle.get("IsPartial");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setIsPartial(java.lang.Boolean param) {
      try {
        javonetHandle.set("IsPartial", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getPartialContinues() {
      try {
        java.lang.Boolean res = javonetHandle.get("PartialContinues");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPartialContinues(java.lang.Boolean param) {
      try {
        javonetHandle.set("PartialContinues", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Byte getSubTypeIndex() {
      try {
        java.lang.Byte res = javonetHandle.get("SubTypeIndex");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setSubTypeIndex(java.lang.Byte param) {
      try {
        javonetHandle.set("SubTypeIndex", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public CompoundTokenDetails() {
      try {
        javonetHandle = Javonet.New("Irony.Parsing.CompoundTerminalBase+CompoundTokenDetails");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public CompoundTokenDetails(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.Boolean IsSet(java.lang.Short flag) {
      try {
        java.lang.Boolean res = javonetHandle.invoke("IsSet", flag);
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
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
