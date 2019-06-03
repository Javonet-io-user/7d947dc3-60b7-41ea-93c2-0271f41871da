package jio.System.Drawing.Printing;

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
import jio.System.Drawing.Printing.*;
import jio.System.*;
import jio.System.Collections.*;

public class PrinterSettings implements ICloneable {
  protected NObject javonetHandle;

  public PrinterSettings() {
    try {
      javonetHandle = Javonet.New("System.Drawing.Printing.PrinterSettings");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PrinterSettings(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  public static class PaperSizeCollection implements ICollection, IEnumerable, Iterable<Object> {
    protected NObject javonetHandle;

    @Override
    public Iterator<Object> iterator() {
      return (Iterator<Object>) this.GetEnumerator();
    }

    public PaperSizeCollection(PaperSize[] array) {
      try {
        javonetHandle =
            Javonet.New(
                "System.Drawing.Printing.PrinterSettings+PaperSizeCollection",
                new Object[] {array});
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public PaperSizeCollection(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public IEnumerator GetEnumerator() {
      try {
        Object res = javonetHandle.invoke("GetEnumerator");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public void CopyTo(java.lang.reflect.Array array, java.lang.Integer index) {
      try {
        javonetHandle
            .explicitInterface("jio.System.Collections.ICollection")
            .invoke("CopyTo", array, index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getICollection_Count() {
      try {
        java.lang.Integer res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_Count");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public Object getSyncRoot() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_SyncRoot");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getIsSynchronized() {
      try {
        java.lang.Boolean res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_IsSynchronized");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public IEnumerator IEnumerable_GetEnumerator() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IEnumerable")
                .invoke("GetEnumerator");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
  }

  public static class PaperSourceCollection implements ICollection, IEnumerable, Iterable<Object> {
    protected NObject javonetHandle;

    @Override
    public Iterator<Object> iterator() {
      return (Iterator<Object>) this.GetEnumerator();
    }

    public PaperSourceCollection(PaperSource[] array) {
      try {
        javonetHandle =
            Javonet.New(
                "System.Drawing.Printing.PrinterSettings+PaperSourceCollection",
                new Object[] {array});
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public PaperSourceCollection(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public IEnumerator GetEnumerator() {
      try {
        Object res = javonetHandle.invoke("GetEnumerator");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public void CopyTo(java.lang.reflect.Array array, java.lang.Integer index) {
      try {
        javonetHandle
            .explicitInterface("jio.System.Collections.ICollection")
            .invoke("CopyTo", array, index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getICollection_Count() {
      try {
        java.lang.Integer res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_Count");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public Object getSyncRoot() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_SyncRoot");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getIsSynchronized() {
      try {
        java.lang.Boolean res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_IsSynchronized");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public IEnumerator IEnumerable_GetEnumerator() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IEnumerable")
                .invoke("GetEnumerator");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
  }

  public static class PrinterResolutionCollection
      implements ICollection, IEnumerable, Iterable<Object> {
    protected NObject javonetHandle;

    @Override
    public Iterator<Object> iterator() {
      return (Iterator<Object>) this.GetEnumerator();
    }

    public PrinterResolutionCollection(PrinterResolution[] array) {
      try {
        javonetHandle =
            Javonet.New(
                "System.Drawing.Printing.PrinterSettings+PrinterResolutionCollection",
                new Object[] {array});
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public PrinterResolutionCollection(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public IEnumerator GetEnumerator() {
      try {
        Object res = javonetHandle.invoke("GetEnumerator");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public void CopyTo(java.lang.reflect.Array array, java.lang.Integer index) {
      try {
        javonetHandle
            .explicitInterface("jio.System.Collections.ICollection")
            .invoke("CopyTo", array, index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getICollection_Count() {
      try {
        java.lang.Integer res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_Count");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public Object getSyncRoot() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_SyncRoot");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getIsSynchronized() {
      try {
        java.lang.Boolean res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_IsSynchronized");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public IEnumerator IEnumerable_GetEnumerator() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IEnumerable")
                .invoke("GetEnumerator");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
  }

  public static class StringCollection implements ICollection, IEnumerable, Iterable<Object> {
    protected NObject javonetHandle;

    @Override
    public Iterator<Object> iterator() {
      return (Iterator<Object>) this.GetEnumerator();
    }

    public StringCollection(java.lang.String[] array) {
      try {
        javonetHandle =
            Javonet.New(
                "System.Drawing.Printing.PrinterSettings+StringCollection", new Object[] {array});
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public StringCollection(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public IEnumerator GetEnumerator() {
      try {
        Object res = javonetHandle.invoke("GetEnumerator");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public void CopyTo(java.lang.reflect.Array array, java.lang.Integer index) {
      try {
        javonetHandle
            .explicitInterface("jio.System.Collections.ICollection")
            .invoke("CopyTo", array, index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getICollection_Count() {
      try {
        java.lang.Integer res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_Count");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public Object getSyncRoot() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_SyncRoot");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getIsSynchronized() {
      try {
        java.lang.Boolean res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_IsSynchronized");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public IEnumerator IEnumerable_GetEnumerator() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IEnumerable")
                .invoke("GetEnumerator");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
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
