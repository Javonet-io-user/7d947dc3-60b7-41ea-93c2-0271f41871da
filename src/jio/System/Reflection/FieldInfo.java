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

public abstract class FieldInfo extends MemberInfo
    implements ICustomAttributeProvider, _MemberInfo, _FieldInfo {
  protected NObject javonetHandle;

  public FieldInfo(NObject handle) {
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
          .explicitInterface("jio.System.Runtime.InteropServices._FieldInfo")
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
          .explicitInterface("jio.System.Runtime.InteropServices._FieldInfo")
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
          .explicitInterface("jio.System.Runtime.InteropServices._FieldInfo")
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
          .explicitInterface("jio.System.Runtime.InteropServices._FieldInfo")
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
              .explicitInterface("jio.System.Runtime.InteropServices._FieldInfo")
              .invoke("GetType");
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
