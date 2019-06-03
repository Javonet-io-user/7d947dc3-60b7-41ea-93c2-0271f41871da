package combit.ListLabel24.DesignerExtensions;

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
import combit.ListLabel24.DesignerExtensions.*;
import jio.System.*;
import jio.System.Collections.Generic.*;

public class DictionaryDesignerProperty extends DesignerProperty
    implements IDesignerProperty, IDisposable, IDictionaryItemsEnumeration {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public Dictionary<Object, java.lang.String> getDictionary() {
    try {
      Object res = javonetHandle.<NObject>get("Dictionary");
      if (res == null) return null;
      return new Dictionary<Object, java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DictionaryDesignerProperty(java.lang.String name, Object defaultValue) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DesignerExtensions.DictionaryDesignerProperty",
              name,
              defaultValue);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DictionaryDesignerProperty(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Next(
      java.lang.Integer size,
      Object key,
      AtomicReference<java.lang.String> value,
      AtomicReference<java.lang.Integer> count) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface(
                  "combit.ListLabel24.DesignerExtensions.IDictionaryItemsEnumeration")
              .invoke(
                  "Next",
                  size,
                  key,
                  new NOut(value, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(count, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Skip(java.lang.Integer value) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface(
                  "combit.ListLabel24.DesignerExtensions.IDictionaryItemsEnumeration")
              .invoke("Skip", value);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Reset() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface(
                  "combit.ListLabel24.DesignerExtensions.IDictionaryItemsEnumeration")
              .invoke("Reset");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
