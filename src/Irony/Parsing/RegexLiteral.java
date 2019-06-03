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
import jio.System.Text.RegularExpressions.*;
import jio.System.Collections.*;
import jio.System.Runtime.Serialization.*;
import jio.System.*;

public class RegexLiteral extends Terminal {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getStartSymbol() {
    try {
      java.lang.Character res = javonetHandle.get("StartSymbol");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setStartSymbol(java.lang.Character param) {
    try {
      javonetHandle.set("StartSymbol", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getEndSymbol() {
    try {
      java.lang.Character res = javonetHandle.get("EndSymbol");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setEndSymbol(java.lang.Character param) {
    try {
      javonetHandle.set("EndSymbol", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getEscapeSymbol() {
    try {
      java.lang.Character res = javonetHandle.get("EscapeSymbol");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setEscapeSymbol(java.lang.Character param) {
    try {
      javonetHandle.set("EscapeSymbol", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public RegexLiteral.RegexSwitchTable getSwitches() {
    try {
      Object res = javonetHandle.<NObject>get("Switches");
      if (res == null) return null;
      return new RegexLiteral.RegexSwitchTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setSwitches(RegexLiteral.RegexSwitchTable param) {
    try {
      javonetHandle.set("Switches", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public RegexOptions getDefaultOptions() {
    try {
      Object res = javonetHandle.<NEnum>get("DefaultOptions");
      if (res == null) return null;
      return RegexOptions.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultOptions(RegexOptions param) {
    try {
      javonetHandle.set("DefaultOptions", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public RegexTermOptions getOptions() {
    try {
      Object res = javonetHandle.<NEnum>get("Options");
      if (res == null) return null;
      return RegexTermOptions.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setOptions(RegexTermOptions param) {
    try {
      javonetHandle.set("Options", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RegexLiteral(java.lang.String name) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.RegexLiteral", name);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RegexLiteral(
      java.lang.String name, java.lang.Character startEndSymbol, java.lang.Character escapeSymbol) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.RegexLiteral", name, startEndSymbol, escapeSymbol);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RegexLiteral(NObject handle) {
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
  public java.lang.Boolean IsSet(RegexTermOptions option) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsSet", NEnum.fromJavaEnum(option));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public static class RegexSwitchTable extends Dictionary<java.lang.Character, RegexOptions>
      implements jio.System.Collections.Generic.IDictionary<java.lang.Character, RegexOptions>,
          jio.System.Collections.Generic.ICollection<
              KeyValuePair<java.lang.Character, RegexOptions>>,
          jio.System.Collections.Generic.IEnumerable<
              KeyValuePair<java.lang.Character, RegexOptions>>,
          jio.System.Collections.IEnumerable,
          jio.System.Collections.IDictionary,
          jio.System.Collections.ICollection,
          IReadOnlyDictionary<java.lang.Character, RegexOptions>,
          IReadOnlyCollection<KeyValuePair<java.lang.Character, RegexOptions>>,
          ISerializable,
          IDeserializationCallback {
    protected NObject javonetHandle;

    public RegexSwitchTable() {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("Irony.Parsing.RegexLiteral+RegexSwitchTable");
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public RegexSwitchTable(NObject handle) {
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
