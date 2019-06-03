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

public class ObjectDataProvider
    implements IDataProvider, ICanHandleUsedIdentifiers, ISupportsLogger {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setUseLinqForSorting(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseLinqForSorting", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseLinqForSorting() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseLinqForSorting");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFlattenStructure(java.lang.Boolean value) {
    try {
      javonetHandle.set("FlattenStructure", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getFlattenStructure() {
    try {
      java.lang.Boolean res = javonetHandle.get("FlattenStructure");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMaximumRecursionDepth(java.lang.Integer value) {
    try {
      javonetHandle.set("MaximumRecursionDepth", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMaximumRecursionDepth() {
    try {
      java.lang.Integer res = javonetHandle.get("MaximumRecursionDepth");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRootTableName(java.lang.String value) {
    try {
      javonetHandle.set("RootTableName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getRootTableName() {
    try {
      java.lang.String res = javonetHandle.get("RootTableName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getSource() {
    try {
      Object res = javonetHandle.<NObject>get("Source");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setObjectForStructureParsing(Object value) {
    try {
      javonetHandle.set("ObjectForStructureParsing", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getObjectForStructureParsing() {
    try {
      Object res = javonetHandle.<NObject>get("ObjectForStructureParsing");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ObjectDataProvider(Object source) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.ObjectDataProvider", source);
      javonetHandle.addEventListener(
          "HandleEnumerableProperty",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<HandleEnumerablePropertyEventArgs> handler :
                  _HandleEnumerablePropertyListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HandleEnumerablePropertyEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HandleFlattenedProperty",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<HandleFlattenedPropertyEventArgs> handler :
                  _HandleFlattenedPropertyListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HandleFlattenedPropertyEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LoadDeferredContent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<LoadDeferredContentEventArgs> handler :
                  _LoadDeferredContentListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LoadDeferredContentEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ObjectDataProvider(Object source, java.lang.Integer maximumRecursionDepth) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.ObjectDataProvider", source, maximumRecursionDepth);
      javonetHandle.addEventListener(
          "HandleEnumerableProperty",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<HandleEnumerablePropertyEventArgs> handler :
                  _HandleEnumerablePropertyListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HandleEnumerablePropertyEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HandleFlattenedProperty",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<HandleFlattenedPropertyEventArgs> handler :
                  _HandleFlattenedPropertyListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HandleFlattenedPropertyEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LoadDeferredContent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<LoadDeferredContentEventArgs> handler :
                  _LoadDeferredContentListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LoadDeferredContentEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ObjectDataProvider(NObject handle) {
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

  private java.util.ArrayList<EventHandler<HandleEnumerablePropertyEventArgs>>
      _HandleEnumerablePropertyListeners =
          new java.util.ArrayList<EventHandler<HandleEnumerablePropertyEventArgs>>();

  public void addHandleEnumerableProperty(EventHandler<HandleEnumerablePropertyEventArgs> toAdd) {
    _HandleEnumerablePropertyListeners.add(toAdd);
  }

  public void removeHandleEnumerableProperty(
      EventHandler<HandleEnumerablePropertyEventArgs> toRemove) {
    _HandleEnumerablePropertyListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<HandleFlattenedPropertyEventArgs>>
      _HandleFlattenedPropertyListeners =
          new java.util.ArrayList<EventHandler<HandleFlattenedPropertyEventArgs>>();

  public void addHandleFlattenedProperty(EventHandler<HandleFlattenedPropertyEventArgs> toAdd) {
    _HandleFlattenedPropertyListeners.add(toAdd);
  }

  public void removeHandleFlattenedProperty(
      EventHandler<HandleFlattenedPropertyEventArgs> toRemove) {
    _HandleFlattenedPropertyListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<LoadDeferredContentEventArgs>>
      _LoadDeferredContentListeners =
          new java.util.ArrayList<EventHandler<LoadDeferredContentEventArgs>>();

  public void addLoadDeferredContent(EventHandler<LoadDeferredContentEventArgs> toAdd) {
    _LoadDeferredContentListeners.add(toAdd);
  }

  public void removeLoadDeferredContent(EventHandler<LoadDeferredContentEventArgs> toRemove) {
    _LoadDeferredContentListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
