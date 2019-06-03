package combit.ListLabel24.DataProviders;

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
import combit.ListLabel24.DataProviders.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.*;

public class ExecuteNativeAggregateFunctionArguments {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public NativeAggregateFunction getFunction() {
    try {
      Object res = javonetHandle.<NEnum>get("Function");
      if (res == null) return null;
      return NativeAggregateFunction.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTableName() {
    try {
      java.lang.String res = javonetHandle.get("TableName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getExpression() {
    try {
      java.lang.String res = javonetHandle.get("Expression");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ReadOnlyCollection<java.lang.String> getUsedIdentifiers() {
    try {
      Object res = javonetHandle.<NObject>get("UsedIdentifiers");
      if (res == null) return null;
      return new ReadOnlyCollection<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFilter() {
    try {
      java.lang.String res = javonetHandle.get("Filter");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object[] getFilterParameters(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("FilterParameters");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDistinct() {
    try {
      java.lang.Boolean res = javonetHandle.get("Distinct");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getParameter1() {
    try {
      java.lang.String res = javonetHandle.get("Parameter1");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getParameter2() {
    try {
      java.lang.String res = javonetHandle.get("Parameter2");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCurrentId() {
    try {
      java.lang.String res = javonetHandle.get("CurrentId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public ExecuteNativeAggregateFunctionArguments(
      NativeAggregateFunction function,
      java.lang.String tableName,
      java.lang.String expression,
      ReadOnlyCollection<java.lang.String> usedIdentifiers,
      java.lang.Boolean distinct,
      java.lang.String filter,
      Object[] filterParameters,
      java.lang.String parameter1,
      java.lang.String parameter2,
      java.lang.String currentId) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.ExecuteNativeAggregateFunctionArguments",
              NEnum.fromJavaEnum(function),
              tableName,
              expression,
              usedIdentifiers,
              distinct,
              filter,
              new Object[] {filterParameters},
              parameter1,
              parameter2,
              currentId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExecuteNativeAggregateFunctionArguments(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
