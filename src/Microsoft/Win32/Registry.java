package Microsoft.Win32;

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
import Microsoft.Win32.*;
import jio.System.*;

public class Registry {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static RegistryKey getCurrentUser() {
    try {
      Object res = Javonet.getType("Microsoft.Win32.Registry").<NObject>get("CurrentUser");
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCurrentUser(RegistryKey param) {
    try {
      Javonet.getType("Microsoft.Win32.Registry").set("CurrentUser", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RegistryKey getLocalMachine() {
    try {
      Object res = Javonet.getType("Microsoft.Win32.Registry").<NObject>get("LocalMachine");
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLocalMachine(RegistryKey param) {
    try {
      Javonet.getType("Microsoft.Win32.Registry").set("LocalMachine", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RegistryKey getClassesRoot() {
    try {
      Object res = Javonet.getType("Microsoft.Win32.Registry").<NObject>get("ClassesRoot");
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setClassesRoot(RegistryKey param) {
    try {
      Javonet.getType("Microsoft.Win32.Registry").set("ClassesRoot", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RegistryKey getUsers() {
    try {
      Object res = Javonet.getType("Microsoft.Win32.Registry").<NObject>get("Users");
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUsers(RegistryKey param) {
    try {
      Javonet.getType("Microsoft.Win32.Registry").set("Users", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RegistryKey getPerformanceData() {
    try {
      Object res = Javonet.getType("Microsoft.Win32.Registry").<NObject>get("PerformanceData");
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPerformanceData(RegistryKey param) {
    try {
      Javonet.getType("Microsoft.Win32.Registry").set("PerformanceData", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RegistryKey getCurrentConfig() {
    try {
      Object res = Javonet.getType("Microsoft.Win32.Registry").<NObject>get("CurrentConfig");
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCurrentConfig(RegistryKey param) {
    try {
      Javonet.getType("Microsoft.Win32.Registry").set("CurrentConfig", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RegistryKey getDynData() {
    try {
      Object res = Javonet.getType("Microsoft.Win32.Registry").<NObject>get("DynData");
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDynData(RegistryKey param) {
    try {
      Javonet.getType("Microsoft.Win32.Registry").set("DynData", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object GetValue(
      java.lang.String keyName, java.lang.String valueName, Object defaultValue) {
    try {
      Object res =
          Javonet.getType("Microsoft.Win32.Registry")
              .invoke("GetValue", keyName, valueName, defaultValue);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void SetValue(java.lang.String keyName, java.lang.String valueName, Object value) {
    try {
      Javonet.getType("Microsoft.Win32.Registry").invoke("SetValue", keyName, valueName, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void SetValue(
      java.lang.String keyName,
      java.lang.String valueName,
      Object value,
      RegistryValueKind valueKind) {
    try {
      Javonet.getType("Microsoft.Win32.Registry")
          .invoke("SetValue", keyName, valueName, value, NEnum.fromJavaEnum(valueKind));
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
