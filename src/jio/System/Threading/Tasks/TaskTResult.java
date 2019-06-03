package jio.System.Threading.Tasks;

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
import jio.System.Threading.Tasks.*;
import jio.System.*;
import jio.System.Threading.*;

public class TaskTResult<TResult> extends Task implements IAsyncResult, IDisposable {
  protected NObject javonetHandle;
  /** GenericConstructor */
  @MethodTypeAnnotation(type = "GetField")
  public TaskTResult(FuncTResult<TResult> function, Class<?> TResult) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType("System.Threading.Tasks.Task`1", getReturnObjectName(TResult)).create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public TaskTResult(
      FuncTResult<TResult> function, CancellationToken cancellationToken, Class<?> TResult) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType("System.Threading.Tasks.Task`1", getReturnObjectName(TResult)).create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public TaskTResult(
      FuncTResult<TResult> function, TaskCreationOptions creationOptions, Class<?> TResult) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType("System.Threading.Tasks.Task`1", getReturnObjectName(TResult)).create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public TaskTResult(
      FuncTResult<TResult> function,
      CancellationToken cancellationToken,
      TaskCreationOptions creationOptions,
      Class<?> TResult) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType("System.Threading.Tasks.Task`1", getReturnObjectName(TResult)).create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public TaskTResult(FuncTTResult<Object, TResult> function, Object state, Class<?> TResult) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType("System.Threading.Tasks.Task`1", getReturnObjectName(TResult)).create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public TaskTResult(
      FuncTTResult<Object, TResult> function,
      Object state,
      CancellationToken cancellationToken,
      Class<?> TResult) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType("System.Threading.Tasks.Task`1", getReturnObjectName(TResult)).create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public TaskTResult(
      FuncTTResult<Object, TResult> function,
      Object state,
      TaskCreationOptions creationOptions,
      Class<?> TResult) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType("System.Threading.Tasks.Task`1", getReturnObjectName(TResult)).create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public TaskTResult(
      FuncTTResult<Object, TResult> function,
      Object state,
      CancellationToken cancellationToken,
      TaskCreationOptions creationOptions,
      Class<?> TResult) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType("System.Threading.Tasks.Task`1", getReturnObjectName(TResult)).create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TaskTResult(NObject handle) {
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
