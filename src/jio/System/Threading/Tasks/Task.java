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

public class Task implements IAsyncResult, IDisposable {
  protected NObject javonetHandle;

  public Task(Action action) {
    try {
      javonetHandle = Javonet.New("System.Threading.Tasks.Task", action);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Task(Action action, CancellationToken cancellationToken) {
    try {
      javonetHandle = Javonet.New("System.Threading.Tasks.Task", action, cancellationToken);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Task(Action action, TaskCreationOptions creationOptions) {
    try {
      javonetHandle =
          Javonet.New("System.Threading.Tasks.Task", action, NEnum.fromJavaEnum(creationOptions));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Task(
      Action action, CancellationToken cancellationToken, TaskCreationOptions creationOptions) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Threading.Tasks.Task",
              action,
              cancellationToken,
              NEnum.fromJavaEnum(creationOptions));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Task(ActionT<Object> action, Object state) {
    try {
      javonetHandle = Javonet.New("System.Threading.Tasks.Task", action, state);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Task(ActionT<Object> action, Object state, CancellationToken cancellationToken) {
    try {
      javonetHandle = Javonet.New("System.Threading.Tasks.Task", action, state, cancellationToken);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Task(ActionT<Object> action, Object state, TaskCreationOptions creationOptions) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Threading.Tasks.Task", action, state, NEnum.fromJavaEnum(creationOptions));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Task(
      ActionT<Object> action,
      Object state,
      CancellationToken cancellationToken,
      TaskCreationOptions creationOptions) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Threading.Tasks.Task",
              action,
              state,
              cancellationToken,
              NEnum.fromJavaEnum(creationOptions));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Task(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public WaitHandle getAsyncWaitHandle() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.IAsyncResult").invoke("get_AsyncWaitHandle");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCompletedSynchronously() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.IAsyncResult")
              .invoke("get_CompletedSynchronously");
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
