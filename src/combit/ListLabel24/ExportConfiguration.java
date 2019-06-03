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
import jio.System.IO.*;

public class ExportConfiguration {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setShowResult(java.lang.Boolean value) {
    try {
      javonetHandle.set("ShowResult", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getShowResult() {
    try {
      java.lang.Boolean res = javonetHandle.get("ShowResult");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExportTarget(LlExportTarget value) {
    try {
      javonetHandle.set("ExportTarget", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlExportTarget getExportTarget() {
    try {
      Object res = javonetHandle.<NEnum>get("ExportTarget");
      if (res == null) return null;
      return LlExportTarget.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setProjectFile(java.lang.String value) {
    try {
      javonetHandle.set("ProjectFile", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getProjectFile() {
    try {
      java.lang.String res = javonetHandle.get("ProjectFile");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPath(java.lang.String value) {
    try {
      javonetHandle.set("Path", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPath() {
    try {
      java.lang.String res = javonetHandle.get("Path");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setProjectFileStream(Stream value) {
    try {
      javonetHandle.set("ProjectFileStream", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Stream getProjectFileStream() {
    try {
      Object res = javonetHandle.<NObject>get("ProjectFileStream");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPrinterSettingsStream(Stream value) {
    try {
      javonetHandle.set("PrinterSettingsStream", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Stream getPrinterSettingsStream() {
    try {
      Object res = javonetHandle.<NObject>get("PrinterSettingsStream");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExportStream(Stream value) {
    try {
      javonetHandle.set("ExportStream", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Stream getExportStream() {
    try {
      Object res = javonetHandle.<NObject>get("ExportStream");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setProjectType(LlProject value) {
    try {
      javonetHandle.set("ProjectType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlProject getProjectType() {
    try {
      Object res = javonetHandle.<NEnum>get("ProjectType");
      if (res == null) return null;
      return LlProject.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBoxType(LlBoxType value) {
    try {
      javonetHandle.set("BoxType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlBoxType getBoxType() {
    try {
      Object res = javonetHandle.<NEnum>get("BoxType");
      if (res == null) return null;
      return LlBoxType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExportOptions(ListLabelExportOptions value) {
    try {
      javonetHandle.set("ExportOptions", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ListLabelExportOptions getExportOptions() {
    try {
      Object res = javonetHandle.<NObject>get("ExportOptions");
      if (res == null) return null;
      return new ListLabelExportOptions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ExportConfiguration(
      LlExportTarget exportTarget, java.lang.String path, java.lang.String projectFile) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.ExportConfiguration",
              NEnum.fromJavaEnum(exportTarget),
              path,
              projectFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExportConfiguration(
      LlExportTarget exportTarget, java.lang.String path, Stream projectFileStream) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.ExportConfiguration",
              NEnum.fromJavaEnum(exportTarget),
              path,
              projectFileStream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExportConfiguration(
      LlExportTarget exportTarget,
      java.lang.String path,
      Stream projectFileStream,
      Stream printerSettingsStream) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.ExportConfiguration",
              NEnum.fromJavaEnum(exportTarget),
              path,
              projectFileStream,
              printerSettingsStream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExportConfiguration(
      LlExportTarget exportTarget, Stream exportStream, Stream projectFileStream) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.ExportConfiguration",
              NEnum.fromJavaEnum(exportTarget),
              exportStream,
              projectFileStream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExportConfiguration(
      LlExportTarget exportTarget, Stream exportStream, java.lang.String projectFile) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.ExportConfiguration",
              NEnum.fromJavaEnum(exportTarget),
              exportStream,
              projectFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExportConfiguration(
      LlExportTarget exportTarget,
      Stream exportStream,
      Stream projectFileStream,
      Stream printerSettingsStream) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.ExportConfiguration",
              NEnum.fromJavaEnum(exportTarget),
              exportStream,
              projectFileStream,
              printerSettingsStream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExportConfiguration(NObject handle) {
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
