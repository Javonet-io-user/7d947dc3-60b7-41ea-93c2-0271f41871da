package combit.ListLabel24;

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
import combit.ListLabel24.*;
import jio.System.Collections.*;
import jio.System.Data.*;
import jio.System.*;

public class ChartFieldCollection extends ElementBaseCollection
    implements IDictionary, ICollection, IEnumerable, IDisposable, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.GetEnumerator();
  }

  public ChartFieldCollection(ListLabel ll) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ChartFieldCollection", ll);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ChartFieldCollection(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ElementBaseEnumerator GetEnumerator() {
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
  public void IDictionary_Clear() {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IDictionary").invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddFromEnumerable(IEnumerable value) {
    try {
      javonetHandle.invoke("AddFromEnumerable", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddFromEnumerable(IEnumerable value, java.lang.Boolean designMode) {
    try {
      javonetHandle.invoke("AddFromEnumerable", value, designMode);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddFromEnumerable(java.lang.String namePrefix, IEnumerable value) {
    try {
      javonetHandle.invoke("AddFromEnumerable", namePrefix, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddFromEnumerable(
      java.lang.String namePrefix, IEnumerable value, java.lang.Boolean designMode) {
    try {
      javonetHandle.invoke("AddFromEnumerable", namePrefix, value, designMode);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddFromEnumerable(
      java.lang.String namePrefix,
      IEnumerable value,
      java.lang.Boolean designMode,
      LlDeclareChartRow chartType) {
    try {
      javonetHandle.invoke(
          "AddFromEnumerable", namePrefix, value, designMode, NEnum.fromJavaEnum(chartType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddFromDataTable(DataTable value) {
    try {
      javonetHandle.invoke("AddFromDataTable", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddFromDataTable(DataTable value, java.lang.Boolean designMode) {
    try {
      javonetHandle.invoke("AddFromDataTable", value, designMode);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddFromDataTable(java.lang.String namePrefix, DataTable value) {
    try {
      javonetHandle.invoke("AddFromDataTable", namePrefix, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddFromDataTable(
      java.lang.String namePrefix, DataTable value, java.lang.Boolean designMode) {
    try {
      javonetHandle.invoke("AddFromDataTable", namePrefix, value, designMode);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddFromDataTable(
      java.lang.String namePrefix,
      DataTable value,
      java.lang.Boolean designMode,
      LlDeclareChartRow chartType) {
    try {
      javonetHandle.invoke(
          "AddFromDataTable", namePrefix, value, designMode, NEnum.fromJavaEnum(chartType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
