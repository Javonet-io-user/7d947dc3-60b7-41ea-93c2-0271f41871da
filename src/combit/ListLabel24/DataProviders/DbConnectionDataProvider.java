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
import jio.System.Runtime.Serialization.*;
import jio.System.*;
import combit.ListLabel24.*;
import jio.System.Collections.ObjectModel.*;

public abstract class DbConnectionDataProvider
    implements IDataProvider,
        ICanHandleUsedIdentifiers,
        ISerializable,
        IDisposable,
        ISupportsLogger {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setSupportsAdvancedFiltering(java.lang.Boolean value) {
    try {
      javonetHandle.set("SupportsAdvancedFiltering", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSupportsAdvancedFiltering() {
    try {
      java.lang.Boolean res = javonetHandle.get("SupportsAdvancedFiltering");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSupportGetParentRow(java.lang.Boolean value) {
    try {
      javonetHandle.set("SupportGetParentRow", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSupportGetParentRow() {
    try {
      java.lang.Boolean res = javonetHandle.get("SupportGetParentRow");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSupportSorting(java.lang.Boolean value) {
    try {
      javonetHandle.set("SupportSorting", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSupportSorting() {
    try {
      java.lang.Boolean res = javonetHandle.get("SupportSorting");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMinimalSelect(java.lang.Boolean value) {
    try {
      javonetHandle.set("MinimalSelect", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getMinimalSelect() {
    try {
      java.lang.Boolean res = javonetHandle.get("MinimalSelect");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setColumnCaching(java.lang.Boolean value) {
    try {
      javonetHandle.set("ColumnCaching", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getColumnCaching() {
    try {
      java.lang.Boolean res = javonetHandle.get("ColumnCaching");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDisableIdentifierValidation(java.lang.Boolean value) {
    try {
      javonetHandle.set("DisableIdentifierValidation", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDisableIdentifierValidation() {
    try {
      java.lang.Boolean res = javonetHandle.get("DisableIdentifierValidation");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCancelBeforeClose(java.lang.Boolean value) {
    try {
      javonetHandle.set("CancelBeforeClose", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCancelBeforeClose() {
    try {
      java.lang.Boolean res = javonetHandle.get("CancelBeforeClose");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSupportsAnyBaseTable() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("get_SupportsAnyBaseTable");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ReadOnlyCollection<ITable> getTables() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("get_Tables");
      if (res == null) return null;
      return new ReadOnlyCollection<ITable>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ReadOnlyCollection<ITableRelation> getRelations() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("get_Relations");
      if (res == null) return null;
      return new ReadOnlyCollection<ITableRelation>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DbConnectionDataProvider(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetObjectData(SerializationInfo info, StreamingContext context) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
          .invoke("GetObjectData", info, context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetLogger(ILlLogger logger, java.lang.Boolean overrideExisting) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.ISupportsLogger")
          .invoke("SetLogger", logger, overrideExisting);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ITable GetTable(java.lang.String tableName) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("GetTable", tableName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ITableRelation GetRelation(java.lang.String relationName) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("GetRelation", relationName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetUsedIdentifiers(ReadOnlyCollection<java.lang.String> identifiers) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.DataProviders.ICanHandleUsedIdentifiers")
          .invoke("SetUsedIdentifiers", identifiers);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandler<DefineTableEventArgs>> _DefineTableListeners =
      new java.util.ArrayList<EventHandler<DefineTableEventArgs>>();

  public void addDefineTable(EventHandler<DefineTableEventArgs> toAdd) {
    _DefineTableListeners.add(toAdd);
  }

  public void removeDefineTable(EventHandler<DefineTableEventArgs> toRemove) {
    _DefineTableListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<TranslateFilterSyntaxEventArgs>>
      _TranslateFilterSyntaxListeners =
          new java.util.ArrayList<EventHandler<TranslateFilterSyntaxEventArgs>>();

  public void addTranslateFilterSyntax(EventHandler<TranslateFilterSyntaxEventArgs> toAdd) {
    _TranslateFilterSyntaxListeners.add(toAdd);
  }

  public void removeTranslateFilterSyntax(EventHandler<TranslateFilterSyntaxEventArgs> toRemove) {
    _TranslateFilterSyntaxListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<ExecuteDbCommandEventArgs>> _ExecuteDbCommandListeners =
      new java.util.ArrayList<EventHandler<ExecuteDbCommandEventArgs>>();

  public void addExecuteDbCommand(EventHandler<ExecuteDbCommandEventArgs> toAdd) {
    _ExecuteDbCommandListeners.add(toAdd);
  }

  public void removeExecuteDbCommand(EventHandler<ExecuteDbCommandEventArgs> toRemove) {
    _ExecuteDbCommandListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<AddDbCommandEventArgs>> _AddDbCommandListeners =
      new java.util.ArrayList<EventHandler<AddDbCommandEventArgs>>();

  public void addAddDbCommand(EventHandler<AddDbCommandEventArgs> toAdd) {
    _AddDbCommandListeners.add(toAdd);
  }

  public void removeAddDbCommand(EventHandler<AddDbCommandEventArgs> toRemove) {
    _AddDbCommandListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DbConnectionDataProviderInitializedHandler>
      _InitializationCompletedListeners =
          new java.util.ArrayList<DbConnectionDataProviderInitializedHandler>();

  public void addInitializationCompleted(DbConnectionDataProviderInitializedHandler toAdd) {
    _InitializationCompletedListeners.add(toAdd);
  }

  public void removeInitializationCompleted(DbConnectionDataProviderInitializedHandler toRemove) {
    _InitializationCompletedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
