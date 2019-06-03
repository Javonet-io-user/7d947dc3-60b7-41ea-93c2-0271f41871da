package combit.ListLabel24;

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
import combit.ListLabel24.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;
import jio.System.*;

public abstract class ListLabelLocalizationHelperBase
    implements ITranslationList,
        IQueryableTranslationList,
        jio.System.Collections.Generic.IEnumerable<java.lang.Integer>,
        jio.System.Collections.IEnumerable,
        Iterable<java.lang.Integer> {
  protected NObject javonetHandle;

  @Override
  public Iterator<java.lang.Integer> iterator() {
    return (Iterator<java.lang.Integer>) this.GetEnumerator();
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Collections.Generic.IEnumerable<java.lang.Integer> getLCIDs() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.IQueryableTranslationList")
              .invoke("get_LCIDs");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public UniqueValueDictionary<java.lang.String, java.lang.String> getItem(java.lang.Integer LCID) {
    try {
      Object res = javonetHandle.invoke("get_Item", LCID);
      if (res == null) return null;
      return new UniqueValueDictionary<java.lang.String, java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getEmpty() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.IQueryableTranslationList")
              .invoke("get_Empty");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public ListLabelLocalizationHelperBase(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Collections.Generic.IEnumerator<java.lang.Integer> GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(java.lang.String itemName, java.lang.String itemDisplayName) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.ITranslationList")
          .invoke("Add", itemName, itemDisplayName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(
      java.lang.String itemName, java.lang.String itemDisplayName, java.lang.Integer LCID) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.ITranslationList")
          .invoke("Add", itemName, itemDisplayName, LCID);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Contains(java.lang.String itemName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.IQueryableTranslationList")
              .invoke("Contains", itemName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Contains(java.lang.String itemName, java.lang.Integer LCID) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Contains", itemName, LCID);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Clear() {
    try {
      javonetHandle.explicitInterface("combit.ListLabel24.ITranslationList").invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetItemDisplayName(
      java.lang.String itemName, java.lang.Boolean returnItemIfNotFound, java.lang.Integer LCID) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.IQueryableTranslationList")
              .invoke("GetItemDisplayName", itemName, returnItemIfNotFound, LCID);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetItemDisplayName(
      java.lang.String itemName, java.lang.Boolean returnItemIfNotFound) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.IQueryableTranslationList")
              .invoke("GetItemDisplayName", itemName, returnItemIfNotFound);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetItemDisplayName(java.lang.String itemName) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.IQueryableTranslationList")
              .invoke("GetItemDisplayName", itemName);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Collections.Generic.ICollection<
          KeyValuePair<java.lang.String, java.lang.String>>
      getIQueryableTranslationList_Item(java.lang.Integer lcid) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.IQueryableTranslationList")
              .invoke("get_Item", lcid);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Collections.IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
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
