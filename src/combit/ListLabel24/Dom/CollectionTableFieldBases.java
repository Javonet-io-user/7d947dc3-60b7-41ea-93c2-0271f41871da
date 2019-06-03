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
import combit.ListLabel24.*;
import jio.System.Collections.*;

public class CollectionTableFieldBases extends DomCollectionBase
    implements IList, ICollection, IEnumerable, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.GetEnumerator();
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public TableField getItem(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("get_Item", index);
      if (res == null) return null;
      return new TableField((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CollectionTableFieldBases(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public CollectionEnumerator<TableField> GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return new CollectionEnumerator<TableField>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TableFieldTable AddNewTable() {
    try {
      Object res = javonetHandle.invoke("AddNewTable");
      if (res == null) return null;
      return new TableFieldTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TableFieldBarcode AddNewBarcode() {
    try {
      Object res = javonetHandle.invoke("AddNewBarcode");
      if (res == null) return null;
      return new TableFieldBarcode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TableFieldChart AddNewChart(LlChartType type) {
    try {
      Object res = javonetHandle.invoke("AddNewChart", NEnum.fromJavaEnum(type));
      if (res == null) return null;
      return new TableFieldChart((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TableFieldExtensionObject AddNewExtensionObject(java.lang.String name) {
    try {
      Object res = javonetHandle.invoke("AddNewExtensionObject", name);
      if (res == null) return null;
      return new TableFieldExtensionObject((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TableFieldDrawing AddNewDrawing() {
    try {
      Object res = javonetHandle.invoke("AddNewDrawing");
      if (res == null) return null;
      return new TableFieldDrawing((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TableFieldHtml AddNewHtml() {
    try {
      Object res = javonetHandle.invoke("AddNewHtml");
      if (res == null) return null;
      return new TableFieldHtml((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TableFieldRtf AddNewRtf() {
    try {
      Object res = javonetHandle.invoke("AddNewRtf");
      if (res == null) return null;
      return new TableFieldRtf((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TableFieldText AddNewText() {
    try {
      Object res = javonetHandle.invoke("AddNewText");
      if (res == null) return null;
      return new TableFieldText((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TableFieldGauge AddNewGauge(LlDomGaugeType type) {
    try {
      Object res = javonetHandle.invoke("AddNewGauge", NEnum.fromJavaEnum(type));
      if (res == null) return null;
      return new TableFieldGauge((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TableFieldPdf AddNewPdf() {
    try {
      Object res = javonetHandle.invoke("AddNewPdf");
      if (res == null) return null;
      return new TableFieldPdf((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TableInputFieldButton AddNewInputButton() {
    try {
      Object res = javonetHandle.invoke("AddNewInputButton");
      if (res == null) return null;
      return new TableInputFieldButton((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TableInputFieldCheckbox AddNewInputCheckbox() {
    try {
      Object res = javonetHandle.invoke("AddNewInputCheckbox");
      if (res == null) return null;
      return new TableInputFieldCheckbox((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TableInputFieldComboBox AddNewInputComboBox() {
    try {
      Object res = javonetHandle.invoke("AddNewInputComboBox");
      if (res == null) return null;
      return new TableInputFieldComboBox((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TableInputFieldEdit AddNewInputEdit() {
    try {
      Object res = javonetHandle.invoke("AddNewInputEdit");
      if (res == null) return null;
      return new TableInputFieldEdit((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public CollectionEnumerator<TableFieldBase> AddNewDataGraphic() {
    try {
      Object res = javonetHandle.invoke("AddNewDataGraphic");
      if (res == null) return null;
      return new CollectionEnumerator<TableFieldBase>((NObject) res);
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
