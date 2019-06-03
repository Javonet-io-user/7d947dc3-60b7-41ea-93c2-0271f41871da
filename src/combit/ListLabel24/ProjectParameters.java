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

public class ProjectParameters
    implements jio.System.Collections.Generic.IEnumerable<ProjectParameter>,
        jio.System.Collections.IEnumerable,
        Iterable<ProjectParameter> {
  protected NObject javonetHandle;

  @Override
  public Iterator<ProjectParameter> iterator() {
    return (Iterator<ProjectParameter>) this.GetEnumerator();
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "Method")
  public void setItem(java.lang.String parameterName, ProjectParameter value) {
    try {
      javonetHandle.invoke("set_Item", parameterName, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public ProjectParameter getItem(java.lang.String parameterName) {
    try {
      Object res = javonetHandle.invoke("get_Item", parameterName);
      if (res == null) return null;
      return new ProjectParameter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "Method")
  public void setItem(LlProjectParameter parameter, ProjectParameter value) {
    try {
      javonetHandle.invoke("set_Item", NEnum.fromJavaEnum(parameter), value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public ProjectParameter getItem(LlProjectParameter parameter) {
    try {
      Object res = javonetHandle.invoke("get_Item", NEnum.fromJavaEnum(parameter));
      if (res == null) return null;
      return new ProjectParameter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ProjectParameters(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Clear() {
    try {
      javonetHandle.invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ProjectParameter NewParameter(java.lang.String parameterName) {
    try {
      Object res = javonetHandle.invoke("NewParameter", parameterName);
      if (res == null) return null;
      return new ProjectParameter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ProjectParameter NewParameter(
      java.lang.String parameterName, java.lang.String parameterValue) {
    try {
      Object res = javonetHandle.invoke("NewParameter", parameterName, parameterValue);
      if (res == null) return null;
      return new ProjectParameter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(ProjectParameter parameter) {
    try {
      javonetHandle.invoke("Add", parameter);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Collections.Generic.IEnumerator<ProjectParameter> GetEnumerator() {
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
