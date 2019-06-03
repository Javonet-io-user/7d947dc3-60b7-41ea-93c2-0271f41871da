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
import jio.System.*;

public class RepositoryImportUtil implements IDisposable {
  protected NObject javonetHandle;

  public RepositoryImportUtil(IRepository targetRepository) {
    try {
      javonetHandle =
          Javonet.New("combit.ListLabel24.Repository.RepositoryImportUtil", targetRepository);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RepositoryImportUtil(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String CreateNewProject(LlProject projectType, java.lang.String uiName) {
    try {
      java.lang.String res =
          javonetHandle.invoke("CreateNewProject", NEnum.fromJavaEnum(projectType), uiName);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ImportProjectFile(
      ListLabel ll,
      java.lang.String filePath,
      java.lang.String userImportData,
      java.lang.String printerConfigFile,
      java.lang.String sketchImageFile) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "ImportProjectFile",
              ll,
              filePath,
              userImportData,
              printerConfigFile,
              sketchImageFile);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean TryGetPreviouslyImportedItem(
      java.lang.String originalFilePath,
      AtomicReference<java.lang.String> assignedRepositoryItemId) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke(
              "TryGetPreviouslyImportedItem",
              originalFilePath,
              new NOut(
                  assignedRepositoryItemId,
                  JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ImportProjectFileWithDependencies(
      ListLabel ll, java.lang.String projectFilePath, java.lang.String repositoryItemId) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "ImportProjectFileWithDependencies", ll, projectFilePath, repositoryItemId);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Tuple<java.lang.String, java.lang.String> ImportShapefile(
      ListLabel ll,
      java.lang.String shpFilePath,
      java.lang.String dbfFilePath,
      java.lang.String userImportData) {
    try {
      Object res =
          javonetHandle.invoke("ImportShapefile", ll, shpFilePath, dbfFilePath, userImportData);
      if (res == null) return null;
      return new Tuple<java.lang.String, java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ImportPdfFile(
      ListLabel ll, java.lang.String filePath, java.lang.String userImportData) {
    try {
      java.lang.String res = javonetHandle.invoke("ImportPdfFile", ll, filePath, userImportData);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ImportImageFile(
      ListLabel ll, java.lang.String filePath, java.lang.String userImportData) {
    try {
      java.lang.String res = javonetHandle.invoke("ImportImageFile", ll, filePath, userImportData);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ImportReverseSideFile(
      ListLabel ll, java.lang.String filePath, java.lang.String userImportData) {
    try {
      java.lang.String res =
          javonetHandle.invoke("ImportReverseSideFile", ll, filePath, userImportData);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ImportTableOfContentsFile(
      ListLabel ll, java.lang.String filePath, java.lang.String userImportData) {
    try {
      java.lang.String res =
          javonetHandle.invoke("ImportTableOfContentsFile", ll, filePath, userImportData);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ImportIndexFile(
      ListLabel ll, java.lang.String filePath, java.lang.String userImportData) {
    try {
      java.lang.String res = javonetHandle.invoke("ImportIndexFile", ll, filePath, userImportData);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ImportPrinterConfigFile(
      ListLabel ll,
      java.lang.String filePath,
      java.lang.String parentProjectItemId,
      java.lang.String userImportData) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "ImportPrinterConfigFile", ll, filePath, parentProjectItemId, userImportData);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ImportSketchImageFile(
      ListLabel ll,
      java.lang.String filePath,
      java.lang.String parentProjectItemId,
      java.lang.String userImportData) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "ImportSketchImageFile", ll, filePath, parentProjectItemId, userImportData);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetItemUIName(
      java.lang.String itemId, java.lang.String uiName, java.lang.Integer lcid) {
    try {
      javonetHandle.invoke("SetItemUIName", itemId, uiName, lcid);
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
