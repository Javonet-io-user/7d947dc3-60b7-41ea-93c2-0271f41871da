package jio.System.Reflection;

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
import jio.System.Reflection.*;
import jio.System.Runtime.InteropServices.*;
import jio.System.*;

public abstract class MethodBase extends MemberInfo
    implements ICustomAttributeProvider, _MemberInfo, _MethodBase {
  protected NObject javonetHandle;

  public MethodBase(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetTypeInfoCount(AtomicReference<java.lang.Long> pcTInfo) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
          .invoke(
              "GetTypeInfoCount",
              new NOut(pcTInfo, JavonetHelper.JavaToDotnetType.get(java.lang.Long.class)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetTypeInfo(java.lang.Long iTInfo, java.lang.Long lcid, IntPtr ppTInfo) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
          .invoke("GetTypeInfo", iTInfo, lcid, ppTInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetIDsOfNames(
      Guid riid, IntPtr rgszNames, java.lang.Long cNames, java.lang.Long lcid, IntPtr rgDispId) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
          .invoke("GetIDsOfNames", riid, rgszNames, cNames, lcid, rgDispId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Invoke(
      java.lang.Long dispIdMember,
      Guid riid,
      java.lang.Long lcid,
      java.lang.Short wFlags,
      IntPtr pDispParams,
      IntPtr pVarResult,
      IntPtr pExcepInfo,
      IntPtr puArgErr) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
          .invoke(
              "Invoke",
              dispIdMember,
              riid,
              lcid,
              wFlags,
              pDispParams,
              pVarResult,
              pExcepInfo,
              puArgErr);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Type GetType() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
              .invoke("GetType");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsPublic() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
              .invoke("get_IsPublic");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsPrivate() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
              .invoke("get_IsPrivate");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsFamily() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
              .invoke("get_IsFamily");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsAssembly() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
              .invoke("get_IsAssembly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsFamilyAndAssembly() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
              .invoke("get_IsFamilyAndAssembly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsFamilyOrAssembly() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
              .invoke("get_IsFamilyOrAssembly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsStatic() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
              .invoke("get_IsStatic");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsFinal() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
              .invoke("get_IsFinal");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsVirtual() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
              .invoke("get_IsVirtual");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsHideBySig() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
              .invoke("get_IsHideBySig");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsAbstract() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
              .invoke("get_IsAbstract");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsSpecialName() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
              .invoke("get_IsSpecialName");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsConstructor() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._MethodBase")
              .invoke("get_IsConstructor");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
