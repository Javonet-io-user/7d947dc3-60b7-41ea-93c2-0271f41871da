package jio.System.Windows.Forms;

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
import jio.System.Runtime.InteropServices.*;
import jio.System.Windows.Forms.*;
import jio.System.Reflection.*;
import Accessibility.*;
import jio.System.*;
import jio.System.Globalization.*;

public class AccessibleObject extends StandardOleMarshalObject implements IReflect, IAccessible {
  protected NObject javonetHandle;

  public AccessibleObject() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.AccessibleObject");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AccessibleObject(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public MethodInfo GetMethod(
      java.lang.String name,
      BindingFlags bindingAttr,
      Binder binder,
      jio.System.Type[] types,
      ParameterModifier[] modifiers) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Reflection.IReflect")
              .invoke(
                  "GetMethod",
                  name,
                  NEnum.fromJavaEnum(bindingAttr),
                  binder,
                  new Object[] {types},
                  new Object[] {modifiers});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public MethodInfo GetMethod(java.lang.String name, BindingFlags bindingAttr) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Reflection.IReflect")
              .invoke("GetMethod", name, NEnum.fromJavaEnum(bindingAttr));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public MethodInfo[] GetMethods(BindingFlags bindingAttr, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("jio.System.Reflection.IReflect")
              .invoke("GetMethods", NEnum.fromJavaEnum(bindingAttr));
      if (res == null) return null;
      return (MethodInfo[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FieldInfo GetField(java.lang.String name, BindingFlags bindingAttr) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Reflection.IReflect")
              .invoke("GetField", name, NEnum.fromJavaEnum(bindingAttr));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FieldInfo[] GetFields(BindingFlags bindingAttr, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("jio.System.Reflection.IReflect")
              .invoke("GetFields", NEnum.fromJavaEnum(bindingAttr));
      if (res == null) return null;
      return (FieldInfo[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PropertyInfo GetProperty(java.lang.String name, BindingFlags bindingAttr) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Reflection.IReflect")
              .invoke("GetProperty", name, NEnum.fromJavaEnum(bindingAttr));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PropertyInfo GetProperty(
      java.lang.String name,
      BindingFlags bindingAttr,
      Binder binder,
      jio.System.Type returnType,
      jio.System.Type[] types,
      ParameterModifier[] modifiers) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Reflection.IReflect")
              .invoke(
                  "GetProperty",
                  name,
                  NEnum.fromJavaEnum(bindingAttr),
                  binder,
                  returnType,
                  new Object[] {types},
                  new Object[] {modifiers});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PropertyInfo[] GetProperties(BindingFlags bindingAttr, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("jio.System.Reflection.IReflect")
              .invoke("GetProperties", NEnum.fromJavaEnum(bindingAttr));
      if (res == null) return null;
      return (PropertyInfo[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public MemberInfo[] GetMember(
      java.lang.String name, BindingFlags bindingAttr, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("jio.System.Reflection.IReflect")
              .invoke("GetMember", name, NEnum.fromJavaEnum(bindingAttr));
      if (res == null) return null;
      return (MemberInfo[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public MemberInfo[] GetMembers(BindingFlags bindingAttr, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("jio.System.Reflection.IReflect")
              .invoke("GetMembers", NEnum.fromJavaEnum(bindingAttr));
      if (res == null) return null;
      return (MemberInfo[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object InvokeMember(
      java.lang.String name,
      BindingFlags invokeAttr,
      Binder binder,
      Object target,
      Object[] args,
      ParameterModifier[] modifiers,
      CultureInfo culture,
      java.lang.String[] namedParameters) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Reflection.IReflect")
              .invoke(
                  "InvokeMember",
                  name,
                  NEnum.fromJavaEnum(invokeAttr),
                  binder,
                  target,
                  new Object[] {args},
                  new Object[] {modifiers},
                  culture,
                  new Object[] {namedParameters});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Type getUnderlyingSystemType() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Reflection.IReflect")
              .invoke("get_UnderlyingSystemType");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getaccParent() {
    try {
      Object res =
          javonetHandle.explicitInterface("Accessibility.IAccessible").invoke("get_accParent");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getaccChildCount() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Accessibility.IAccessible").invoke("get_accChildCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public Object getaccChild(Object childID) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Accessibility.IAccessible")
              .invoke("get_accChild", childID);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String getaccName(Object childID) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Accessibility.IAccessible")
              .invoke("get_accName", childID);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String getaccValue(Object childID) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Accessibility.IAccessible")
              .invoke("get_accValue", childID);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String getaccDescription(Object childID) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Accessibility.IAccessible")
              .invoke("get_accDescription", childID);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public Object getaccRole(Object childID) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Accessibility.IAccessible")
              .invoke("get_accRole", childID);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public Object getaccState(Object childID) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Accessibility.IAccessible")
              .invoke("get_accState", childID);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String getaccHelp(Object childID) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Accessibility.IAccessible")
              .invoke("get_accHelp", childID);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer getaccHelpTopic(
      AtomicReference<java.lang.String> pszHelpFile, Object childID) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Accessibility.IAccessible")
              .invoke(
                  "get_accHelpTopic",
                  new NOut(pszHelpFile, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  childID);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String getaccKeyboardShortcut(Object childID) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Accessibility.IAccessible")
              .invoke("get_accKeyboardShortcut", childID);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getaccFocus() {
    try {
      Object res =
          javonetHandle.explicitInterface("Accessibility.IAccessible").invoke("get_accFocus");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getaccSelection() {
    try {
      Object res =
          javonetHandle.explicitInterface("Accessibility.IAccessible").invoke("get_accSelection");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String getaccDefaultAction(Object childID) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Accessibility.IAccessible")
              .invoke("get_accDefaultAction", childID);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void accSelect(java.lang.Integer flagsSelect, Object childID) {
    try {
      javonetHandle
          .explicitInterface("Accessibility.IAccessible")
          .invoke("accSelect", flagsSelect, childID);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void accLocation(
      AtomicReference<java.lang.Integer> pxLeft,
      AtomicReference<java.lang.Integer> pyTop,
      AtomicReference<java.lang.Integer> pcxWidth,
      AtomicReference<java.lang.Integer> pcyHeight,
      Object childID) {
    try {
      javonetHandle
          .explicitInterface("Accessibility.IAccessible")
          .invoke(
              "accLocation",
              new NOut(pxLeft, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
              new NOut(pyTop, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
              new NOut(pcxWidth, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
              new NOut(pcyHeight, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
              childID);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object accNavigate(java.lang.Integer navDir, Object childID) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Accessibility.IAccessible")
              .invoke("accNavigate", navDir, childID);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object accHitTest(java.lang.Integer xLeft, java.lang.Integer yTop) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Accessibility.IAccessible")
              .invoke("accHitTest", xLeft, yTop);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void accDoDefaultAction(Object childID) {
    try {
      javonetHandle
          .explicitInterface("Accessibility.IAccessible")
          .invoke("accDoDefaultAction", childID);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public void setaccName(Object childID, java.lang.String newName) {
    try {
      javonetHandle
          .explicitInterface("Accessibility.IAccessible")
          .invoke("set_accName", childID, newName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public void setaccValue(Object childID, java.lang.String newValue) {
    try {
      javonetHandle
          .explicitInterface("Accessibility.IAccessible")
          .invoke("set_accValue", childID, newValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
