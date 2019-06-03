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

public class PropertyChartDefinition extends DomItem {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setTitlePosition(java.lang.String value) {
    try {
      javonetHandle.set("TitlePosition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTitlePosition() {
    try {
      java.lang.String res = javonetHandle.get("TitlePosition");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyBackground getBackground() {
    try {
      Object res = javonetHandle.<NObject>get("Background");
      if (res == null) return null;
      return new PropertyBackground((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyChartEngineBase getChartEngine() {
    try {
      Object res = javonetHandle.<NObject>get("ChartEngine");
      if (res == null) return null;
      return new PropertyChartEngineBase((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyChartColorArray getColors() {
    try {
      Object res = javonetHandle.<NObject>get("Colors");
      if (res == null) return null;
      return new PropertyChartColorArray((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CollectionChartConditionalColors getConditionalColors() {
    try {
      Object res = javonetHandle.<NObject>get("ConditionalColors");
      if (res == null) return null;
      return new CollectionChartConditionalColors((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyChartTitle getTitle() {
    try {
      Object res = javonetHandle.<NObject>get("Title");
      if (res == null) return null;
      return new PropertyChartTitle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CollectionManualLegend getManualLegend() {
    try {
      Object res = javonetHandle.<NObject>get("ManualLegend");
      if (res == null) return null;
      return new CollectionManualLegend((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PropertyChartDefinition(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
