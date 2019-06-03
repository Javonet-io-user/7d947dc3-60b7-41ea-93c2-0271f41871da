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
import combit.ListLabel24.*;
import jio.System.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.Data.*;

public class DbCommandSetDataProvider
    implements IDataProvider,
        ICanHandleUsedIdentifiers,
        IDisposable,
        ISupportsLogger,
        ISupportsParameters {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setUseLegacyRegexSqlTokenizer(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseLegacyRegexSqlTokenizer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseLegacyRegexSqlTokenizer() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseLegacyRegexSqlTokenizer");
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
  public void setSupportGetCount(java.lang.Boolean value) {
    try {
      javonetHandle.set("SupportGetCount", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSupportGetCount() {
    try {
      java.lang.Boolean res = javonetHandle.get("SupportGetCount");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCaseSensitive(java.lang.Boolean value) {
    try {
      javonetHandle.set("CaseSensitive", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCaseSensitive() {
    try {
      java.lang.Boolean res = javonetHandle.get("CaseSensitive");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseJoinsForParentRow(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseJoinsForParentRow", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseJoinsForParentRow() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseJoinsForParentRow");
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
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPrefixTableNameWithSchema(java.lang.Boolean value) {
    try {
      javonetHandle.set("PrefixTableNameWithSchema", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getPrefixTableNameWithSchema() {
    try {
      java.lang.Boolean res = javonetHandle.get("PrefixTableNameWithSchema");
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
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDisposeCommand(java.lang.Boolean value) {
    try {
      javonetHandle.set("DisposeCommand", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDisposeCommand() {
    try {
      java.lang.Boolean res = javonetHandle.get("DisposeCommand");
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

  public DbCommandSetDataProvider() {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.DbCommandSetDataProvider");
      javonetHandle.addEventListener(
          "ExecuteDbCommand",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ExecuteDbCommandEventArgs> handler : _ExecuteDbCommandListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ExecuteDbCommandEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TranslateFilterSyntax",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<TranslateFilterSyntaxEventArgs> handler :
                  _TranslateFilterSyntaxListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TranslateFilterSyntaxEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DbCommandSetDataProvider(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddCommand(
      IDbCommand command,
      java.lang.String tableName,
      java.lang.String identifierDelimiterFormat,
      java.lang.String parameterMarkerFormat) {
    try {
      javonetHandle.invoke(
          "AddCommand", command, tableName, identifierDelimiterFormat, parameterMarkerFormat);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddCommand(IDbCommand command, java.lang.String tableName) {
    try {
      javonetHandle.invoke("AddCommand", command, tableName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddRelation(
      java.lang.String relationName,
      java.lang.String parentTableName,
      java.lang.String childTableName,
      java.lang.String parentColumnName,
      java.lang.String childColumnName) {
    try {
      javonetHandle.invoke(
          "AddRelation",
          relationName,
          parentTableName,
          childTableName,
          parentColumnName,
          childColumnName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddRelation(
      java.lang.String relationName,
      java.lang.String parentTableName,
      java.lang.String childTableName,
      java.lang.String parentColumnName,
      java.lang.String childColumnName,
      java.lang.String parentTableSchema,
      java.lang.String childTableSchema) {
    try {
      javonetHandle.invoke(
          "AddRelation",
          relationName,
          parentTableName,
          childTableName,
          parentColumnName,
          childColumnName,
          parentTableSchema,
          childTableSchema);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

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
  /** ExplicitSetProperty */

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
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsParametrized() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.ISupportsParameters")
              .invoke("get_IsParametrized");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IParameterBinder getParameterBinder() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.ISupportsParameters")
              .invoke("get_ParameterBinder");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
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

  private java.util.ArrayList<EventHandler<TranslateFilterSyntaxEventArgs>>
      _TranslateFilterSyntaxListeners =
          new java.util.ArrayList<EventHandler<TranslateFilterSyntaxEventArgs>>();

  public void addTranslateFilterSyntax(EventHandler<TranslateFilterSyntaxEventArgs> toAdd) {
    _TranslateFilterSyntaxListeners.add(toAdd);
  }

  public void removeTranslateFilterSyntax(EventHandler<TranslateFilterSyntaxEventArgs> toRemove) {
    _TranslateFilterSyntaxListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
