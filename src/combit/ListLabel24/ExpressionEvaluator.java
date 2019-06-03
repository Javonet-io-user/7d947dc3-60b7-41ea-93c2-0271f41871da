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
import jio.System.Collections.ObjectModel.*;
import jio.System.*;
import jio.System.Collections.*;

public class ExpressionEvaluator implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public VariableCollection getVariables() {
    try {
      Object res = javonetHandle.<NObject>get("Variables");
      if (res == null) return null;
      return new VariableCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ExpressionEvaluator() {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ExpressionEvaluator");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExpressionEvaluator(ListLabel LL) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ExpressionEvaluator", LL);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExpressionEvaluator(ListLabel LL, IDictionary variables) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ExpressionEvaluator", LL, variables);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExpressionEvaluator(IDictionary variables) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ExpressionEvaluator", variables);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExpressionEvaluator(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EditExpression(
      java.lang.String defaultExpression, java.lang.String title, LlFieldType returnType) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "EditExpression", defaultExpression, title, NEnum.fromJavaEnum(returnType));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EditExpression(
      java.lang.String defaultExpression, java.lang.String title) {
    try {
      java.lang.String res = javonetHandle.invoke("EditExpression", defaultExpression, title);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ReadOnlyCollection<java.lang.String> GetUsedIdentifiers(
      java.lang.String expression, java.lang.Boolean orginalName) {
    try {
      Object res = javonetHandle.invoke("GetUsedIdentifiers", expression, orginalName);
      if (res == null) return null;
      return new ReadOnlyCollection<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ReadOnlyCollection<java.lang.String> GetUsedIdentifiers(java.lang.String expression) {
    try {
      Object res = javonetHandle.invoke("GetUsedIdentifiers", expression);
      if (res == null) return null;
      return new ReadOnlyCollection<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object Evaluate(java.lang.String expression) {
    try {
      Object res = javonetHandle.invoke("Evaluate", expression);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
