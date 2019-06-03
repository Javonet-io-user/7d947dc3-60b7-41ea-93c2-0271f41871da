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
import jio.System.Net.*;
import jio.System.Collections.ObjectModel.*;

public class ODataDataProvider
    implements IDataProvider, ICanHandleUsedIdentifiers, IDisposable, ISupportsLogger {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUrl() {
    try {
      java.lang.String res = javonetHandle.get("Url");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public NetworkCredential getNetworkCredential() {
    try {
      Object res = javonetHandle.<NObject>get("NetworkCredential");
      if (res == null) return null;
      return new NetworkCredential((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setConnectionTimeout(java.lang.Integer value) {
    try {
      javonetHandle.set("ConnectionTimeout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getConnectionTimeout() {
    try {
      java.lang.Integer res = javonetHandle.get("ConnectionTimeout");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMaximumEmbeddedFieldDepth(java.lang.Integer value) {
    try {
      javonetHandle.set("MaximumEmbeddedFieldDepth", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMaximumEmbeddedFieldDepth() {
    try {
      java.lang.Integer res = javonetHandle.get("MaximumEmbeddedFieldDepth");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSuppressComplexEdmTypeExpansion(java.lang.Boolean value) {
    try {
      javonetHandle.set("SuppressComplexEdmTypeExpansion", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSuppressComplexEdmTypeExpansion() {
    try {
      java.lang.Boolean res = javonetHandle.get("SuppressComplexEdmTypeExpansion");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public ODataDataProvider(java.lang.String url, java.lang.Boolean retrieveRealValuesForDesigner) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.ODataDataProvider",
              url,
              retrieveRealValuesForDesigner);
      javonetHandle.addEventListener(
          "DefineTable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DefineTableEventArgs> handler : _DefineTableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineTableEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ODataDataProvider(
      java.lang.String url,
      java.lang.Boolean retrieveRealValuesForDesigner,
      NetworkCredential networkCredential) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.ODataDataProvider",
              url,
              retrieveRealValuesForDesigner,
              networkCredential);
      javonetHandle.addEventListener(
          "DefineTable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DefineTableEventArgs> handler : _DefineTableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineTableEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ODataDataProvider(
      java.lang.String url,
      java.lang.Boolean retrieveRealValuesForDesigner,
      NetworkCredential networkCredential,
      java.lang.String localMetadataFilePath) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.ODataDataProvider",
              url,
              retrieveRealValuesForDesigner,
              networkCredential,
              localMetadataFilePath);
      javonetHandle.addEventListener(
          "DefineTable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DefineTableEventArgs> handler : _DefineTableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineTableEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ODataDataProvider(NObject handle) {
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
  /** ExplicitSetProperty */

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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
