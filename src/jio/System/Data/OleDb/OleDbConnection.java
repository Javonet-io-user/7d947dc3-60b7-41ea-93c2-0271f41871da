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
import jio.System.EnterpriseServices.*;
import jio.System.*;
import jio.System.Transactions.*;
import jio.System.ComponentModel.*;

public class OleDbConnection extends DbConnection
    implements IComponent, IDisposable, IDbConnection, ICloneable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setConnectionString(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbConnection")
          .invoke("set_ConnectionString", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getConnectionString() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDbConnection")
              .invoke("get_ConnectionString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getConnectionTimeout() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDbConnection")
              .invoke("get_ConnectionTimeout");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDatabase() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("jio.System.Data.IDbConnection").invoke("get_Database");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDataSource() {
    try {
      java.lang.String res = javonetHandle.get("DataSource");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getProvider() {
    try {
      java.lang.String res = javonetHandle.get("Provider");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getServerVersion() {
    try {
      java.lang.String res = javonetHandle.get("ServerVersion");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ConnectionState getState() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDbConnection").invoke("get_State");
      if (res == null) return null;
      return ConnectionState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public OleDbConnection(java.lang.String connectionString) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.OleDb.OleDbConnection", connectionString);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "InfoMessage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (OleDbInfoMessageEventHandler handler : _InfoMessageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], OleDbInfoMessageEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbConnection() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.OleDb.OleDbConnection");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "InfoMessage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (OleDbInfoMessageEventHandler handler : _InfoMessageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], OleDbInfoMessageEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbConnection(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ResetState() {
    try {
      javonetHandle.invoke("ResetState");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public OleDbTransaction BeginTransaction() {
    try {
      Object res = javonetHandle.invoke("BeginTransaction");
      if (res == null) return null;
      return new OleDbTransaction((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public OleDbTransaction BeginTransaction(IsolationLevel isolationLevel) {
    try {
      Object res = javonetHandle.invoke("BeginTransaction", NEnum.fromJavaEnum(isolationLevel));
      if (res == null) return null;
      return new OleDbTransaction((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ChangeDatabase(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbConnection")
          .invoke("ChangeDatabase", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Close() {
    try {
      javonetHandle.explicitInterface("jio.System.Data.IDbConnection").invoke("Close");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public OleDbCommand CreateCommand() {
    try {
      Object res = javonetHandle.invoke("CreateCommand");
      if (res == null) return null;
      return new OleDbCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EnlistDistributedTransaction(ITransaction transaction) {
    try {
      javonetHandle.invoke("EnlistDistributedTransaction", transaction);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataTable GetOleDbSchemaTable(Guid schema, Object[] restrictions) {
    try {
      Object res = javonetHandle.invoke("GetOleDbSchemaTable", schema, new Object[] {restrictions});
      if (res == null) return null;
      return new DataTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Open() {
    try {
      javonetHandle.explicitInterface("jio.System.Data.IDbConnection").invoke("Open");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ReleaseObjectPool() {
    try {
      Javonet.getType("System.Data.OleDb.OleDbConnection").invoke("ReleaseObjectPool");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EnlistTransaction(Transaction transaction) {
    try {
      javonetHandle.invoke("EnlistTransaction", transaction);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataTable GetSchema() {
    try {
      Object res = javonetHandle.invoke("GetSchema");
      if (res == null) return null;
      return new DataTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataTable GetSchema(java.lang.String collectionName) {
    try {
      Object res = javonetHandle.invoke("GetSchema", collectionName);
      if (res == null) return null;
      return new DataTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataTable GetSchema(
      java.lang.String collectionName, java.lang.String[] restrictionValues) {
    try {
      Object res =
          javonetHandle.invoke("GetSchema", collectionName, new Object[] {restrictionValues});
      if (res == null) return null;
      return new DataTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
  /** Event */

  private java.util.ArrayList<OleDbInfoMessageEventHandler> _InfoMessageListeners =
      new java.util.ArrayList<OleDbInfoMessageEventHandler>();

  public void addInfoMessage(OleDbInfoMessageEventHandler toAdd) {
    _InfoMessageListeners.add(toAdd);
  }

  public void removeInfoMessage(OleDbInfoMessageEventHandler toRemove) {
    _InfoMessageListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
