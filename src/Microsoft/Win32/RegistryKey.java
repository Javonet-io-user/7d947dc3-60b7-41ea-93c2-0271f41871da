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
import jio.System.*;
import Microsoft.Win32.*;
import jio.System.Security.AccessControl.*;
import Microsoft.Win32.SafeHandles.*;

public class RegistryKey extends MarshalByRefObject implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getSubKeyCount() {
    try {
      java.lang.Integer res = javonetHandle.get("SubKeyCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RegistryView getView() {
    try {
      Object res = javonetHandle.<NEnum>get("View");
      if (res == null) return null;
      return RegistryView.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SafeRegistryHandle getHandle() {
    try {
      Object res = javonetHandle.<NObject>get("Handle");
      if (res == null) return null;
      return new SafeRegistryHandle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getValueCount() {
    try {
      java.lang.Integer res = javonetHandle.get("ValueCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getName() {
    try {
      java.lang.String res = javonetHandle.get("Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public RegistryKey(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Close() {
    try {
      javonetHandle.invoke("Close");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Flush() {
    try {
      javonetHandle.invoke("Flush");
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
  public RegistryKey CreateSubKey(java.lang.String subkey) {
    try {
      Object res = javonetHandle.invoke("CreateSubKey", subkey);
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RegistryKey CreateSubKey(
      java.lang.String subkey, RegistryKeyPermissionCheck permissionCheck) {
    try {
      Object res =
          javonetHandle.invoke("CreateSubKey", subkey, NEnum.fromJavaEnum(permissionCheck));
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RegistryKey CreateSubKey(
      java.lang.String subkey,
      RegistryKeyPermissionCheck permissionCheck,
      RegistryOptions options) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateSubKey",
              subkey,
              NEnum.fromJavaEnum(permissionCheck),
              NEnum.fromJavaEnum(options));
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RegistryKey CreateSubKey(java.lang.String subkey, java.lang.Boolean writable) {
    try {
      Object res = javonetHandle.invoke("CreateSubKey", subkey, writable);
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RegistryKey CreateSubKey(
      java.lang.String subkey, java.lang.Boolean writable, RegistryOptions options) {
    try {
      Object res =
          javonetHandle.invoke("CreateSubKey", subkey, writable, NEnum.fromJavaEnum(options));
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RegistryKey CreateSubKey(
      java.lang.String subkey,
      RegistryKeyPermissionCheck permissionCheck,
      RegistrySecurity registrySecurity) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateSubKey", subkey, NEnum.fromJavaEnum(permissionCheck), registrySecurity);
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RegistryKey CreateSubKey(
      java.lang.String subkey,
      RegistryKeyPermissionCheck permissionCheck,
      RegistryOptions registryOptions,
      RegistrySecurity registrySecurity) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateSubKey",
              subkey,
              NEnum.fromJavaEnum(permissionCheck),
              NEnum.fromJavaEnum(registryOptions),
              registrySecurity);
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DeleteSubKey(java.lang.String subkey) {
    try {
      javonetHandle.invoke("DeleteSubKey", subkey);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DeleteSubKey(java.lang.String subkey, java.lang.Boolean throwOnMissingSubKey) {
    try {
      javonetHandle.invoke("DeleteSubKey", subkey, throwOnMissingSubKey);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DeleteSubKeyTree(java.lang.String subkey) {
    try {
      javonetHandle.invoke("DeleteSubKeyTree", subkey);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DeleteSubKeyTree(java.lang.String subkey, java.lang.Boolean throwOnMissingSubKey) {
    try {
      javonetHandle.invoke("DeleteSubKeyTree", subkey, throwOnMissingSubKey);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DeleteValue(java.lang.String name) {
    try {
      javonetHandle.invoke("DeleteValue", name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DeleteValue(java.lang.String name, java.lang.Boolean throwOnMissingValue) {
    try {
      javonetHandle.invoke("DeleteValue", name, throwOnMissingValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static RegistryKey OpenBaseKey(RegistryHive hKey, RegistryView view) {
    try {
      Object res =
          Javonet.getType("Microsoft.Win32.RegistryKey")
              .invoke("OpenBaseKey", NEnum.fromJavaEnum(hKey), NEnum.fromJavaEnum(view));
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static RegistryKey OpenRemoteBaseKey(RegistryHive hKey, java.lang.String machineName) {
    try {
      Object res =
          Javonet.getType("Microsoft.Win32.RegistryKey")
              .invoke("OpenRemoteBaseKey", NEnum.fromJavaEnum(hKey), machineName);
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static RegistryKey OpenRemoteBaseKey(
      RegistryHive hKey, java.lang.String machineName, RegistryView view) {
    try {
      Object res =
          Javonet.getType("Microsoft.Win32.RegistryKey")
              .invoke(
                  "OpenRemoteBaseKey",
                  NEnum.fromJavaEnum(hKey),
                  machineName,
                  NEnum.fromJavaEnum(view));
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RegistryKey OpenSubKey(java.lang.String name, java.lang.Boolean writable) {
    try {
      Object res = javonetHandle.invoke("OpenSubKey", name, writable);
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RegistryKey OpenSubKey(java.lang.String name, RegistryKeyPermissionCheck permissionCheck) {
    try {
      Object res = javonetHandle.invoke("OpenSubKey", name, NEnum.fromJavaEnum(permissionCheck));
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RegistryKey OpenSubKey(java.lang.String name, RegistryRights rights) {
    try {
      Object res = javonetHandle.invoke("OpenSubKey", name, NEnum.fromJavaEnum(rights));
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RegistryKey OpenSubKey(
      java.lang.String name, RegistryKeyPermissionCheck permissionCheck, RegistryRights rights) {
    try {
      Object res =
          javonetHandle.invoke(
              "OpenSubKey", name, NEnum.fromJavaEnum(permissionCheck), NEnum.fromJavaEnum(rights));
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RegistryKey OpenSubKey(java.lang.String name) {
    try {
      Object res = javonetHandle.invoke("OpenSubKey", name);
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static RegistryKey FromHandle(SafeRegistryHandle handle) {
    try {
      Object res = Javonet.getType("Microsoft.Win32.RegistryKey").invoke("FromHandle", handle);
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static RegistryKey FromHandle(SafeRegistryHandle handle, RegistryView view) {
    try {
      Object res =
          Javonet.getType("Microsoft.Win32.RegistryKey")
              .invoke("FromHandle", handle, NEnum.fromJavaEnum(view));
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String[] GetSubKeyNames(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetSubKeyNames");
      if (res == null) return null;
      return (java.lang.String[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String[] GetValueNames(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetValueNames");
      if (res == null) return null;
      return (java.lang.String[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object GetValue(java.lang.String name) {
    try {
      Object res = javonetHandle.invoke("GetValue", name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object GetValue(java.lang.String name, Object defaultValue) {
    try {
      Object res = javonetHandle.invoke("GetValue", name, defaultValue);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object GetValue(java.lang.String name, Object defaultValue, RegistryValueOptions options) {
    try {
      Object res =
          javonetHandle.invoke("GetValue", name, defaultValue, NEnum.fromJavaEnum(options));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RegistryValueKind GetValueKind(java.lang.String name) {
    try {
      Object res = javonetHandle.invoke("GetValueKind", name);
      if (res == null) return null;
      return RegistryValueKind.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetValue(java.lang.String name, Object value) {
    try {
      javonetHandle.invoke("SetValue", name, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetValue(java.lang.String name, Object value, RegistryValueKind valueKind) {
    try {
      javonetHandle.invoke("SetValue", name, value, NEnum.fromJavaEnum(valueKind));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RegistrySecurity GetAccessControl() {
    try {
      Object res = javonetHandle.invoke("GetAccessControl");
      if (res == null) return null;
      return new RegistrySecurity((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RegistrySecurity GetAccessControl(AccessControlSections includeSections) {
    try {
      Object res = javonetHandle.invoke("GetAccessControl", NEnum.fromJavaEnum(includeSections));
      if (res == null) return null;
      return new RegistrySecurity((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetAccessControl(RegistrySecurity registrySecurity) {
    try {
      javonetHandle.invoke("SetAccessControl", registrySecurity);
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
