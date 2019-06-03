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
import jio.System.Collections.*;

public class CollectionObjectBases extends DomCollectionBase
    implements IList, ICollection, IEnumerable, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.GetEnumerator();
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public ObjectBase getItem(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("get_Item", index);
      if (res == null) return null;
      return new ObjectBase((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public ObjectBase getItem(java.lang.String objectName) {
    try {
      Object res = javonetHandle.invoke("get_Item", objectName);
      if (res == null) return null;
      return new ObjectBase((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CollectionObjectBases(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyFrom(DomCollectionBase source) {
    try {
      javonetHandle.invoke("CopyFrom", source);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public CollectionEnumerator<ObjectBase> GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return new CollectionEnumerator<ObjectBase>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectBarcode AddNewBarcode() {
    try {
      Object res = javonetHandle.invoke("AddNewBarcode");
      if (res == null) return null;
      return new ObjectBarcode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectBarcode AddNewBarcode(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewBarcode", index);
      if (res == null) return null;
      return new ObjectBarcode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectEllipse AddNewEllipse() {
    try {
      Object res = javonetHandle.invoke("AddNewEllipse");
      if (res == null) return null;
      return new ObjectEllipse((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectEllipse AddNewEllipse(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewEllipse", index);
      if (res == null) return null;
      return new ObjectEllipse((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectDrawing AddNewDrawing() {
    try {
      Object res = javonetHandle.invoke("AddNewDrawing");
      if (res == null) return null;
      return new ObjectDrawing((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectDrawing AddNewDrawing(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewDrawing", index);
      if (res == null) return null;
      return new ObjectDrawing((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectHtml AddNewHtml() {
    try {
      Object res = javonetHandle.invoke("AddNewHtml");
      if (res == null) return null;
      return new ObjectHtml((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectHtml AddNewHtml(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewHtml", index);
      if (res == null) return null;
      return new ObjectHtml((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectInputButton AddNewInputButton() {
    try {
      Object res = javonetHandle.invoke("AddNewInputButton");
      if (res == null) return null;
      return new ObjectInputButton((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectInputButton AddNewInputButton(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewInputButton", index);
      if (res == null) return null;
      return new ObjectInputButton((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectInputCheckbox AddNewInputCheckbox() {
    try {
      Object res = javonetHandle.invoke("AddNewInputCheckbox");
      if (res == null) return null;
      return new ObjectInputCheckbox((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectInputCheckbox AddNewInputCheckbox(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewInputCheckbox", index);
      if (res == null) return null;
      return new ObjectInputCheckbox((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectInputCombobox AddNewInputCombobox() {
    try {
      Object res = javonetHandle.invoke("AddNewInputCombobox");
      if (res == null) return null;
      return new ObjectInputCombobox((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectInputCombobox AddNewInputCombobox(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewInputCombobox", index);
      if (res == null) return null;
      return new ObjectInputCombobox((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectInputEdit AddNewInputEdit() {
    try {
      Object res = javonetHandle.invoke("AddNewInputEdit");
      if (res == null) return null;
      return new ObjectInputEdit((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectInputEdit AddNewInputEdit(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewInputEdit", index);
      if (res == null) return null;
      return new ObjectInputEdit((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectLine AddNewLine() {
    try {
      Object res = javonetHandle.invoke("AddNewLine");
      if (res == null) return null;
      return new ObjectLine((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectLine AddNewLine(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewLine", index);
      if (res == null) return null;
      return new ObjectLine((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectRectangle AddNewRectangle() {
    try {
      Object res = javonetHandle.invoke("AddNewRectangle");
      if (res == null) return null;
      return new ObjectRectangle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectRectangle AddNewRectangle(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewRectangle", index);
      if (res == null) return null;
      return new ObjectRectangle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectReportContainer AddNewReportContainer() {
    try {
      Object res = javonetHandle.invoke("AddNewReportContainer");
      if (res == null) return null;
      return new ObjectReportContainer((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectReportContainer AddNewReportContainer(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewReportContainer", index);
      if (res == null) return null;
      return new ObjectReportContainer((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectRtf AddNewRtf() {
    try {
      Object res = javonetHandle.invoke("AddNewRtf");
      if (res == null) return null;
      return new ObjectRtf((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectRtf AddNewRtf(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewRtf", index);
      if (res == null) return null;
      return new ObjectRtf((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectText AddNewText() {
    try {
      Object res = javonetHandle.invoke("AddNewText");
      if (res == null) return null;
      return new ObjectText((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectText AddNewText(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewText", index);
      if (res == null) return null;
      return new ObjectText((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectTemplate AddNewTemplate() {
    try {
      Object res = javonetHandle.invoke("AddNewTemplate");
      if (res == null) return null;
      return new ObjectTemplate((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectTemplate AddNewTemplate(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewTemplate", index);
      if (res == null) return null;
      return new ObjectTemplate((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectGauge AddNewGauge(LlDomGaugeType gaugeType) {
    try {
      Object res = javonetHandle.invoke("AddNewGauge", NEnum.fromJavaEnum(gaugeType));
      if (res == null) return null;
      return new ObjectGauge((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectGauge AddNewGauge(LlDomGaugeType gaugeType, java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewGauge", NEnum.fromJavaEnum(gaugeType), index);
      if (res == null) return null;
      return new ObjectGauge((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectDataGraphic AddNewDataGraphic() {
    try {
      Object res = javonetHandle.invoke("AddNewDataGraphic");
      if (res == null) return null;
      return new ObjectDataGraphic((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectDataGraphic AddNewDataGraphic(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewDataGraphic", index);
      if (res == null) return null;
      return new ObjectDataGraphic((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectPdf AddNewPdf() {
    try {
      Object res = javonetHandle.invoke("AddNewPdf");
      if (res == null) return null;
      return new ObjectPdf((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ObjectPdf AddNewPdf(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("AddNewPdf", index);
      if (res == null) return null;
      return new ObjectPdf((NObject) res);
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
