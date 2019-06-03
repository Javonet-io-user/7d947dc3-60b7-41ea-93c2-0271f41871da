package jio.System;

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
import jio.System.*;
import jio.System.Collections.*;
import jio.System.Runtime.CompilerServices.*;

public class Tuple<T1, T2>
    implements IStructuralEquatable, IStructuralComparable, IComparable, ITuple {
  protected NObject javonetHandle;
  /** GenericConstructor */
  @MethodTypeAnnotation(type = "GetField")
  public Tuple(T1 item1, T2 item2, Class<?> T1, Class<?> T2) {
    try {
      javonetHandle =
          Javonet.getType("System.Tuple`2", getReturnObjectName(T1), getReturnObjectName(T2))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Tuple(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Equals(Object other, IEqualityComparer comparer) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IStructuralEquatable")
              .invoke("Equals", other, comparer);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetHashCode(IEqualityComparer comparer) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IStructuralEquatable")
              .invoke("GetHashCode", comparer);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer CompareTo(Object other, IComparer comparer) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IStructuralComparable")
              .invoke("CompareTo", other, comparer);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer CompareTo(Object obj) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.IComparable").invoke("CompareTo", obj);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getLength() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.CompilerServices.ITuple")
              .invoke("get_Length");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public Object getItem(java.lang.Integer index) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.CompilerServices.ITuple")
              .invoke("get_Item", index);
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
