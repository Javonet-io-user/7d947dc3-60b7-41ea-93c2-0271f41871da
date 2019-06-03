package combit.ListLabel24.Repository;

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
import combit.ListLabel24.Repository.*;
import combit.ListLabel24.*;

public class RepositoryItemType {
  protected NObject javonetHandle;
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
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RepositoryItemType getImage() {
    try {
      Object res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType").<NObject>get("Image");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setImage(RepositoryItemType param) {
    try {
      Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType").set("Image", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RepositoryItemType getPDF() {
    try {
      Object res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType").<NObject>get("PDF");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPDF(RepositoryItemType param) {
    try {
      Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType").set("PDF", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RepositoryItemType getProjectList() {
    try {
      Object res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
              .<NObject>get("ProjectList");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setProjectList(RepositoryItemType param) {
    try {
      Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType").set("ProjectList", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RepositoryItemType getProjectCard() {
    try {
      Object res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
              .<NObject>get("ProjectCard");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setProjectCard(RepositoryItemType param) {
    try {
      Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType").set("ProjectCard", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RepositoryItemType getProjectLabel() {
    try {
      Object res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
              .<NObject>get("ProjectLabel");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setProjectLabel(RepositoryItemType param) {
    try {
      Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
          .set("ProjectLabel", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RepositoryItemType getProjectIndex() {
    try {
      Object res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
              .<NObject>get("ProjectIndex");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setProjectIndex(RepositoryItemType param) {
    try {
      Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
          .set("ProjectIndex", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RepositoryItemType getProjectReverseSide() {
    try {
      Object res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
              .<NObject>get("ProjectReverseSide");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setProjectReverseSide(RepositoryItemType param) {
    try {
      Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
          .set("ProjectReverseSide", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RepositoryItemType getProjectTableOfContents() {
    try {
      Object res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
              .<NObject>get("ProjectTableOfContents");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setProjectTableOfContents(RepositoryItemType param) {
    try {
      Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
          .set("ProjectTableOfContents", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RepositoryItemType getPrinterConfig() {
    try {
      Object res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
              .<NObject>get("PrinterConfig");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPrinterConfig(RepositoryItemType param) {
    try {
      Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
          .set("PrinterConfig", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RepositoryItemType getSketchImage() {
    try {
      Object res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
              .<NObject>get("SketchImage");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSketchImage(RepositoryItemType param) {
    try {
      Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType").set("SketchImage", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RepositoryItemType getShapefile() {
    try {
      Object res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
              .<NObject>get("Shapefile");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setShapefile(RepositoryItemType param) {
    try {
      Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType").set("Shapefile", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static RepositoryItemType getShapefileDatabase() {
    try {
      Object res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
              .<NObject>get("ShapefileDatabase");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setShapefileDatabase(RepositoryItemType param) {
    try {
      Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
          .set("ShapefileDatabase", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RepositoryItemType(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
  public static RepositoryItemType FromLlProject(LlProject project) {
    try {
      Object res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
              .invoke("FromLlProject", NEnum.fromJavaEnum(project));
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static LlProject ToLlProject(java.lang.String itemType) {
    try {
      Object res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
              .invoke("ToLlProject", itemType);
      if (res == null) return null;
      return LlProject.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static RepositoryItemType FromStringValue(java.lang.String typeValue) {
    try {
      Object res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
              .invoke("FromStringValue", typeValue);
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsProjectType(
      java.lang.String typeValue, java.lang.Boolean allowSpecialProjectTypes) {
    try {
      java.lang.Boolean res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
              .invoke("IsProjectType", typeValue, allowSpecialProjectTypes);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsProjectType(
      RepositoryItemType typeValue, java.lang.Boolean allowSpecialProjectTypes) {
    try {
      java.lang.Boolean res =
          Javonet.getType("combit.ListLabel24.Repository.RepositoryItemType")
              .invoke("IsProjectType", typeValue, allowSpecialProjectTypes);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
