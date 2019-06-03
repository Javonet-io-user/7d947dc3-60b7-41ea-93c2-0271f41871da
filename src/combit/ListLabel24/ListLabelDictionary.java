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

public class ListLabelDictionary
    implements IQueryableLocalizationDictionary, ILocalizationDictionary {
  protected NObject javonetHandle;

  public ListLabelDictionary(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IQueryableTranslationList getIQueryableLocalizationDictionary_Tables() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.IQueryableLocalizationDictionary")
              .invoke("get_Tables");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IQueryableIdentifierTranslationList getIQueryableLocalizationDictionary_Identifiers() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.IQueryableLocalizationDictionary")
              .invoke("get_Identifiers");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IQueryableTranslationList getIQueryableLocalizationDictionary_Relations() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.IQueryableLocalizationDictionary")
              .invoke("get_Relations");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IQueryableTranslationList getIQueryableLocalizationDictionary_SortOrders() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.IQueryableLocalizationDictionary")
              .invoke("get_SortOrders");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IQueryableTranslationList getIQueryableLocalizationDictionary_StaticTexts() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.IQueryableLocalizationDictionary")
              .invoke("get_StaticTexts");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Clear() {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.IQueryableLocalizationDictionary")
          .invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ITranslationList getILocalizationDictionary_Tables() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.ILocalizationDictionary")
              .invoke("get_Tables");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ITranslationList getILocalizationDictionary_Identifiers() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.ILocalizationDictionary")
              .invoke("get_Identifiers");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ITranslationList getILocalizationDictionary_Relations() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.ILocalizationDictionary")
              .invoke("get_Relations");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ITranslationList getILocalizationDictionary_SortOrders() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.ILocalizationDictionary")
              .invoke("get_SortOrders");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ITranslationList getILocalizationDictionary_StaticTexts() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.ILocalizationDictionary")
              .invoke("get_StaticTexts");
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
