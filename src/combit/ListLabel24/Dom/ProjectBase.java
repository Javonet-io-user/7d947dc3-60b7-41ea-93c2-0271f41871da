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
import jio.System.*;
import jio.System.IO.*;

public abstract class ProjectBase extends DomItem implements IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setDesignerRedraw(java.lang.String value) {
    try {
      javonetHandle.set("DesignerRedraw", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertySettings getSettings() {
    try {
      Object res = javonetHandle.<NObject>get("Settings");
      if (res == null) return null;
      return new PropertySettings((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CollectionObjectBases getObjects() {
    try {
      Object res = javonetHandle.<NObject>get("Objects");
      if (res == null) return null;
      return new CollectionObjectBases((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CollectionUserVariables getUserVariables() {
    try {
      Object res = javonetHandle.<NObject>get("UserVariables");
      if (res == null) return null;
      return new CollectionUserVariables((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CollectionSumVariables getSumVariables() {
    try {
      Object res = javonetHandle.<NObject>get("SumVariables");
      if (res == null) return null;
      return new CollectionSumVariables((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CollectionProjectParameters getProjectParameters() {
    try {
      Object res = javonetHandle.<NObject>get("ProjectParameters");
      if (res == null) return null;
      return new CollectionProjectParameters((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyLayoutBase getLayout() {
    try {
      Object res = javonetHandle.<NObject>get("Layout");
      if (res == null) return null;
      return new PropertyLayoutBase((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PropertyReportSections getReportSections() {
    try {
      Object res = javonetHandle.<NObject>get("ReportSections");
      if (res == null) return null;
      return new PropertyReportSections((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUserData(java.lang.String value) {
    try {
      javonetHandle.set("UserData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUserData() {
    try {
      java.lang.String res = javonetHandle.get("UserData");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPageRanges(java.lang.String value) {
    try {
      javonetHandle.set("PageRanges", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPageRanges() {
    try {
      java.lang.String res = javonetHandle.get("PageRanges");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIssueRanges(java.lang.String value) {
    try {
      javonetHandle.set("IssueRanges", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getIssueRanges() {
    try {
      java.lang.String res = javonetHandle.get("IssueRanges");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFilter(java.lang.String value) {
    try {
      javonetHandle.set("Filter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFilter() {
    try {
      java.lang.String res = javonetHandle.get("Filter");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getChanged() {
    try {
      java.lang.String res = javonetHandle.get("Changed");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CollectionRegions getRegions() {
    try {
      Object res = javonetHandle.<NObject>get("Regions");
      if (res == null) return null;
      return new CollectionRegions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CollectionLayers getLayers() {
    try {
      Object res = javonetHandle.<NObject>get("Layers");
      if (res == null) return null;
      return new CollectionLayers((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CollectionTemplates getProjectTemplates() {
    try {
      Object res = javonetHandle.<NObject>get("ProjectTemplates");
      if (res == null) return null;
      return new CollectionTemplates((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CollectionReportParameters getReportParameters() {
    try {
      Object res = javonetHandle.<NObject>get("ReportParameters");
      if (res == null) return null;
      return new CollectionReportParameters((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CollectionReportParametersFromTemplates getReportParametersFromTemplates() {
    try {
      Object res = javonetHandle.<NObject>get("ReportParametersFromTemplates");
      if (res == null) return null;
      return new CollectionReportParametersFromTemplates((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CollectionCollectionVariables getCollectionVariables() {
    try {
      Object res = javonetHandle.<NObject>get("CollectionVariables");
      if (res == null) return null;
      return new CollectionCollectionVariables((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ProjectBase(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
  public void GetFromParent() {
    try {
      javonetHandle.invoke("GetFromParent");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Open(Stream projectStream) {
    try {
      javonetHandle.invoke("Open", projectStream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Open(Stream projectStream, Stream printerSettingsStream) {
    try {
      javonetHandle.invoke("Open", projectStream, printerSettingsStream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DomItem CurrentObject(LlDomCurrentObjectLevel level) {
    try {
      Object res = javonetHandle.invoke("CurrentObject", NEnum.fromJavaEnum(level));
      if (res == null) return null;
      return new DomItem((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Open(Stream projectStream, Stream printerSettingsStream, LlDomSettings domSettings) {
    try {
      javonetHandle.invoke(
          "Open", projectStream, printerSettingsStream, NEnum.fromJavaEnum(domSettings));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Open(java.lang.String projectFile, LlDomFileMode fileMode) {
    try {
      javonetHandle.invoke("Open", projectFile, NEnum.fromJavaEnum(fileMode));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Open(
      java.lang.String projectFile, LlDomFileMode fileMode, LlDomAccessMode accessMode) {
    try {
      javonetHandle.invoke(
          "Open", projectFile, NEnum.fromJavaEnum(fileMode), NEnum.fromJavaEnum(accessMode));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Open(
      java.lang.String projectFile,
      LlDomFileMode fileMode,
      LlDomAccessMode accessMode,
      java.lang.Boolean ignoreErrors) {
    try {
      javonetHandle.invoke(
          "Open",
          projectFile,
          NEnum.fromJavaEnum(fileMode),
          NEnum.fromJavaEnum(accessMode),
          ignoreErrors);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Open(
      java.lang.String projectFile,
      LlDomFileMode fileMode,
      LlDomAccessMode accessMode,
      LlDomSettings settings) {
    try {
      javonetHandle.invoke(
          "Open",
          projectFile,
          NEnum.fromJavaEnum(fileMode),
          NEnum.fromJavaEnum(accessMode),
          NEnum.fromJavaEnum(settings));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Save() {
    try {
      javonetHandle.invoke("Save");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Save(java.lang.String projectFile) {
    try {
      javonetHandle.invoke("Save", projectFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
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
  public void ResetInformation() {
    try {
      javonetHandle.invoke("ResetInformation");
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
