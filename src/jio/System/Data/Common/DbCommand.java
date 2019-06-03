package jio.System.Data.Common;

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
import jio.System.ComponentModel.*;
import jio.System.Data.Common.*;
import jio.System.Data.*;
import jio.System.Threading.Tasks.*;
import jio.System.Threading.*;
import jio.System.*;

public abstract class DbCommand extends Component implements IComponent, IDisposable, IDbCommand {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setCommandText(java.lang.String value) {
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
  public java.lang.String getCommandText() {
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
  public void setCommandTimeout(java.lang.Integer value) {
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
  public java.lang.Integer getCommandTimeout() {
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
  public void setCommandType(CommandType value) {
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
  public CommandType getCommandType() {
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
  public void setConnection(DbConnection value) {
    try {
      javonetHandle.set("Connection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DbConnection getConnection() {
    try {
      Object res = javonetHandle.<NObject>get("Connection");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDesignTimeVisible(java.lang.Boolean value) {
    try {
      javonetHandle.set("DesignTimeVisible", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDesignTimeVisible() {
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
  public DbParameterCollection getParameters() {
    try {
      Object res = javonetHandle.<NObject>get("Parameters");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTransaction(DbTransaction value) {
    try {
      javonetHandle.set("Transaction", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DbTransaction getTransaction() {
    try {
      Object res = javonetHandle.<NObject>get("Transaction");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUpdatedRowSource(UpdateRowSource value) {
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
  public UpdateRowSource getUpdatedRowSource() {
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

  public DbCommand(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
  public DbParameter CreateParameter() {
    try {
      Object res = javonetHandle.invoke("CreateParameter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
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
  public DbDataReader ExecuteReader() {
    try {
      Object res = javonetHandle.invoke("ExecuteReader");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DbDataReader ExecuteReader(CommandBehavior behavior) {
    try {
      Object res = javonetHandle.invoke("ExecuteReader", NEnum.fromJavaEnum(behavior));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<java.lang.Integer> ExecuteNonQueryAsync() {
    try {
      Object res = javonetHandle.invoke("ExecuteNonQueryAsync");
      if (res == null) return null;
      return new TaskTResult<java.lang.Integer>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<java.lang.Integer> ExecuteNonQueryAsync(CancellationToken cancellationToken) {
    try {
      Object res = javonetHandle.invoke("ExecuteNonQueryAsync", cancellationToken);
      if (res == null) return null;
      return new TaskTResult<java.lang.Integer>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<DbDataReader> ExecuteReaderAsync() {
    try {
      Object res = javonetHandle.invoke("ExecuteReaderAsync");
      if (res == null) return null;
      return new TaskTResult<DbDataReader>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<DbDataReader> ExecuteReaderAsync(CancellationToken cancellationToken) {
    try {
      Object res = javonetHandle.invoke("ExecuteReaderAsync", cancellationToken);
      if (res == null) return null;
      return new TaskTResult<DbDataReader>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<DbDataReader> ExecuteReaderAsync(CommandBehavior behavior) {
    try {
      Object res = javonetHandle.invoke("ExecuteReaderAsync", NEnum.fromJavaEnum(behavior));
      if (res == null) return null;
      return new TaskTResult<DbDataReader>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<DbDataReader> ExecuteReaderAsync(
      CommandBehavior behavior, CancellationToken cancellationToken) {
    try {
      Object res =
          javonetHandle.invoke(
              "ExecuteReaderAsync", NEnum.fromJavaEnum(behavior), cancellationToken);
      if (res == null) return null;
      return new TaskTResult<DbDataReader>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<Object> ExecuteScalarAsync() {
    try {
      Object res = javonetHandle.invoke("ExecuteScalarAsync");
      if (res == null) return null;
      return new TaskTResult<Object>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<Object> ExecuteScalarAsync(CancellationToken cancellationToken) {
    try {
      Object res = javonetHandle.invoke("ExecuteScalarAsync", cancellationToken);
      if (res == null) return null;
      return new TaskTResult<Object>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IDbConnection getIDbCommand_Connection() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("get_Connection");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setConnection(IDbConnection value) {
    try {
      javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("set_Connection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IDbTransaction getIDbCommand_Transaction() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("get_Transaction");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTransaction(IDbTransaction value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbCommand")
          .invoke("set_Transaction", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IDataParameterCollection getIDbCommand_Parameters() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("get_Parameters");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IDbDataParameter IDbCommand_CreateParameter() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("CreateParameter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
