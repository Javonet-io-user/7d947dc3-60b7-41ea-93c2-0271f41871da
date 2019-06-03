package Irony;

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
import jio.System.Collections.Generic.*;
import Irony.*;
import jio.System.*;
import jio.System.Collections.*;
import jio.System.Runtime.Serialization.*;

public class StringSet extends HashSet<java.lang.String>
    implements jio.System.Collections.Generic.ICollection<java.lang.String>,
        jio.System.Collections.Generic.IEnumerable<java.lang.String>,
        jio.System.Collections.IEnumerable,
        ISerializable,
        IDeserializationCallback,
        ISet<java.lang.String>,
        IReadOnlyCollection<java.lang.String> {
  protected NObject javonetHandle;

  public StringSet() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.StringSet");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringSet(StringComparer comparer) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.StringSet", comparer);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringSet(NObject handle) {
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
  public void AddRange(java.lang.String[] items) {
    try {
      javonetHandle.invoke("AddRange", new Object[] {items});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString(java.lang.String separator) {
    try {
      java.lang.String res = javonetHandle.invoke("ToString", separator);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
