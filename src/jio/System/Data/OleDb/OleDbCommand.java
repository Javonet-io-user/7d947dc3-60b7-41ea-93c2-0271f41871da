package jio.System.Data.OleDb;

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
import jio.System.Data.Common.*;
import jio.System.Data.OleDb.*;
import jio.System.Data.*;
import jio.System.*;
import jio.System.ComponentModel.*;

public class OleDbCommand extends DbCommand
    implements IComponent, IDisposable, IDbCommand, ICloneable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setCommandTextAsOleDbCommand(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbCommand")
          .invoke("set_CommandText", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCommandTextAsOleDbCommand() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("get_CommandText");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCommandTimeoutAsOleDbCommand(java.lang.Integer value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbCommand")
          .invoke("set_CommandTimeout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCommandTimeoutAsOleDbCommand() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDbCommand")
              .invoke("get_CommandTimeout");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCommandTypeAsOleDbCommand(CommandType value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbCommand")
          .invoke("set_CommandType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CommandType getCommandTypeAsOleDbCommand() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("get_CommandType");
      if (res == null) return null;
      return CommandType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setConnectionAsOleDbCommand(OleDbConnection value) {
    try {
      javonetHandle.set("Connection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public OleDbConnection getConnectionAsOleDbCommand() {
    try {
      Object res = javonetHandle.<NObject>get("Connection");
      if (res == null) return null;
      return new OleDbConnection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDesignTimeVisibleAsOleDbCommand(java.lang.Boolean value) {
    try {
      javonetHandle.set("DesignTimeVisible", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDesignTimeVisibleAsOleDbCommand() {
    try {
      java.lang.Boolean res = javonetHandle.get("DesignTimeVisible");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public OleDbParameterCollection getParametersAsOleDbCommand() {
    try {
      Object res = javonetHandle.<NObject>get("Parameters");
      if (res == null) return null;
      return new OleDbParameterCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTransactionAsOleDbCommand(OleDbTransaction value) {
    try {
      javonetHandle.set("Transaction", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public OleDbTransaction getTransactionAsOleDbCommand() {
    try {
      Object res = javonetHandle.<NObject>get("Transaction");
      if (res == null) return null;
      return new OleDbTransaction((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUpdatedRowSourceAsOleDbCommand(UpdateRowSource value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbCommand")
          .invoke("set_UpdatedRowSource", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public UpdateRowSource getUpdatedRowSourceAsOleDbCommand() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDbCommand")
              .invoke("get_UpdatedRowSource");
      if (res == null) return null;
      return UpdateRowSource.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public OleDbCommand() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.OleDb.OleDbCommand");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbCommand(java.lang.String cmdText) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.OleDb.OleDbCommand", cmdText);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbCommand(java.lang.String cmdText, OleDbConnection connection) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.OleDb.OleDbCommand", cmdText, connection);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbCommand(
      java.lang.String cmdText, OleDbConnection connection, OleDbTransaction transaction) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Data.OleDb.OleDbCommand", cmdText, connection, transaction);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbCommand(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ResetCommandTimeout() {
    try {
      javonetHandle.invoke("ResetCommandTimeout");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Cancel() {
    try {
      javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("Cancel");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public OleDbCommand Clone() {
    try {
      Object res = javonetHandle.invoke("Clone");
      if (res == null) return null;
      return new OleDbCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public OleDbParameter OleDbCommand___CreateParameter() {
    try {
      Object res = javonetHandle.invoke("CreateParameter");
      if (res == null) return null;
      return new OleDbParameter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public OleDbDataReader OleDbCommand___ExecuteReader() {
    try {
      Object res = javonetHandle.invoke("ExecuteReader");
      if (res == null) return null;
      return new OleDbDataReader((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public OleDbDataReader OleDbCommand___ExecuteReader(CommandBehavior behavior) {
    try {
      Object res = javonetHandle.invoke("ExecuteReader", NEnum.fromJavaEnum(behavior));
      if (res == null) return null;
      return new OleDbDataReader((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ExecuteNonQuery() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("ExecuteNonQuery");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object ExecuteScalar() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("ExecuteScalar");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Prepare() {
    try {
      javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("Prepare");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IDataReader IDbCommand_ExecuteReader() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("ExecuteReader");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IDataReader IDbCommand_ExecuteReader(CommandBehavior behavior) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDbCommand")
              .invoke("ExecuteReader", NEnum.fromJavaEnum(behavior));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object ICloneable_Clone() {
    try {
      Object res = javonetHandle.explicitInterface("jio.System.ICloneable").invoke("Clone");
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
