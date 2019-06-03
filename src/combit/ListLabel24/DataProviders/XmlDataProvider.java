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
import jio.System.Collections.ObjectModel.*;
import jio.System.Xml.XPath.*;
import jio.System.*;

public class XmlDataProvider
    implements IDataProvider, ICanHandleUsedIdentifiers, ISerializable, IFileList {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setParseFirstElementOnly(java.lang.Boolean value) {
    try {
      javonetHandle.set("ParseFirstElementOnly", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getParseFirstElementOnly() {
    try {
      java.lang.Boolean res = javonetHandle.get("ParseFirstElementOnly");
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
  public void setFlattenNodesWithNoAttributes(java.lang.Boolean value) {
    try {
      javonetHandle.set("FlattenNodesWithNoAttributes", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getFlattenNodesWithNoAttributes() {
    try {
      java.lang.Boolean res = javonetHandle.get("FlattenNodesWithNoAttributes");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRegisterEmptyNodesAsColumnsWhenFlattening(java.lang.Boolean value) {
    try {
      javonetHandle.set("RegisterEmptyNodesAsColumnsWhenFlattening", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getRegisterEmptyNodesAsColumnsWhenFlattening() {
    try {
      java.lang.Boolean res = javonetHandle.get("RegisterEmptyNodesAsColumnsWhenFlattening");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUri(java.lang.String value) {
    try {
      javonetHandle.set("Uri", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUri() {
    try {
      java.lang.String res = javonetHandle.get("Uri");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDocument(IXPathNavigable value) {
    try {
      javonetHandle.set("Document", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IXPathNavigable getDocument() {
    try {
      Object res = javonetHandle.<NObject>get("Document");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoResolveNamespacesMode(AutoResolveNamespacesMode value) {
    try {
      javonetHandle.set("AutoResolveNamespacesMode", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public AutoResolveNamespacesMode getAutoResolveNamespacesMode() {
    try {
      Object res = javonetHandle.<NEnum>get("AutoResolveNamespacesMode");
      if (res == null) return null;
      return AutoResolveNamespacesMode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setValueFieldName(java.lang.String value) {
    try {
      javonetHandle.set("ValueFieldName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getValueFieldName() {
    try {
      java.lang.String res = javonetHandle.get("ValueFieldName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public XmlDataProvider() {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.XmlDataProvider");
      javonetHandle.addEventListener(
          "PreParseXPathNavigator",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PreParseXPathNavigatorEventArgs> handler :
                  _PreParseXPathNavigatorListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PreParseXPathNavigatorEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetNodeType",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<GetNodeTypeEventArgs> handler : _GetNodeTypeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetNodeTypeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlDataProvider(java.lang.String uri) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.XmlDataProvider", uri);
      javonetHandle.addEventListener(
          "PreParseXPathNavigator",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PreParseXPathNavigatorEventArgs> handler :
                  _PreParseXPathNavigatorListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PreParseXPathNavigatorEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetNodeType",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<GetNodeTypeEventArgs> handler : _GetNodeTypeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetNodeTypeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlDataProvider(IXPathNavigable document) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.XmlDataProvider", document);
      javonetHandle.addEventListener(
          "PreParseXPathNavigator",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PreParseXPathNavigatorEventArgs> handler :
                  _PreParseXPathNavigatorListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PreParseXPathNavigatorEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetNodeType",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<GetNodeTypeEventArgs> handler : _GetNodeTypeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetNodeTypeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlDataProvider(NObject handle) {
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
  public ReadOnlyCollection<java.lang.String> GetFileList() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IFileList")
              .invoke("GetFileList");
      if (res == null) return null;
      return new ReadOnlyCollection<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetFileList(ReadOnlyCollection<java.lang.String> fileList) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.DataProviders.IFileList")
          .invoke("SetFileList", fileList);
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

  private java.util.ArrayList<EventHandler<PreParseXPathNavigatorEventArgs>>
      _PreParseXPathNavigatorListeners =
          new java.util.ArrayList<EventHandler<PreParseXPathNavigatorEventArgs>>();

  public void addPreParseXPathNavigator(EventHandler<PreParseXPathNavigatorEventArgs> toAdd) {
    _PreParseXPathNavigatorListeners.add(toAdd);
  }

  public void removePreParseXPathNavigator(EventHandler<PreParseXPathNavigatorEventArgs> toRemove) {
    _PreParseXPathNavigatorListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<GetNodeTypeEventArgs>> _GetNodeTypeListeners =
      new java.util.ArrayList<EventHandler<GetNodeTypeEventArgs>>();

  public void addGetNodeType(EventHandler<GetNodeTypeEventArgs> toAdd) {
    _GetNodeTypeListeners.add(toAdd);
  }

  public void removeGetNodeType(EventHandler<GetNodeTypeEventArgs> toRemove) {
    _GetNodeTypeListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
