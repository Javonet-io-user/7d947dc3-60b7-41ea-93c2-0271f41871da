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

public class CheckNativeAggregateFunctionSyntaxArguments
    extends ExecuteNativeAggregateFunctionArguments {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setErrorText(java.lang.String value) {
    try {
      javonetHandle.set("ErrorText", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getErrorText() {
    try {
      java.lang.String res = javonetHandle.get("ErrorText");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public CheckNativeAggregateFunctionSyntaxArguments(
      NativeAggregateFunction function,
      java.lang.String tableName,
      java.lang.String expression,
      ReadOnlyCollection<java.lang.String> usedIdentifiers,
      java.lang.Boolean distinct,
      java.lang.String filter,
      Object[] filterParameters,
      java.lang.String parameter1,
      java.lang.String parameter2,
      java.lang.String errorText) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.CheckNativeAggregateFunctionSyntaxArguments",
              NEnum.fromJavaEnum(function),
              tableName,
              expression,
              usedIdentifiers,
              distinct,
              filter,
              new Object[] {filterParameters},
              parameter1,
              parameter2,
              errorText);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CheckNativeAggregateFunctionSyntaxArguments(NObject handle) {
    super(handle);
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
