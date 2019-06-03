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

public class PropertyGaugeDefinition extends DomItem {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public PropertyStartValue getStartValue() {
    try {
      Object res = javonetHandle.<NObject>get("StartValue");
      if (res == null) return null;
      return new PropertyStartValue((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyAlphaBlendableItem getFrame() {
    try {
      Object res = javonetHandle.<NObject>get("Frame");
      if (res == null) return null;
      return new PropertyAlphaBlendableItem((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyAlphaBlendableItem getGlass() {
    try {
      Object res = javonetHandle.<NObject>get("Glass");
      if (res == null) return null;
      return new PropertyAlphaBlendableItem((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyScaleLabels getScaleLabels() {
    try {
      Object res = javonetHandle.<NObject>get("ScaleLabels");
      if (res == null) return null;
      return new PropertyScaleLabels((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyPointer getPointer() {
    try {
      Object res = javonetHandle.<NObject>get("Pointer");
      if (res == null) return null;
      return new PropertyPointer((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyTickmarksExt getTickmarks() {
    try {
      Object res = javonetHandle.<NObject>get("Tickmarks");
      if (res == null) return null;
      return new PropertyTickmarksExt((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWhiteSpaceBeforeScaleRange(java.lang.String value) {
    try {
      javonetHandle.set("WhiteSpaceBeforeScaleRange", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getWhiteSpaceBeforeScaleRange() {
    try {
      java.lang.String res = javonetHandle.get("WhiteSpaceBeforeScaleRange");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWhiteSpaceAfterScaleRange(java.lang.String value) {
    try {
      javonetHandle.set("WhiteSpaceAfterScaleRange", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getWhiteSpaceAfterScaleRange() {
    try {
      java.lang.String res = javonetHandle.get("WhiteSpaceAfterScaleRange");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyScaleLimits getMaximumValue() {
    try {
      Object res = javonetHandle.<NObject>get("MaximumValue");
      if (res == null) return null;
      return new PropertyScaleLimits((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyScaleLimits getMinimumValue() {
    try {
      Object res = javonetHandle.<NObject>get("MinimumValue");
      if (res == null) return null;
      return new PropertyScaleLimits((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setScaleRangeRotationAngle(java.lang.String value) {
    try {
      javonetHandle.set("ScaleRangeRotationAngle", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getScaleRangeRotationAngle() {
    try {
      java.lang.String res = javonetHandle.get("ScaleRangeRotationAngle");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertySignalRanges getSignalRanges() {
    try {
      Object res = javonetHandle.<NObject>get("SignalRanges");
      if (res == null) return null;
      return new PropertySignalRanges((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyLabels getLabels() {
    try {
      Object res = javonetHandle.<NObject>get("Labels");
      if (res == null) return null;
      return new PropertyLabels((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setValue(java.lang.String value) {
    try {
      javonetHandle.set("Value", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getValue() {
    try {
      java.lang.String res = javonetHandle.get("Value");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setStyle(java.lang.String value) {
    try {
      javonetHandle.set("Style", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getStyle() {
    try {
      java.lang.String res = javonetHandle.get("Style");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWidthHeightRelation(java.lang.String value) {
    try {
      javonetHandle.set("WidthHeightRelation", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getWidthHeightRelation() {
    try {
      java.lang.String res = javonetHandle.get("WidthHeightRelation");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDesignScheme(java.lang.String value) {
    try {
      javonetHandle.set("DesignScheme", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDesignScheme() {
    try {
      java.lang.String res = javonetHandle.get("DesignScheme");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public PropertyGaugeDefinition(NObject handle) {
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
