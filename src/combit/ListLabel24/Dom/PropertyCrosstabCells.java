package combit.ListLabel24.Dom;

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
import combit.ListLabel24.Dom.*;

public class PropertyCrosstabCells extends DomItem {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public CrosstabCellContent getAll() {
    try {
      Object res = javonetHandle.<NObject>get("All");
      if (res == null) return null;
      return new CrosstabCellContent((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public CrosstabCellContent getItem(java.lang.Integer rowLevel, java.lang.Integer columnLevel) {
    try {
      Object res = javonetHandle.invoke("get_Item", rowLevel, columnLevel);
      if (res == null) return null;
      return new CrosstabCellContent((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public CrosstabCellContent getItem(
      java.lang.Integer rowLevel, java.lang.Integer columnLevel, java.lang.Integer subColumnLevel) {
    try {
      Object res = javonetHandle.invoke("get_Item", rowLevel, columnLevel, subColumnLevel);
      if (res == null) return null;
      return new CrosstabCellContent((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PropertyCrosstabCells(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyFrom(DomItem source) {
    try {
      javonetHandle.invoke("CopyFrom", source);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public CrosstabCellContent Column(java.lang.Integer rowLevel) {
    try {
      Object res = javonetHandle.invoke("Column", rowLevel);
      if (res == null) return null;
      return new CrosstabCellContent((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public CrosstabCellContent Row(java.lang.Integer columnLevel) {
    try {
      Object res = javonetHandle.invoke("Row", columnLevel);
      if (res == null) return null;
      return new CrosstabCellContent((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
