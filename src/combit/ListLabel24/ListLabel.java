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
import jio.System.ComponentModel.*;
import combit.ListLabel24.*;
import jio.System.*;
import combit.ListLabel24.DataProviders.*;
import jio.System.IO.*;
import jio.System.Windows.Forms.*;
import jio.System.Drawing.*;
import combit.ListLabel24.Repository.*;
import jio.System.Collections.Generic.*;
import jio.System.Globalization.*;
import combit.ListLabel24.DesignerExtensions.*;

public class ListLabel extends Component
    implements IComponent, IDisposable, IDesignerFunctionEnumeration, IDesignerObjectEnumeration {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setMaximumDataDefinitionRecursionDepth(java.lang.Integer value) {
    try {
      javonetHandle.set("MaximumDataDefinitionRecursionDepth", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMaximumDataDefinitionRecursionDepth() {
    try {
      java.lang.Integer res = javonetHandle.get("MaximumDataDefinitionRecursionDepth");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseTableSchemaForDesignMode(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseTableSchemaForDesignMode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseTableSchemaForDesignMode() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseTableSchemaForDesignMode");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DesignerFunctionCollection getDesignerFunctions() {
    try {
      Object res = javonetHandle.<NObject>get("DesignerFunctions");
      if (res == null) return null;
      return new DesignerFunctionCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DesignerObjectCollection getDesignerObjects() {
    try {
      Object res = javonetHandle.<NObject>get("DesignerObjects");
      if (res == null) return null;
      return new DesignerObjectCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DesignerActionCollection getDesignerActions() {
    try {
      Object res = javonetHandle.<NObject>get("DesignerActions");
      if (res == null) return null;
      return new DesignerActionCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPreviewControl(Object value) {
    try {
      javonetHandle.set("PreviewControl", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getPreviewControl() {
    try {
      Object res = javonetHandle.<NObject>get("PreviewControl");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlCore getCore() {
    try {
      Object res = javonetHandle.<NObject>get("Core");
      if (res == null) return null;
      return new LlCore((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLicensingInfo(java.lang.String value) {
    try {
      javonetHandle.set("LicensingInfo", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getLicensingInfo() {
    try {
      java.lang.String res = javonetHandle.get("LicensingInfo");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setProjectPassword(java.lang.String value) {
    try {
      javonetHandle.set("ProjectPassword", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getProjectPassword() {
    try {
      java.lang.String res = javonetHandle.get("ProjectPassword");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FieldCollection getFields() {
    try {
      Object res = javonetHandle.<NObject>get("Fields");
      if (res == null) return null;
      return new FieldCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public VariableCollection getVariables() {
    try {
      Object res = javonetHandle.<NObject>get("Variables");
      if (res == null) return null;
      return new VariableCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ChartFieldCollection getChartFields() {
    try {
      Object res = javonetHandle.<NObject>get("ChartFields");
      if (res == null) return null;
      return new ChartFieldCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLanguage(LlLanguage value) {
    try {
      javonetHandle.set("Language", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlLanguage getLanguage() {
    try {
      Object res = javonetHandle.<NEnum>get("Language");
      if (res == null) return null;
      return LlLanguage.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEnableCallbacks(java.lang.Boolean value) {
    try {
      javonetHandle.set("EnableCallbacks", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getEnableCallbacks() {
    try {
      java.lang.Boolean res = javonetHandle.get("EnableCallbacks");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCheckUsedIdentifiers(java.lang.Boolean value) {
    try {
      javonetHandle.set("CheckUsedIdentifiers", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCheckUsedIdentifiers() {
    try {
      java.lang.Boolean res = javonetHandle.get("CheckUsedIdentifiers");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDebug(LlDebug value) {
    try {
      javonetHandle.set("Debug", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlDebug getDebug() {
    try {
      Object res = javonetHandle.<NEnum>get("Debug");
      if (res == null) return null;
      return LlDebug.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDebugLogFilePath(java.lang.String value) {
    try {
      javonetHandle.set("DebugLogFilePath", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDebugLogFilePath() {
    try {
      java.lang.String res = javonetHandle.get("DebugLogFilePath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDialog3DText(LlDialog3DText value) {
    try {
      javonetHandle.set("Dialog3DText", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlDialog3DText getDialog3DText() {
    try {
      Object res = javonetHandle.<NEnum>get("Dialog3DText");
      if (res == null) return null;
      return LlDialog3DText.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDialogButtons(LlDialogBitmapButton value) {
    try {
      javonetHandle.set("DialogButtons", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlDialogBitmapButton getDialogButtons() {
    try {
      Object res = javonetHandle.<NEnum>get("DialogButtons");
      if (res == null) return null;
      return LlDialogBitmapButton.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDialogFrame(LlDialogFrame value) {
    try {
      javonetHandle.set("DialogFrame", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlDialogFrame getDialogFrame() {
    try {
      Object res = javonetHandle.<NEnum>get("DialogFrame");
      if (res == null) return null;
      return LlDialogFrame.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDialogMode(LlDialogMode value) {
    try {
      javonetHandle.set("DialogMode", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlDialogMode getDialogMode() {
    try {
      Object res = javonetHandle.<NEnum>get("DialogMode");
      if (res == null) return null;
      return LlDialogMode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAddVarsToFields(java.lang.Boolean value) {
    try {
      javonetHandle.set("AddVarsToFields", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAddVarsToFields() {
    try {
      java.lang.Boolean res = javonetHandle.get("AddVarsToFields");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoMultipage(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoMultipage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAutoMultipage() {
    try {
      java.lang.Boolean res = javonetHandle.get("AutoMultipage");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCompressStorage(java.lang.Boolean value) {
    try {
      javonetHandle.set("CompressStorage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCompressStorage() {
    try {
      java.lang.Boolean res = javonetHandle.get("CompressStorage");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setConvertCRLF(java.lang.Boolean value) {
    try {
      javonetHandle.set("ConvertCRLF", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getConvertCRLF() {
    try {
      java.lang.Boolean res = javonetHandle.get("ConvertCRLF");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCreateInfo(java.lang.Boolean value) {
    try {
      javonetHandle.set("CreateInfo", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCreateInfo() {
    try {
      java.lang.Boolean res = javonetHandle.get("CreateInfo");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoDesignerPreview(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoDesignerPreview", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAutoDesignerPreview() {
    try {
      java.lang.Boolean res = javonetHandle.get("AutoDesignerPreview");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setForceSingleThread(java.lang.Boolean value) {
    try {
      javonetHandle.set("ForceSingleThread", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getForceSingleThread() {
    try {
      java.lang.Boolean res = javonetHandle.get("ForceSingleThread");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDelayTableHeader(java.lang.Boolean value) {
    try {
      javonetHandle.set("DelayTableHeader", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDelayTableHeader() {
    try {
      java.lang.Boolean res = javonetHandle.get("DelayTableHeader");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEMFResolution(java.lang.Integer value) {
    try {
      javonetHandle.set("EMFResolution", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getEMFResolution() {
    try {
      java.lang.Integer res = javonetHandle.get("EMFResolution");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExpressionSeparator(java.lang.Integer value) {
    try {
      javonetHandle.set("ExpressionSeparator", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getExpressionSeparator() {
    try {
      java.lang.Integer res = javonetHandle.get("ExpressionSeparator");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setHelpAvailable(java.lang.Boolean value) {
    try {
      javonetHandle.set("HelpAvailable", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getHelpAvailable() {
    try {
      java.lang.Boolean res = javonetHandle.get("HelpAvailable");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIncludeFontDescent(java.lang.Boolean value) {
    try {
      javonetHandle.set("IncludeFontDescent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIncludeFontDescent() {
    try {
      java.lang.Boolean res = javonetHandle.get("IncludeFontDescent");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setInterCharSpacing(java.lang.Boolean value) {
    try {
      javonetHandle.set("InterCharSpacing", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getInterCharSpacing() {
    try {
      java.lang.Boolean res = javonetHandle.get("InterCharSpacing");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLockNextChar(java.lang.Integer value) {
    try {
      javonetHandle.set("LockNextChar", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getLockNextChar() {
    try {
      java.lang.Integer res = javonetHandle.get("LockNextChar");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMaxRTFVersion(java.lang.Integer value) {
    try {
      javonetHandle.set("MaxRTFVersion", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMaxRTFVersion() {
    try {
      java.lang.Integer res = javonetHandle.get("MaxRTFVersion");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUnit(LlUnits value) {
    try {
      javonetHandle.set("Unit", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlUnits getUnit() {
    try {
      Object res = javonetHandle.<NEnum>get("Unit");
      if (res == null) return null;
      return LlUnits.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNewExpressions(LlNewExpressions value) {
    try {
      javonetHandle.set("NewExpressions", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlNewExpressions getNewExpressions() {
    try {
      Object res = javonetHandle.<NEnum>get("NewExpressions");
      if (res == null) return null;
      return LlNewExpressions.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNoNoTableCheck(java.lang.Boolean value) {
    try {
      javonetHandle.set("NoNoTableCheck", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getNoNoTableCheck() {
    try {
      java.lang.Boolean res = javonetHandle.get("NoNoTableCheck");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNoParameterCheck(java.lang.Boolean value) {
    try {
      javonetHandle.set("NoParameterCheck", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getNoParameterCheck() {
    try {
      java.lang.Boolean res = javonetHandle.get("NoParameterCheck");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPhantomSpace(java.lang.Integer value) {
    try {
      javonetHandle.set("PhantomSpace", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPhantomSpace() {
    try {
      java.lang.Integer res = javonetHandle.get("PhantomSpace");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMaximumIterationsPerObject(java.lang.Integer value) {
    try {
      javonetHandle.set("MaximumIterationsPerObject", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMaximumIterationsPerObject() {
    try {
      java.lang.Integer res = javonetHandle.get("MaximumIterationsPerObject");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPreviewRectangle(Rectangle value) {
    try {
      javonetHandle.set("PreviewRectangle", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Rectangle getPreviewRectangle() {
    try {
      Object res = javonetHandle.<NObject>get("PreviewRectangle");
      if (res == null) return null;
      return new Rectangle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPreviewZoom(java.lang.Integer value) {
    try {
      javonetHandle.set("PreviewZoom", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPreviewZoom() {
    try {
      java.lang.Integer res = javonetHandle.get("PreviewZoom");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSortVariables(java.lang.Boolean value) {
    try {
      javonetHandle.set("SortVariables", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSortVariables() {
    try {
      java.lang.Boolean res = javonetHandle.get("SortVariables");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSpaceOptimization(java.lang.Boolean value) {
    try {
      javonetHandle.set("SpaceOptimization", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSpaceOptimization() {
    try {
      java.lang.Boolean res = javonetHandle.get("SpaceOptimization");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setStorageSystem(LlStorageSystem value) {
    try {
      javonetHandle.set("StorageSystem", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlStorageSystem getStorageSystem() {
    try {
      Object res = javonetHandle.<NEnum>get("StorageSystem");
      if (res == null) return null;
      return LlStorageSystem.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSupportPageBreak(java.lang.Boolean value) {
    try {
      javonetHandle.set("SupportPageBreak", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSupportPageBreak() {
    try {
      java.lang.Boolean res = javonetHandle.get("SupportPageBreak");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTableColoring(LlTableColoring value) {
    try {
      javonetHandle.set("TableColoring", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlTableColoring getTableColoring() {
    try {
      Object res = javonetHandle.<NEnum>get("TableColoring");
      if (res == null) return null;
      return LlTableColoring.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTab(java.lang.Integer value) {
    try {
      javonetHandle.set("Tab", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getTab() {
    try {
      java.lang.Integer res = javonetHandle.get("Tab");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTabStops(LlTabStop value) {
    try {
      javonetHandle.set("TabStops", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlTabStop getTabStops() {
    try {
      Object res = javonetHandle.<NEnum>get("TabStops");
      if (res == null) return null;
      return LlTabStop.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTextQuote(java.lang.Integer value) {
    try {
      javonetHandle.set("TextQuote", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getTextQuote() {
    try {
      java.lang.Integer res = javonetHandle.get("TextQuote");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseBarcodeSizes(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseBarcodeSizes", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseBarcodeSizes() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseBarcodeSizes");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseChartFields(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseChartFields", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseChartFields() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseChartFields");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseHostprinter(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseHostprinter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseHostprinter() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseHostprinter");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setVarsCaseSensitive(java.lang.Boolean value) {
    try {
      javonetHandle.set("VarsCaseSensitive", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getVarsCaseSensitive() {
    try {
      java.lang.Boolean res = javonetHandle.get("VarsCaseSensitive");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setXlatVarNames(java.lang.Boolean value) {
    try {
      javonetHandle.set("XlatVarNames", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getXlatVarNames() {
    try {
      java.lang.Boolean res = javonetHandle.get("XlatVarNames");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNoPrintJobSupervision(java.lang.Boolean value) {
    try {
      javonetHandle.set("NoPrintJobSupervision", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getNoPrintJobSupervision() {
    try {
      java.lang.Boolean res = javonetHandle.get("NoPrintJobSupervision");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseHardwareCopiesForLabels(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseHardwareCopiesForLabels", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseHardwareCopiesForLabels() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseHardwareCopiesForLabels");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsDesigning() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsDesigning");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDataBindingMode(DataBindingMode value) {
    try {
      javonetHandle.set("DataBindingMode", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DataBindingMode getDataBindingMode() {
    try {
      Object res = javonetHandle.<NEnum>get("DataBindingMode");
      if (res == null) return null;
      return DataBindingMode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDrilldownAvailable(java.lang.Boolean value) {
    try {
      javonetHandle.set("DrilldownAvailable", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDrilldownAvailable() {
    try {
      java.lang.Boolean res = javonetHandle.get("DrilldownAvailable");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ProjectParameters getProjectParameters() {
    try {
      Object res = javonetHandle.<NObject>get("ProjectParameters");
      if (res == null) return null;
      return new ProjectParameters((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FileExtensions getFileExtensions() {
    try {
      Object res = javonetHandle.<NObject>get("FileExtensions");
      if (res == null) return null;
      return new FileExtensions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IQueryableLocalizationDictionary getDictionary() {
    try {
      Object res = javonetHandle.<NObject>get("Dictionary");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIncrementalPreview(java.lang.Boolean value) {
    try {
      javonetHandle.set("IncrementalPreview", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIncrementalPreview() {
    try {
      java.lang.Boolean res = javonetHandle.get("IncrementalPreview");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ListLabelDesignerWorkspace getDesignerWorkspace() {
    try {
      Object res = javonetHandle.<NObject>get("DesignerWorkspace");
      if (res == null) return null;
      return new ListLabelDesignerWorkspace((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setInplaceDesignerHandle(IntPtr value) {
    try {
      javonetHandle.set("InplaceDesignerHandle", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IntPtr getInplaceDesignerHandle() {
    try {
      Object res = javonetHandle.<NObject>get("InplaceDesignerHandle");
      if (res == null) return null;
      return (jio.System.IntPtr) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setGenericMaximumRecordCount(java.lang.Integer value) {
    try {
      javonetHandle.set("GenericMaximumRecordCount", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getGenericMaximumRecordCount() {
    try {
      java.lang.Integer res = javonetHandle.get("GenericMaximumRecordCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFileRepository(IRepository value) {
    try {
      javonetHandle.set("FileRepository", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IRepository getFileRepository() {
    try {
      Object res = javonetHandle.<NObject>get("FileRepository");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTableAdapters(List<Component> value) {
    try {
      javonetHandle.set("TableAdapters", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<Component> getTableAdapters() {
    try {
      Object res = javonetHandle.<NObject>get("TableAdapters");
      if (res == null) return null;
      return new List<Component>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDataSource(Object value) {
    try {
      javonetHandle.set("DataSource", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getDataSource() {
    try {
      Object res = javonetHandle.<NObject>get("DataSource");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDataMember(java.lang.String value) {
    try {
      javonetHandle.set("DataMember", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDataMember() {
    try {
      java.lang.String res = javonetHandle.get("DataMember");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoProjectStream(Stream value) {
    try {
      javonetHandle.set("AutoProjectStream", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Stream getAutoProjectStream() {
    try {
      Object res = javonetHandle.<NObject>get("AutoProjectStream");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoPrinterSettingsStream(Stream value) {
    try {
      javonetHandle.set("AutoPrinterSettingsStream", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Stream getAutoPrinterSettingsStream() {
    try {
      Object res = javonetHandle.<NObject>get("AutoPrinterSettingsStream");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoProjectFile(java.lang.String value) {
    try {
      javonetHandle.set("AutoProjectFile", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getAutoProjectFile() {
    try {
      java.lang.String res = javonetHandle.get("AutoProjectFile");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoDestination(LlPrintMode value) {
    try {
      javonetHandle.set("AutoDestination", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlPrintMode getAutoDestination() {
    try {
      Object res = javonetHandle.<NEnum>get("AutoDestination");
      if (res == null) return null;
      return LlPrintMode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoDialogTitle(java.lang.String value) {
    try {
      javonetHandle.set("AutoDialogTitle", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getAutoDialogTitle() {
    try {
      java.lang.String res = javonetHandle.get("AutoDialogTitle");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoBoxType(LlBoxType value) {
    try {
      javonetHandle.set("AutoBoxType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlBoxType getAutoBoxType() {
    try {
      Object res = javonetHandle.<NEnum>get("AutoBoxType");
      if (res == null) return null;
      return LlBoxType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoMasterMode(LlAutoMasterMode value) {
    try {
      javonetHandle.set("AutoMasterMode", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlAutoMasterMode getAutoMasterMode() {
    try {
      Object res = javonetHandle.<NEnum>get("AutoMasterMode");
      if (res == null) return null;
      return LlAutoMasterMode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoProjectType(LlProject value) {
    try {
      javonetHandle.set("AutoProjectType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlProject getAutoProjectType() {
    try {
      Object res = javonetHandle.<NEnum>get("AutoProjectType");
      if (res == null) return null;
      return LlProject.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoFileAlsoNew(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoFileAlsoNew", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAutoFileAlsoNew() {
    try {
      java.lang.Boolean res = javonetHandle.get("AutoFileAlsoNew");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoShowPrintOptions(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoShowPrintOptions", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAutoShowPrintOptions() {
    try {
      java.lang.Boolean res = javonetHandle.get("AutoShowPrintOptions");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoShowSelectFile(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoShowSelectFile", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAutoShowSelectFile() {
    try {
      java.lang.Boolean res = javonetHandle.get("AutoShowSelectFile");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getLastProjectFile() {
    try {
      java.lang.String res = javonetHandle.get("LastProjectFile");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWebDesignerMode(java.lang.Boolean value) {
    try {
      javonetHandle.set("WebDesignerMode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getWebDesignerMode() {
    try {
      java.lang.Boolean res = javonetHandle.get("WebDesignerMode");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNewDataBindingMode(java.lang.Boolean value) {
    try {
      javonetHandle.set("NewDataBindingMode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getNewDataBindingMode() {
    try {
      java.lang.Boolean res = javonetHandle.get("NewDataBindingMode");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public ListLabel(IContainer container) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ListLabel", container);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "AutoDefineField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineVariable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineVariableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewLineHandler handler : _AutoDefineNewLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewPageHandler handler : _AutoDefineNewPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableSortOrder",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableSortOrderListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableRelation",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableRelationListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineVariables",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineVariablesHandler handler : _DefineVariablesListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineFields",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineFieldsHandler handler : _DefineFieldsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefinePrintOptions",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefinePrintOptionsHandler handler : _DefinePrintOptionsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ShowHelp",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ShowHelpHandler handler : _ShowHelpListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ShowHelpEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnableMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EnableMenuHandler handler : _EnableMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EnableMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ModifyMenuHandler handler : _ModifyMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMetafile",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ModifyMetafileEventArgs> handler : _ModifyMetafileListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMetafileEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameForExportJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameForExportJobEventArgs> handler :
                  _QueryFileNameForExportJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameForExportJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyMetafilePage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyEmfPageEventArgs> handler : _NotifyMetafilePageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyEmfPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SelectMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SelectMenuHandler handler : _SelectMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SelectMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonState",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonStateHandler handler : _ViewerButtonStateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonStateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonClicked",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonClickedHandler handler : _ViewerButtonClickedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "VariableHelpText",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (VariableHelpTextHandler handler : _VariableHelpTextListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], VariableHelpTextEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ExpressionError",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ExpressionErrorHandler handler : _ExpressionErrorListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ExpressionErrorEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FailsFilter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FailsFilterHandler handler : _FailsFilterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesCreate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesCreateHandler handler : _ChangeDCPropertiesCreateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesCreateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesPageHandler handler : _ChangeDCPropertiesPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesDoc",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesDocHandler handler : _ChangeDCPropertiesDocListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesDocEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "InfoMeter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (InfoMeterHandler handler : _InfoMeterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], InfoMeterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableLineHandler handler : _DrawTableLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableFieldHandler handler : _DrawTableFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableFieldEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawProject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawProjectHandler handler : _DrawProjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawProjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawPageHandler handler : _DrawPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawObject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawObjectHandler handler : _DrawObjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawObjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HostPrinter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HostPrinterHandler handler : _HostPrinterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HostPrinterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evaluate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EvaluateHandler handler : _EvaluateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EvaluateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintJobInfo",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PrintJobInfoHandler handler : _PrintJobInfoListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PrintJobInfoEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveFilename",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SaveFilenameHandler handler : _SaveFilenameListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveFilenameEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyProgress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (NotifyProgressHandler handler : _NotifyProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyProgressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ProjectLoaded",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ProjectLoadedHandler handler : _ProjectLoadedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DesignerPrintJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DesignerPrintJobHandler handler : _DesignerPrintJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DesignerPrintJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintingFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _PrintingFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollected",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollectionFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectionFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExported",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportedEventArgs> handler : _PageExportedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExportFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportFinishedEventArgs> handler :
                  _PageExportFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportFinishedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HandleHyperlinkAction",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<HyperLinkClickedEventArgs> handler :
                  _HandleHyperlinkActionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HyperLinkClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler : _SaveReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestoreReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler :
                  _RestoreReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TriggeredJobInUIThread",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<TriggeredJobInUIThreadEventArgs> handler :
                  _TriggeredJobInUIThreadListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TriggeredJobInUIThreadEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DelayedValue",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DelayedValueEventArgs> handler : _DelayedValueListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DelayedValueEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerPrint",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerPrintEventArgs> handler : _ViewerPrintListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerPrintEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyFrameHandle",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyFrameHandleEventArgs> handler : _NotifyFrameHandleListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyFrameHandleEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineDatastructure",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DefineDatastructureEventArgs> handler :
                  _DefineDatastructureListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineDatastructureEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryObjectLoadAllowed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryObjectLoadAllowedEventArgs> handler :
                  _QueryObjectLoadAllowedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryObjectLoadAllowedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameReplacement",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameReplacementEventArgs> handler :
                  _QueryFileNameReplacementListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameReplacementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BeforeProjectImport",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<BeforeProjectImportEventArgs> handler :
                  _BeforeProjectImportListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BeforeProjectImportEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerActionResult",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerActionResultEventArgs> handler :
                  _ViewerActionResultListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerActionResultEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabel() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ListLabel");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "AutoDefineField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineVariable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineVariableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewLineHandler handler : _AutoDefineNewLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewPageHandler handler : _AutoDefineNewPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableSortOrder",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableSortOrderListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableRelation",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableRelationListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineVariables",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineVariablesHandler handler : _DefineVariablesListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineFields",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineFieldsHandler handler : _DefineFieldsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefinePrintOptions",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefinePrintOptionsHandler handler : _DefinePrintOptionsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ShowHelp",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ShowHelpHandler handler : _ShowHelpListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ShowHelpEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnableMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EnableMenuHandler handler : _EnableMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EnableMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ModifyMenuHandler handler : _ModifyMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMetafile",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ModifyMetafileEventArgs> handler : _ModifyMetafileListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMetafileEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameForExportJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameForExportJobEventArgs> handler :
                  _QueryFileNameForExportJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameForExportJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyMetafilePage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyEmfPageEventArgs> handler : _NotifyMetafilePageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyEmfPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SelectMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SelectMenuHandler handler : _SelectMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SelectMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonState",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonStateHandler handler : _ViewerButtonStateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonStateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonClicked",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonClickedHandler handler : _ViewerButtonClickedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "VariableHelpText",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (VariableHelpTextHandler handler : _VariableHelpTextListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], VariableHelpTextEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ExpressionError",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ExpressionErrorHandler handler : _ExpressionErrorListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ExpressionErrorEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FailsFilter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FailsFilterHandler handler : _FailsFilterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesCreate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesCreateHandler handler : _ChangeDCPropertiesCreateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesCreateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesPageHandler handler : _ChangeDCPropertiesPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesDoc",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesDocHandler handler : _ChangeDCPropertiesDocListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesDocEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "InfoMeter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (InfoMeterHandler handler : _InfoMeterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], InfoMeterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableLineHandler handler : _DrawTableLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableFieldHandler handler : _DrawTableFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableFieldEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawProject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawProjectHandler handler : _DrawProjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawProjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawPageHandler handler : _DrawPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawObject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawObjectHandler handler : _DrawObjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawObjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HostPrinter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HostPrinterHandler handler : _HostPrinterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HostPrinterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evaluate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EvaluateHandler handler : _EvaluateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EvaluateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintJobInfo",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PrintJobInfoHandler handler : _PrintJobInfoListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PrintJobInfoEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveFilename",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SaveFilenameHandler handler : _SaveFilenameListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveFilenameEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyProgress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (NotifyProgressHandler handler : _NotifyProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyProgressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ProjectLoaded",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ProjectLoadedHandler handler : _ProjectLoadedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DesignerPrintJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DesignerPrintJobHandler handler : _DesignerPrintJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DesignerPrintJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintingFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _PrintingFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollected",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollectionFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectionFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExported",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportedEventArgs> handler : _PageExportedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExportFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportFinishedEventArgs> handler :
                  _PageExportFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportFinishedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HandleHyperlinkAction",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<HyperLinkClickedEventArgs> handler :
                  _HandleHyperlinkActionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HyperLinkClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler : _SaveReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestoreReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler :
                  _RestoreReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TriggeredJobInUIThread",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<TriggeredJobInUIThreadEventArgs> handler :
                  _TriggeredJobInUIThreadListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TriggeredJobInUIThreadEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DelayedValue",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DelayedValueEventArgs> handler : _DelayedValueListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DelayedValueEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerPrint",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerPrintEventArgs> handler : _ViewerPrintListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerPrintEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyFrameHandle",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyFrameHandleEventArgs> handler : _NotifyFrameHandleListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyFrameHandleEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineDatastructure",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DefineDatastructureEventArgs> handler :
                  _DefineDatastructureListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineDatastructureEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryObjectLoadAllowed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryObjectLoadAllowedEventArgs> handler :
                  _QueryObjectLoadAllowedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryObjectLoadAllowedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameReplacement",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameReplacementEventArgs> handler :
                  _QueryFileNameReplacementListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameReplacementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BeforeProjectImport",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<BeforeProjectImportEventArgs> handler :
                  _BeforeProjectImportListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BeforeProjectImportEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerActionResult",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerActionResultEventArgs> handler :
                  _ViewerActionResultListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerActionResultEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabel(ILlLogger logger) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ListLabel", logger);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "AutoDefineField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineVariable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineVariableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewLineHandler handler : _AutoDefineNewLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewPageHandler handler : _AutoDefineNewPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableSortOrder",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableSortOrderListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableRelation",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableRelationListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineVariables",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineVariablesHandler handler : _DefineVariablesListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineFields",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineFieldsHandler handler : _DefineFieldsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefinePrintOptions",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefinePrintOptionsHandler handler : _DefinePrintOptionsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ShowHelp",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ShowHelpHandler handler : _ShowHelpListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ShowHelpEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnableMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EnableMenuHandler handler : _EnableMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EnableMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ModifyMenuHandler handler : _ModifyMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMetafile",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ModifyMetafileEventArgs> handler : _ModifyMetafileListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMetafileEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameForExportJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameForExportJobEventArgs> handler :
                  _QueryFileNameForExportJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameForExportJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyMetafilePage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyEmfPageEventArgs> handler : _NotifyMetafilePageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyEmfPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SelectMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SelectMenuHandler handler : _SelectMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SelectMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonState",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonStateHandler handler : _ViewerButtonStateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonStateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonClicked",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonClickedHandler handler : _ViewerButtonClickedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "VariableHelpText",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (VariableHelpTextHandler handler : _VariableHelpTextListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], VariableHelpTextEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ExpressionError",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ExpressionErrorHandler handler : _ExpressionErrorListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ExpressionErrorEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FailsFilter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FailsFilterHandler handler : _FailsFilterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesCreate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesCreateHandler handler : _ChangeDCPropertiesCreateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesCreateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesPageHandler handler : _ChangeDCPropertiesPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesDoc",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesDocHandler handler : _ChangeDCPropertiesDocListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesDocEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "InfoMeter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (InfoMeterHandler handler : _InfoMeterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], InfoMeterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableLineHandler handler : _DrawTableLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableFieldHandler handler : _DrawTableFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableFieldEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawProject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawProjectHandler handler : _DrawProjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawProjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawPageHandler handler : _DrawPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawObject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawObjectHandler handler : _DrawObjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawObjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HostPrinter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HostPrinterHandler handler : _HostPrinterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HostPrinterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evaluate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EvaluateHandler handler : _EvaluateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EvaluateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintJobInfo",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PrintJobInfoHandler handler : _PrintJobInfoListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PrintJobInfoEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveFilename",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SaveFilenameHandler handler : _SaveFilenameListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveFilenameEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyProgress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (NotifyProgressHandler handler : _NotifyProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyProgressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ProjectLoaded",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ProjectLoadedHandler handler : _ProjectLoadedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DesignerPrintJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DesignerPrintJobHandler handler : _DesignerPrintJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DesignerPrintJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintingFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _PrintingFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollected",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollectionFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectionFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExported",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportedEventArgs> handler : _PageExportedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExportFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportFinishedEventArgs> handler :
                  _PageExportFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportFinishedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HandleHyperlinkAction",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<HyperLinkClickedEventArgs> handler :
                  _HandleHyperlinkActionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HyperLinkClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler : _SaveReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestoreReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler :
                  _RestoreReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TriggeredJobInUIThread",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<TriggeredJobInUIThreadEventArgs> handler :
                  _TriggeredJobInUIThreadListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TriggeredJobInUIThreadEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DelayedValue",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DelayedValueEventArgs> handler : _DelayedValueListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DelayedValueEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerPrint",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerPrintEventArgs> handler : _ViewerPrintListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerPrintEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyFrameHandle",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyFrameHandleEventArgs> handler : _NotifyFrameHandleListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyFrameHandleEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineDatastructure",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DefineDatastructureEventArgs> handler :
                  _DefineDatastructureListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineDatastructureEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryObjectLoadAllowed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryObjectLoadAllowedEventArgs> handler :
                  _QueryObjectLoadAllowedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryObjectLoadAllowedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameReplacement",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameReplacementEventArgs> handler :
                  _QueryFileNameReplacementListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameReplacementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BeforeProjectImport",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<BeforeProjectImportEventArgs> handler :
                  _BeforeProjectImportListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BeforeProjectImportEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerActionResult",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerActionResultEventArgs> handler :
                  _ViewerActionResultListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerActionResultEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabel(LlLanguage language, ILlLogger logger) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("combit.ListLabel24.ListLabel", NEnum.fromJavaEnum(language), logger);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "AutoDefineField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineVariable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineVariableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewLineHandler handler : _AutoDefineNewLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewPageHandler handler : _AutoDefineNewPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableSortOrder",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableSortOrderListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableRelation",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableRelationListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineVariables",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineVariablesHandler handler : _DefineVariablesListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineFields",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineFieldsHandler handler : _DefineFieldsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefinePrintOptions",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefinePrintOptionsHandler handler : _DefinePrintOptionsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ShowHelp",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ShowHelpHandler handler : _ShowHelpListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ShowHelpEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnableMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EnableMenuHandler handler : _EnableMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EnableMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ModifyMenuHandler handler : _ModifyMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMetafile",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ModifyMetafileEventArgs> handler : _ModifyMetafileListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMetafileEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameForExportJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameForExportJobEventArgs> handler :
                  _QueryFileNameForExportJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameForExportJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyMetafilePage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyEmfPageEventArgs> handler : _NotifyMetafilePageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyEmfPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SelectMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SelectMenuHandler handler : _SelectMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SelectMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonState",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonStateHandler handler : _ViewerButtonStateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonStateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonClicked",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonClickedHandler handler : _ViewerButtonClickedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "VariableHelpText",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (VariableHelpTextHandler handler : _VariableHelpTextListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], VariableHelpTextEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ExpressionError",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ExpressionErrorHandler handler : _ExpressionErrorListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ExpressionErrorEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FailsFilter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FailsFilterHandler handler : _FailsFilterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesCreate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesCreateHandler handler : _ChangeDCPropertiesCreateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesCreateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesPageHandler handler : _ChangeDCPropertiesPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesDoc",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesDocHandler handler : _ChangeDCPropertiesDocListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesDocEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "InfoMeter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (InfoMeterHandler handler : _InfoMeterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], InfoMeterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableLineHandler handler : _DrawTableLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableFieldHandler handler : _DrawTableFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableFieldEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawProject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawProjectHandler handler : _DrawProjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawProjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawPageHandler handler : _DrawPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawObject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawObjectHandler handler : _DrawObjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawObjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HostPrinter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HostPrinterHandler handler : _HostPrinterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HostPrinterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evaluate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EvaluateHandler handler : _EvaluateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EvaluateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintJobInfo",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PrintJobInfoHandler handler : _PrintJobInfoListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PrintJobInfoEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveFilename",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SaveFilenameHandler handler : _SaveFilenameListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveFilenameEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyProgress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (NotifyProgressHandler handler : _NotifyProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyProgressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ProjectLoaded",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ProjectLoadedHandler handler : _ProjectLoadedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DesignerPrintJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DesignerPrintJobHandler handler : _DesignerPrintJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DesignerPrintJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintingFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _PrintingFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollected",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollectionFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectionFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExported",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportedEventArgs> handler : _PageExportedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExportFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportFinishedEventArgs> handler :
                  _PageExportFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportFinishedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HandleHyperlinkAction",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<HyperLinkClickedEventArgs> handler :
                  _HandleHyperlinkActionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HyperLinkClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler : _SaveReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestoreReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler :
                  _RestoreReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TriggeredJobInUIThread",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<TriggeredJobInUIThreadEventArgs> handler :
                  _TriggeredJobInUIThreadListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TriggeredJobInUIThreadEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DelayedValue",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DelayedValueEventArgs> handler : _DelayedValueListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DelayedValueEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerPrint",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerPrintEventArgs> handler : _ViewerPrintListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerPrintEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyFrameHandle",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyFrameHandleEventArgs> handler : _NotifyFrameHandleListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyFrameHandleEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineDatastructure",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DefineDatastructureEventArgs> handler :
                  _DefineDatastructureListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineDatastructureEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryObjectLoadAllowed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryObjectLoadAllowedEventArgs> handler :
                  _QueryObjectLoadAllowedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryObjectLoadAllowedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameReplacement",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameReplacementEventArgs> handler :
                  _QueryFileNameReplacementListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameReplacementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BeforeProjectImport",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<BeforeProjectImportEventArgs> handler :
                  _BeforeProjectImportListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BeforeProjectImportEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerActionResult",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerActionResultEventArgs> handler :
                  _ViewerActionResultListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerActionResultEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabel(LlLanguage language) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ListLabel", NEnum.fromJavaEnum(language));
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "AutoDefineField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineVariable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineVariableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewLineHandler handler : _AutoDefineNewLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewPageHandler handler : _AutoDefineNewPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableSortOrder",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableSortOrderListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableRelation",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableRelationListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineVariables",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineVariablesHandler handler : _DefineVariablesListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineFields",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineFieldsHandler handler : _DefineFieldsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefinePrintOptions",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefinePrintOptionsHandler handler : _DefinePrintOptionsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ShowHelp",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ShowHelpHandler handler : _ShowHelpListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ShowHelpEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnableMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EnableMenuHandler handler : _EnableMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EnableMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ModifyMenuHandler handler : _ModifyMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMetafile",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ModifyMetafileEventArgs> handler : _ModifyMetafileListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMetafileEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameForExportJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameForExportJobEventArgs> handler :
                  _QueryFileNameForExportJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameForExportJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyMetafilePage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyEmfPageEventArgs> handler : _NotifyMetafilePageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyEmfPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SelectMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SelectMenuHandler handler : _SelectMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SelectMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonState",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonStateHandler handler : _ViewerButtonStateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonStateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonClicked",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonClickedHandler handler : _ViewerButtonClickedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "VariableHelpText",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (VariableHelpTextHandler handler : _VariableHelpTextListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], VariableHelpTextEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ExpressionError",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ExpressionErrorHandler handler : _ExpressionErrorListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ExpressionErrorEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FailsFilter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FailsFilterHandler handler : _FailsFilterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesCreate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesCreateHandler handler : _ChangeDCPropertiesCreateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesCreateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesPageHandler handler : _ChangeDCPropertiesPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesDoc",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesDocHandler handler : _ChangeDCPropertiesDocListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesDocEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "InfoMeter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (InfoMeterHandler handler : _InfoMeterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], InfoMeterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableLineHandler handler : _DrawTableLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableFieldHandler handler : _DrawTableFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableFieldEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawProject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawProjectHandler handler : _DrawProjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawProjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawPageHandler handler : _DrawPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawObject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawObjectHandler handler : _DrawObjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawObjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HostPrinter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HostPrinterHandler handler : _HostPrinterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HostPrinterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evaluate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EvaluateHandler handler : _EvaluateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EvaluateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintJobInfo",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PrintJobInfoHandler handler : _PrintJobInfoListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PrintJobInfoEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveFilename",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SaveFilenameHandler handler : _SaveFilenameListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveFilenameEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyProgress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (NotifyProgressHandler handler : _NotifyProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyProgressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ProjectLoaded",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ProjectLoadedHandler handler : _ProjectLoadedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DesignerPrintJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DesignerPrintJobHandler handler : _DesignerPrintJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DesignerPrintJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintingFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _PrintingFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollected",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollectionFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectionFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExported",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportedEventArgs> handler : _PageExportedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExportFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportFinishedEventArgs> handler :
                  _PageExportFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportFinishedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HandleHyperlinkAction",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<HyperLinkClickedEventArgs> handler :
                  _HandleHyperlinkActionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HyperLinkClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler : _SaveReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestoreReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler :
                  _RestoreReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TriggeredJobInUIThread",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<TriggeredJobInUIThreadEventArgs> handler :
                  _TriggeredJobInUIThreadListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TriggeredJobInUIThreadEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DelayedValue",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DelayedValueEventArgs> handler : _DelayedValueListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DelayedValueEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerPrint",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerPrintEventArgs> handler : _ViewerPrintListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerPrintEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyFrameHandle",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyFrameHandleEventArgs> handler : _NotifyFrameHandleListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyFrameHandleEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineDatastructure",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DefineDatastructureEventArgs> handler :
                  _DefineDatastructureListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineDatastructureEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryObjectLoadAllowed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryObjectLoadAllowedEventArgs> handler :
                  _QueryObjectLoadAllowedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryObjectLoadAllowedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameReplacement",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameReplacementEventArgs> handler :
                  _QueryFileNameReplacementListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameReplacementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BeforeProjectImport",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<BeforeProjectImportEventArgs> handler :
                  _BeforeProjectImportListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BeforeProjectImportEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerActionResult",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerActionResultEventArgs> handler :
                  _ViewerActionResultListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerActionResultEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabel(LlLanguage language, java.lang.Boolean enableCallbacks) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.ListLabel", NEnum.fromJavaEnum(language), enableCallbacks);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "AutoDefineField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineVariable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineVariableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewLineHandler handler : _AutoDefineNewLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewPageHandler handler : _AutoDefineNewPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableSortOrder",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableSortOrderListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableRelation",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableRelationListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineVariables",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineVariablesHandler handler : _DefineVariablesListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineFields",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineFieldsHandler handler : _DefineFieldsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefinePrintOptions",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefinePrintOptionsHandler handler : _DefinePrintOptionsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ShowHelp",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ShowHelpHandler handler : _ShowHelpListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ShowHelpEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnableMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EnableMenuHandler handler : _EnableMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EnableMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ModifyMenuHandler handler : _ModifyMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMetafile",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ModifyMetafileEventArgs> handler : _ModifyMetafileListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMetafileEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameForExportJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameForExportJobEventArgs> handler :
                  _QueryFileNameForExportJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameForExportJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyMetafilePage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyEmfPageEventArgs> handler : _NotifyMetafilePageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyEmfPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SelectMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SelectMenuHandler handler : _SelectMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SelectMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonState",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonStateHandler handler : _ViewerButtonStateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonStateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonClicked",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonClickedHandler handler : _ViewerButtonClickedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "VariableHelpText",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (VariableHelpTextHandler handler : _VariableHelpTextListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], VariableHelpTextEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ExpressionError",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ExpressionErrorHandler handler : _ExpressionErrorListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ExpressionErrorEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FailsFilter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FailsFilterHandler handler : _FailsFilterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesCreate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesCreateHandler handler : _ChangeDCPropertiesCreateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesCreateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesPageHandler handler : _ChangeDCPropertiesPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesDoc",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesDocHandler handler : _ChangeDCPropertiesDocListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesDocEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "InfoMeter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (InfoMeterHandler handler : _InfoMeterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], InfoMeterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableLineHandler handler : _DrawTableLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableFieldHandler handler : _DrawTableFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableFieldEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawProject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawProjectHandler handler : _DrawProjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawProjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawPageHandler handler : _DrawPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawObject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawObjectHandler handler : _DrawObjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawObjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HostPrinter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HostPrinterHandler handler : _HostPrinterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HostPrinterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evaluate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EvaluateHandler handler : _EvaluateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EvaluateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintJobInfo",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PrintJobInfoHandler handler : _PrintJobInfoListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PrintJobInfoEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveFilename",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SaveFilenameHandler handler : _SaveFilenameListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveFilenameEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyProgress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (NotifyProgressHandler handler : _NotifyProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyProgressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ProjectLoaded",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ProjectLoadedHandler handler : _ProjectLoadedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DesignerPrintJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DesignerPrintJobHandler handler : _DesignerPrintJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DesignerPrintJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintingFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _PrintingFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollected",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollectionFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectionFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExported",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportedEventArgs> handler : _PageExportedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExportFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportFinishedEventArgs> handler :
                  _PageExportFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportFinishedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HandleHyperlinkAction",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<HyperLinkClickedEventArgs> handler :
                  _HandleHyperlinkActionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HyperLinkClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler : _SaveReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestoreReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler :
                  _RestoreReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TriggeredJobInUIThread",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<TriggeredJobInUIThreadEventArgs> handler :
                  _TriggeredJobInUIThreadListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TriggeredJobInUIThreadEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DelayedValue",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DelayedValueEventArgs> handler : _DelayedValueListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DelayedValueEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerPrint",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerPrintEventArgs> handler : _ViewerPrintListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerPrintEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyFrameHandle",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyFrameHandleEventArgs> handler : _NotifyFrameHandleListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyFrameHandleEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineDatastructure",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DefineDatastructureEventArgs> handler :
                  _DefineDatastructureListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineDatastructureEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryObjectLoadAllowed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryObjectLoadAllowedEventArgs> handler :
                  _QueryObjectLoadAllowedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryObjectLoadAllowedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameReplacement",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameReplacementEventArgs> handler :
                  _QueryFileNameReplacementListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameReplacementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BeforeProjectImport",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<BeforeProjectImportEventArgs> handler :
                  _BeforeProjectImportListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BeforeProjectImportEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerActionResult",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerActionResultEventArgs> handler :
                  _ViewerActionResultListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerActionResultEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabel(
      LlLanguage language, java.lang.Boolean enableCallbacks, java.lang.String debugLogFilePath) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.ListLabel",
              NEnum.fromJavaEnum(language),
              enableCallbacks,
              debugLogFilePath);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "AutoDefineField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineVariable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineVariableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewLineHandler handler : _AutoDefineNewLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewPageHandler handler : _AutoDefineNewPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableSortOrder",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableSortOrderListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableRelation",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableRelationListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineVariables",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineVariablesHandler handler : _DefineVariablesListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineFields",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineFieldsHandler handler : _DefineFieldsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefinePrintOptions",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefinePrintOptionsHandler handler : _DefinePrintOptionsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ShowHelp",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ShowHelpHandler handler : _ShowHelpListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ShowHelpEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnableMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EnableMenuHandler handler : _EnableMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EnableMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ModifyMenuHandler handler : _ModifyMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMetafile",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ModifyMetafileEventArgs> handler : _ModifyMetafileListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMetafileEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameForExportJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameForExportJobEventArgs> handler :
                  _QueryFileNameForExportJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameForExportJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyMetafilePage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyEmfPageEventArgs> handler : _NotifyMetafilePageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyEmfPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SelectMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SelectMenuHandler handler : _SelectMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SelectMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonState",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonStateHandler handler : _ViewerButtonStateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonStateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonClicked",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonClickedHandler handler : _ViewerButtonClickedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "VariableHelpText",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (VariableHelpTextHandler handler : _VariableHelpTextListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], VariableHelpTextEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ExpressionError",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ExpressionErrorHandler handler : _ExpressionErrorListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ExpressionErrorEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FailsFilter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FailsFilterHandler handler : _FailsFilterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesCreate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesCreateHandler handler : _ChangeDCPropertiesCreateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesCreateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesPageHandler handler : _ChangeDCPropertiesPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesDoc",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesDocHandler handler : _ChangeDCPropertiesDocListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesDocEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "InfoMeter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (InfoMeterHandler handler : _InfoMeterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], InfoMeterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableLineHandler handler : _DrawTableLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableFieldHandler handler : _DrawTableFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableFieldEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawProject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawProjectHandler handler : _DrawProjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawProjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawPageHandler handler : _DrawPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawObject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawObjectHandler handler : _DrawObjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawObjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HostPrinter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HostPrinterHandler handler : _HostPrinterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HostPrinterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evaluate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EvaluateHandler handler : _EvaluateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EvaluateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintJobInfo",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PrintJobInfoHandler handler : _PrintJobInfoListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PrintJobInfoEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveFilename",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SaveFilenameHandler handler : _SaveFilenameListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveFilenameEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyProgress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (NotifyProgressHandler handler : _NotifyProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyProgressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ProjectLoaded",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ProjectLoadedHandler handler : _ProjectLoadedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DesignerPrintJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DesignerPrintJobHandler handler : _DesignerPrintJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DesignerPrintJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintingFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _PrintingFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollected",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollectionFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectionFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExported",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportedEventArgs> handler : _PageExportedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExportFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportFinishedEventArgs> handler :
                  _PageExportFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportFinishedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HandleHyperlinkAction",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<HyperLinkClickedEventArgs> handler :
                  _HandleHyperlinkActionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HyperLinkClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler : _SaveReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestoreReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler :
                  _RestoreReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TriggeredJobInUIThread",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<TriggeredJobInUIThreadEventArgs> handler :
                  _TriggeredJobInUIThreadListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TriggeredJobInUIThreadEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DelayedValue",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DelayedValueEventArgs> handler : _DelayedValueListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DelayedValueEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerPrint",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerPrintEventArgs> handler : _ViewerPrintListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerPrintEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyFrameHandle",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyFrameHandleEventArgs> handler : _NotifyFrameHandleListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyFrameHandleEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineDatastructure",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DefineDatastructureEventArgs> handler :
                  _DefineDatastructureListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineDatastructureEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryObjectLoadAllowed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryObjectLoadAllowedEventArgs> handler :
                  _QueryObjectLoadAllowedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryObjectLoadAllowedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameReplacement",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameReplacementEventArgs> handler :
                  _QueryFileNameReplacementListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameReplacementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BeforeProjectImport",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<BeforeProjectImportEventArgs> handler :
                  _BeforeProjectImportListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BeforeProjectImportEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerActionResult",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerActionResultEventArgs> handler :
                  _ViewerActionResultListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerActionResultEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabel(CultureInfo culture) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ListLabel", culture);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "AutoDefineField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineVariable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineVariableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewLineHandler handler : _AutoDefineNewLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewPageHandler handler : _AutoDefineNewPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableSortOrder",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableSortOrderListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableRelation",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableRelationListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineVariables",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineVariablesHandler handler : _DefineVariablesListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineFields",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineFieldsHandler handler : _DefineFieldsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefinePrintOptions",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefinePrintOptionsHandler handler : _DefinePrintOptionsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ShowHelp",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ShowHelpHandler handler : _ShowHelpListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ShowHelpEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnableMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EnableMenuHandler handler : _EnableMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EnableMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ModifyMenuHandler handler : _ModifyMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMetafile",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ModifyMetafileEventArgs> handler : _ModifyMetafileListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMetafileEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameForExportJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameForExportJobEventArgs> handler :
                  _QueryFileNameForExportJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameForExportJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyMetafilePage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyEmfPageEventArgs> handler : _NotifyMetafilePageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyEmfPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SelectMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SelectMenuHandler handler : _SelectMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SelectMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonState",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonStateHandler handler : _ViewerButtonStateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonStateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonClicked",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonClickedHandler handler : _ViewerButtonClickedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "VariableHelpText",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (VariableHelpTextHandler handler : _VariableHelpTextListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], VariableHelpTextEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ExpressionError",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ExpressionErrorHandler handler : _ExpressionErrorListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ExpressionErrorEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FailsFilter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FailsFilterHandler handler : _FailsFilterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesCreate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesCreateHandler handler : _ChangeDCPropertiesCreateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesCreateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesPageHandler handler : _ChangeDCPropertiesPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesDoc",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesDocHandler handler : _ChangeDCPropertiesDocListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesDocEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "InfoMeter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (InfoMeterHandler handler : _InfoMeterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], InfoMeterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableLineHandler handler : _DrawTableLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableFieldHandler handler : _DrawTableFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableFieldEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawProject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawProjectHandler handler : _DrawProjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawProjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawPageHandler handler : _DrawPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawObject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawObjectHandler handler : _DrawObjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawObjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HostPrinter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HostPrinterHandler handler : _HostPrinterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HostPrinterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evaluate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EvaluateHandler handler : _EvaluateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EvaluateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintJobInfo",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PrintJobInfoHandler handler : _PrintJobInfoListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PrintJobInfoEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveFilename",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SaveFilenameHandler handler : _SaveFilenameListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveFilenameEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyProgress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (NotifyProgressHandler handler : _NotifyProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyProgressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ProjectLoaded",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ProjectLoadedHandler handler : _ProjectLoadedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DesignerPrintJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DesignerPrintJobHandler handler : _DesignerPrintJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DesignerPrintJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintingFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _PrintingFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollected",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollectionFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectionFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExported",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportedEventArgs> handler : _PageExportedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExportFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportFinishedEventArgs> handler :
                  _PageExportFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportFinishedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HandleHyperlinkAction",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<HyperLinkClickedEventArgs> handler :
                  _HandleHyperlinkActionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HyperLinkClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler : _SaveReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestoreReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler :
                  _RestoreReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TriggeredJobInUIThread",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<TriggeredJobInUIThreadEventArgs> handler :
                  _TriggeredJobInUIThreadListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TriggeredJobInUIThreadEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DelayedValue",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DelayedValueEventArgs> handler : _DelayedValueListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DelayedValueEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerPrint",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerPrintEventArgs> handler : _ViewerPrintListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerPrintEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyFrameHandle",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyFrameHandleEventArgs> handler : _NotifyFrameHandleListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyFrameHandleEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineDatastructure",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DefineDatastructureEventArgs> handler :
                  _DefineDatastructureListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineDatastructureEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryObjectLoadAllowed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryObjectLoadAllowedEventArgs> handler :
                  _QueryObjectLoadAllowedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryObjectLoadAllowedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameReplacement",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameReplacementEventArgs> handler :
                  _QueryFileNameReplacementListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameReplacementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BeforeProjectImport",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<BeforeProjectImportEventArgs> handler :
                  _BeforeProjectImportListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BeforeProjectImportEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerActionResult",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerActionResultEventArgs> handler :
                  _ViewerActionResultListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerActionResultEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabel(CultureInfo culture, java.lang.Boolean enableCallbacks) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ListLabel", culture, enableCallbacks);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "AutoDefineField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineVariable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineVariableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewLineHandler handler : _AutoDefineNewLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewPageHandler handler : _AutoDefineNewPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableSortOrder",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableSortOrderListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableRelation",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableRelationListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineVariables",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineVariablesHandler handler : _DefineVariablesListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineFields",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineFieldsHandler handler : _DefineFieldsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefinePrintOptions",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefinePrintOptionsHandler handler : _DefinePrintOptionsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ShowHelp",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ShowHelpHandler handler : _ShowHelpListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ShowHelpEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnableMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EnableMenuHandler handler : _EnableMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EnableMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ModifyMenuHandler handler : _ModifyMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMetafile",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ModifyMetafileEventArgs> handler : _ModifyMetafileListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMetafileEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameForExportJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameForExportJobEventArgs> handler :
                  _QueryFileNameForExportJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameForExportJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyMetafilePage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyEmfPageEventArgs> handler : _NotifyMetafilePageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyEmfPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SelectMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SelectMenuHandler handler : _SelectMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SelectMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonState",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonStateHandler handler : _ViewerButtonStateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonStateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonClicked",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonClickedHandler handler : _ViewerButtonClickedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "VariableHelpText",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (VariableHelpTextHandler handler : _VariableHelpTextListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], VariableHelpTextEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ExpressionError",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ExpressionErrorHandler handler : _ExpressionErrorListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ExpressionErrorEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FailsFilter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FailsFilterHandler handler : _FailsFilterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesCreate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesCreateHandler handler : _ChangeDCPropertiesCreateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesCreateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesPageHandler handler : _ChangeDCPropertiesPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesDoc",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesDocHandler handler : _ChangeDCPropertiesDocListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesDocEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "InfoMeter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (InfoMeterHandler handler : _InfoMeterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], InfoMeterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableLineHandler handler : _DrawTableLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableFieldHandler handler : _DrawTableFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableFieldEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawProject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawProjectHandler handler : _DrawProjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawProjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawPageHandler handler : _DrawPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawObject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawObjectHandler handler : _DrawObjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawObjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HostPrinter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HostPrinterHandler handler : _HostPrinterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HostPrinterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evaluate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EvaluateHandler handler : _EvaluateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EvaluateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintJobInfo",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PrintJobInfoHandler handler : _PrintJobInfoListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PrintJobInfoEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveFilename",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SaveFilenameHandler handler : _SaveFilenameListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveFilenameEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyProgress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (NotifyProgressHandler handler : _NotifyProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyProgressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ProjectLoaded",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ProjectLoadedHandler handler : _ProjectLoadedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DesignerPrintJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DesignerPrintJobHandler handler : _DesignerPrintJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DesignerPrintJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintingFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _PrintingFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollected",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollectionFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectionFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExported",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportedEventArgs> handler : _PageExportedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExportFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportFinishedEventArgs> handler :
                  _PageExportFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportFinishedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HandleHyperlinkAction",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<HyperLinkClickedEventArgs> handler :
                  _HandleHyperlinkActionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HyperLinkClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler : _SaveReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestoreReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler :
                  _RestoreReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TriggeredJobInUIThread",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<TriggeredJobInUIThreadEventArgs> handler :
                  _TriggeredJobInUIThreadListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TriggeredJobInUIThreadEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DelayedValue",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DelayedValueEventArgs> handler : _DelayedValueListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DelayedValueEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerPrint",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerPrintEventArgs> handler : _ViewerPrintListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerPrintEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyFrameHandle",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyFrameHandleEventArgs> handler : _NotifyFrameHandleListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyFrameHandleEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineDatastructure",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DefineDatastructureEventArgs> handler :
                  _DefineDatastructureListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineDatastructureEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryObjectLoadAllowed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryObjectLoadAllowedEventArgs> handler :
                  _QueryObjectLoadAllowedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryObjectLoadAllowedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameReplacement",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameReplacementEventArgs> handler :
                  _QueryFileNameReplacementListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameReplacementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BeforeProjectImport",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<BeforeProjectImportEventArgs> handler :
                  _BeforeProjectImportListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BeforeProjectImportEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerActionResult",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerActionResultEventArgs> handler :
                  _ViewerActionResultListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerActionResultEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabel(
      CultureInfo culture, java.lang.Boolean enableCallbacks, java.lang.String debugLogFilePath) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("combit.ListLabel24.ListLabel", culture, enableCallbacks, debugLogFilePath);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "AutoDefineField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineVariable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineVariableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewLineHandler handler : _AutoDefineNewLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewPageHandler handler : _AutoDefineNewPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableSortOrder",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableSortOrderListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableRelation",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableRelationListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineVariables",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineVariablesHandler handler : _DefineVariablesListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineFields",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineFieldsHandler handler : _DefineFieldsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefinePrintOptions",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefinePrintOptionsHandler handler : _DefinePrintOptionsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ShowHelp",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ShowHelpHandler handler : _ShowHelpListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ShowHelpEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnableMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EnableMenuHandler handler : _EnableMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EnableMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ModifyMenuHandler handler : _ModifyMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMetafile",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ModifyMetafileEventArgs> handler : _ModifyMetafileListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMetafileEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameForExportJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameForExportJobEventArgs> handler :
                  _QueryFileNameForExportJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameForExportJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyMetafilePage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyEmfPageEventArgs> handler : _NotifyMetafilePageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyEmfPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SelectMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SelectMenuHandler handler : _SelectMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SelectMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonState",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonStateHandler handler : _ViewerButtonStateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonStateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonClicked",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonClickedHandler handler : _ViewerButtonClickedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "VariableHelpText",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (VariableHelpTextHandler handler : _VariableHelpTextListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], VariableHelpTextEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ExpressionError",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ExpressionErrorHandler handler : _ExpressionErrorListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ExpressionErrorEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FailsFilter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FailsFilterHandler handler : _FailsFilterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesCreate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesCreateHandler handler : _ChangeDCPropertiesCreateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesCreateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesPageHandler handler : _ChangeDCPropertiesPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesDoc",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesDocHandler handler : _ChangeDCPropertiesDocListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesDocEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "InfoMeter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (InfoMeterHandler handler : _InfoMeterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], InfoMeterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableLineHandler handler : _DrawTableLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableFieldHandler handler : _DrawTableFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableFieldEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawProject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawProjectHandler handler : _DrawProjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawProjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawPageHandler handler : _DrawPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawObject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawObjectHandler handler : _DrawObjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawObjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HostPrinter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HostPrinterHandler handler : _HostPrinterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HostPrinterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evaluate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EvaluateHandler handler : _EvaluateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EvaluateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintJobInfo",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PrintJobInfoHandler handler : _PrintJobInfoListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PrintJobInfoEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveFilename",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SaveFilenameHandler handler : _SaveFilenameListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveFilenameEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyProgress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (NotifyProgressHandler handler : _NotifyProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyProgressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ProjectLoaded",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ProjectLoadedHandler handler : _ProjectLoadedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DesignerPrintJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DesignerPrintJobHandler handler : _DesignerPrintJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DesignerPrintJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintingFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _PrintingFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollected",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollectionFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectionFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExported",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportedEventArgs> handler : _PageExportedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExportFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportFinishedEventArgs> handler :
                  _PageExportFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportFinishedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HandleHyperlinkAction",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<HyperLinkClickedEventArgs> handler :
                  _HandleHyperlinkActionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HyperLinkClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler : _SaveReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestoreReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler :
                  _RestoreReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TriggeredJobInUIThread",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<TriggeredJobInUIThreadEventArgs> handler :
                  _TriggeredJobInUIThreadListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TriggeredJobInUIThreadEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DelayedValue",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DelayedValueEventArgs> handler : _DelayedValueListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DelayedValueEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerPrint",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerPrintEventArgs> handler : _ViewerPrintListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerPrintEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyFrameHandle",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyFrameHandleEventArgs> handler : _NotifyFrameHandleListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyFrameHandleEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineDatastructure",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DefineDatastructureEventArgs> handler :
                  _DefineDatastructureListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineDatastructureEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryObjectLoadAllowed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryObjectLoadAllowedEventArgs> handler :
                  _QueryObjectLoadAllowedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryObjectLoadAllowedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameReplacement",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameReplacementEventArgs> handler :
                  _QueryFileNameReplacementListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameReplacementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BeforeProjectImport",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<BeforeProjectImportEventArgs> handler :
                  _BeforeProjectImportListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BeforeProjectImportEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerActionResult",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerActionResultEventArgs> handler :
                  _ViewerActionResultListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerActionResultEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabel(java.lang.Integer jobHandle) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ListLabel", jobHandle);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "AutoDefineField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineVariable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineElementHandler handler : _AutoDefineVariableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineElementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewLineHandler handler : _AutoDefineNewLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineNewPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineNewPageHandler handler : _AutoDefineNewPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineNewPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTable",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableSortOrder",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableSortOrderListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoDefineTableRelation",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AutoDefineDataItemHandler handler : _AutoDefineTableRelationListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AutoDefineDataItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineVariables",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineVariablesHandler handler : _DefineVariablesListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineFields",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefineFieldsHandler handler : _DefineFieldsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineElementsEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefinePrintOptions",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DefinePrintOptionsHandler handler : _DefinePrintOptionsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ShowHelp",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ShowHelpHandler handler : _ShowHelpListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ShowHelpEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnableMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EnableMenuHandler handler : _EnableMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EnableMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ModifyMenuHandler handler : _ModifyMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifyMetafile",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ModifyMetafileEventArgs> handler : _ModifyMetafileListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ModifyMetafileEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameForExportJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameForExportJobEventArgs> handler :
                  _QueryFileNameForExportJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameForExportJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyMetafilePage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyEmfPageEventArgs> handler : _NotifyMetafilePageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyEmfPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SelectMenu",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SelectMenuHandler handler : _SelectMenuListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SelectMenuEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonState",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonStateHandler handler : _ViewerButtonStateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonStateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerButtonClicked",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ViewerButtonClickedHandler handler : _ViewerButtonClickedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerButtonClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "VariableHelpText",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (VariableHelpTextHandler handler : _VariableHelpTextListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], VariableHelpTextEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ExpressionError",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ExpressionErrorHandler handler : _ExpressionErrorListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ExpressionErrorEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FailsFilter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FailsFilterHandler handler : _FailsFilterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesCreate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesCreateHandler handler : _ChangeDCPropertiesCreateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesCreateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesPageHandler handler : _ChangeDCPropertiesPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeDCPropertiesDoc",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ChangeDCPropertiesDocHandler handler : _ChangeDCPropertiesDocListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ChangeDCPropertiesDocEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "InfoMeter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (InfoMeterHandler handler : _InfoMeterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], InfoMeterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableLine",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableLineHandler handler : _DrawTableLineListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableLineEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawTableField",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawTableFieldHandler handler : _DrawTableFieldListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawTableFieldEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawProject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawProjectHandler handler : _DrawProjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawProjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawPage",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawPageHandler handler : _DrawPageListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawPageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawObject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawObjectHandler handler : _DrawObjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawObjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HostPrinter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HostPrinterHandler handler : _HostPrinterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HostPrinterEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evaluate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EvaluateHandler handler : _EvaluateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EvaluateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintJobInfo",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PrintJobInfoHandler handler : _PrintJobInfoListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PrintJobInfoEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveFilename",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SaveFilenameHandler handler : _SaveFilenameListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveFilenameEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyProgress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (NotifyProgressHandler handler : _NotifyProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyProgressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ProjectLoaded",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ProjectLoadedHandler handler : _ProjectLoadedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DesignerPrintJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DesignerPrintJobHandler handler : _DesignerPrintJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DesignerPrintJobEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintingFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _PrintingFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollected",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReportParametersCollectionFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportParametersCollectedEventArgs> handler :
                  _ReportParametersCollectionFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportParametersCollectedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExported",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportedEventArgs> handler : _PageExportedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PageExportFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<PageExportFinishedEventArgs> handler :
                  _PageExportFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PageExportFinishedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HandleHyperlinkAction",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<HyperLinkClickedEventArgs> handler :
                  _HandleHyperlinkActionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], HyperLinkClickedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler : _SaveReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestoreReportStateItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ReportStateItemEventArgs> handler :
                  _RestoreReportStateItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReportStateItemEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TriggeredJobInUIThread",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<TriggeredJobInUIThreadEventArgs> handler :
                  _TriggeredJobInUIThreadListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TriggeredJobInUIThreadEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DelayedValue",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DelayedValueEventArgs> handler : _DelayedValueListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DelayedValueEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerPrint",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerPrintEventArgs> handler : _ViewerPrintListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerPrintEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "NotifyFrameHandle",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<NotifyFrameHandleEventArgs> handler : _NotifyFrameHandleListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NotifyFrameHandleEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DefineDatastructure",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<DefineDatastructureEventArgs> handler :
                  _DefineDatastructureListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DefineDatastructureEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryObjectLoadAllowed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryObjectLoadAllowedEventArgs> handler :
                  _QueryObjectLoadAllowedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryObjectLoadAllowedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryFileNameReplacement",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<QueryFileNameReplacementEventArgs> handler :
                  _QueryFileNameReplacementListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryFileNameReplacementEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BeforeProjectImport",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<BeforeProjectImportEventArgs> handler :
                  _BeforeProjectImportListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BeforeProjectImportEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ViewerActionResult",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ViewerActionResultEventArgs> handler :
                  _ViewerActionResultListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ViewerActionResultEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabel(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetDataBinding(Object dataSource, java.lang.String dataMember) {
    try {
      javonetHandle.invoke("SetDataBinding", dataSource, dataMember);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetDataBinding(Object dataSource) {
    try {
      javonetHandle.invoke("SetDataBinding", dataSource);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IDataProvider GetDataProvider() {
    try {
      Object res = javonetHandle.invoke("GetDataProvider");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DefineSchemaElement(
      java.lang.String name, jio.System.Type dataType, java.lang.Boolean asFields) {
    try {
      javonetHandle.invoke("DefineSchemaElement", name, dataType, asFields);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetCustomDictionary(IQueryableLocalizationDictionary dictionary) {
    try {
      javonetHandle.invoke("SetCustomDictionary", dictionary);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Design() {
    try {
      javonetHandle.invoke("Design");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Design(LlProject projectType) {
    try {
      javonetHandle.invoke("Design", NEnum.fromJavaEnum(projectType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Design(LlProject projectType, java.lang.String projectFile) {
    try {
      javonetHandle.invoke("Design", NEnum.fromJavaEnum(projectType), projectFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Design(LlProject projectType, Stream projectStream) {
    try {
      javonetHandle.invoke("Design", NEnum.fromJavaEnum(projectType), projectStream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Design(LlProject projectType, Stream projectStream, Stream printerSettingsStream) {
    try {
      javonetHandle.invoke(
          "Design", NEnum.fromJavaEnum(projectType), projectStream, printerSettingsStream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Design(
      java.lang.String designerTitle,
      LlProject projectType,
      java.lang.String projectFile,
      java.lang.Boolean showFileSelect) {
    try {
      javonetHandle.invoke(
          "Design", designerTitle, NEnum.fromJavaEnum(projectType), projectFile, showFileSelect);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Design(
      Object userData,
      IWin32Window owner,
      java.lang.String designerTitle,
      LlProject projectType,
      java.lang.String projectFile,
      java.lang.Boolean showFileSelect) {
    try {
      javonetHandle.invoke(
          "Design",
          userData,
          owner,
          designerTitle,
          NEnum.fromJavaEnum(projectType),
          projectFile,
          showFileSelect);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Design(
      Object userData,
      IntPtr windowHandle,
      java.lang.String designerTitle,
      LlProject projectType,
      java.lang.String projectFile,
      java.lang.Boolean showFileSelect) {
    try {
      javonetHandle.invoke(
          "Design",
          userData,
          windowHandle,
          designerTitle,
          NEnum.fromJavaEnum(projectType),
          projectFile,
          showFileSelect);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Export(ExportConfiguration exportConfiguration) {
    try {
      javonetHandle.invoke("Export", exportConfiguration);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void TriggerPrint(
      java.lang.Integer sessionHandle,
      java.lang.String reportId,
      java.lang.String exportFormat,
      java.lang.String exportPath,
      java.lang.String exportFile) {
    try {
      javonetHandle.invoke(
          "TriggerPrint", sessionHandle, reportId, exportFormat, exportPath, exportFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void TriggerPrint(
      java.lang.Integer sessionHandle,
      java.lang.String reportId,
      java.lang.String exportFormat,
      java.lang.String exportPath,
      java.lang.String exportFile,
      java.lang.Integer flags) {
    try {
      javonetHandle.invoke(
          "TriggerPrint", sessionHandle, reportId, exportFormat, exportPath, exportFile, flags);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(java.lang.String printerName) {
    try {
      javonetHandle.invoke("Print", printerName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(java.lang.String printerName, LlProject projectType) {
    try {
      javonetHandle.invoke("Print", printerName, NEnum.fromJavaEnum(projectType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(
      java.lang.String printerName, LlProject projectType, java.lang.String projectFile) {
    try {
      javonetHandle.invoke("Print", printerName, NEnum.fromJavaEnum(projectType), projectFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print() {
    try {
      javonetHandle.invoke("Print");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(LlProject projectType) {
    try {
      javonetHandle.invoke("Print", NEnum.fromJavaEnum(projectType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(LlProject projectType, Stream projectFileStream) {
    try {
      javonetHandle.invoke("Print", NEnum.fromJavaEnum(projectType), projectFileStream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(LlProject projectType, Stream projectStream, Stream printerSettingsStream) {
    try {
      javonetHandle.invoke(
          "Print", NEnum.fromJavaEnum(projectType), projectStream, printerSettingsStream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(LlProject projectType, java.lang.String projectFile) {
    try {
      javonetHandle.invoke("Print", NEnum.fromJavaEnum(projectType), projectFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(
      LlProject projectType, java.lang.String projectFile, java.lang.Boolean showFileSelect) {
    try {
      javonetHandle.invoke("Print", NEnum.fromJavaEnum(projectType), projectFile, showFileSelect);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(
      LlProject projectType,
      java.lang.String projectFile,
      java.lang.Boolean showFileSelect,
      LlPrintMode printMode) {
    try {
      javonetHandle.invoke(
          "Print",
          NEnum.fromJavaEnum(projectType),
          projectFile,
          showFileSelect,
          NEnum.fromJavaEnum(printMode));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(
      Object userData,
      LlProject projectType,
      java.lang.String projectFile,
      java.lang.Boolean showFileSelect,
      LlPrintMode printMode,
      LlBoxType boxType,
      IWin32Window owner,
      java.lang.String dialogTitle,
      java.lang.Boolean showPrintOptions,
      java.lang.String tempPath) {
    try {
      javonetHandle.invoke(
          "Print",
          userData,
          NEnum.fromJavaEnum(projectType),
          projectFile,
          showFileSelect,
          NEnum.fromJavaEnum(printMode),
          NEnum.fromJavaEnum(boxType),
          owner,
          dialogTitle,
          showPrintOptions,
          tempPath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(
      LlProject projectType,
      java.lang.String projectFile,
      java.lang.Boolean showFileSelect,
      LlPrintMode printMode,
      LlBoxType boxType,
      java.lang.String dialogTitle,
      java.lang.Boolean showPrintOptions,
      java.lang.String tempPath) {
    try {
      javonetHandle.invoke(
          "Print",
          NEnum.fromJavaEnum(projectType),
          projectFile,
          showFileSelect,
          NEnum.fromJavaEnum(printMode),
          NEnum.fromJavaEnum(boxType),
          dialogTitle,
          showPrintOptions,
          tempPath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(
      Object userData,
      LlProject projectType,
      java.lang.String projectFile,
      java.lang.Boolean showFileSelect,
      LlPrintMode printMode,
      LlBoxType boxType,
      IntPtr windowHandle,
      java.lang.String dialogTitle,
      java.lang.Boolean showPrintOptions,
      java.lang.String tempPath) {
    try {
      javonetHandle.invoke(
          "Print",
          userData,
          NEnum.fromJavaEnum(projectType),
          projectFile,
          showFileSelect,
          NEnum.fromJavaEnum(printMode),
          NEnum.fromJavaEnum(boxType),
          windowHandle,
          dialogTitle,
          showPrintOptions,
          tempPath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object EvaluateExpression(java.lang.String expression, java.lang.Boolean includeFields) {
    try {
      Object res = javonetHandle.invoke("EvaluateExpression", expression, includeFields);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer IDesignerFunctionEnumeration_Next(
      java.lang.Integer size, Object functions, AtomicReference<java.lang.Integer> count) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface(
                  "combit.ListLabel24.DesignerExtensions.IDesignerFunctionEnumeration")
              .invoke(
                  "Next",
                  size,
                  functions,
                  new NOut(count, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer IDesignerFunctionEnumeration_Skip(java.lang.Integer value) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface(
                  "combit.ListLabel24.DesignerExtensions.IDesignerFunctionEnumeration")
              .invoke("Skip", value);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer IDesignerFunctionEnumeration_Reset() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface(
                  "combit.ListLabel24.DesignerExtensions.IDesignerFunctionEnumeration")
              .invoke("Reset");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IDesignerFunctionEnumeration IDesignerFunctionEnumeration_Clone() {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "combit.ListLabel24.DesignerExtensions.IDesignerFunctionEnumeration")
              .invoke("Clone");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer IDesignerObjectEnumeration_Next(
      java.lang.Integer size, Object functions, AtomicReference<java.lang.Integer> count) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObjectEnumeration")
              .invoke(
                  "Next",
                  size,
                  functions,
                  new NOut(count, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer IDesignerObjectEnumeration_Skip(java.lang.Integer value) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObjectEnumeration")
              .invoke("Skip", value);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer IDesignerObjectEnumeration_Reset() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObjectEnumeration")
              .invoke("Reset");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IDesignerObjectEnumeration IDesignerObjectEnumeration_Clone() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObjectEnumeration")
              .invoke("Clone");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Event */

  private java.util.ArrayList<AutoDefineElementHandler> _AutoDefineFieldListeners =
      new java.util.ArrayList<AutoDefineElementHandler>();

  public void addAutoDefineField(AutoDefineElementHandler toAdd) {
    _AutoDefineFieldListeners.add(toAdd);
  }

  public void removeAutoDefineField(AutoDefineElementHandler toRemove) {
    _AutoDefineFieldListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<AutoDefineElementHandler> _AutoDefineVariableListeners =
      new java.util.ArrayList<AutoDefineElementHandler>();

  public void addAutoDefineVariable(AutoDefineElementHandler toAdd) {
    _AutoDefineVariableListeners.add(toAdd);
  }

  public void removeAutoDefineVariable(AutoDefineElementHandler toRemove) {
    _AutoDefineVariableListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<AutoDefineNewLineHandler> _AutoDefineNewLineListeners =
      new java.util.ArrayList<AutoDefineNewLineHandler>();

  public void addAutoDefineNewLine(AutoDefineNewLineHandler toAdd) {
    _AutoDefineNewLineListeners.add(toAdd);
  }

  public void removeAutoDefineNewLine(AutoDefineNewLineHandler toRemove) {
    _AutoDefineNewLineListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<AutoDefineNewPageHandler> _AutoDefineNewPageListeners =
      new java.util.ArrayList<AutoDefineNewPageHandler>();

  public void addAutoDefineNewPage(AutoDefineNewPageHandler toAdd) {
    _AutoDefineNewPageListeners.add(toAdd);
  }

  public void removeAutoDefineNewPage(AutoDefineNewPageHandler toRemove) {
    _AutoDefineNewPageListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<AutoDefineDataItemHandler> _AutoDefineTableListeners =
      new java.util.ArrayList<AutoDefineDataItemHandler>();

  public void addAutoDefineTable(AutoDefineDataItemHandler toAdd) {
    _AutoDefineTableListeners.add(toAdd);
  }

  public void removeAutoDefineTable(AutoDefineDataItemHandler toRemove) {
    _AutoDefineTableListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<AutoDefineDataItemHandler> _AutoDefineTableSortOrderListeners =
      new java.util.ArrayList<AutoDefineDataItemHandler>();

  public void addAutoDefineTableSortOrder(AutoDefineDataItemHandler toAdd) {
    _AutoDefineTableSortOrderListeners.add(toAdd);
  }

  public void removeAutoDefineTableSortOrder(AutoDefineDataItemHandler toRemove) {
    _AutoDefineTableSortOrderListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<AutoDefineDataItemHandler> _AutoDefineTableRelationListeners =
      new java.util.ArrayList<AutoDefineDataItemHandler>();

  public void addAutoDefineTableRelation(AutoDefineDataItemHandler toAdd) {
    _AutoDefineTableRelationListeners.add(toAdd);
  }

  public void removeAutoDefineTableRelation(AutoDefineDataItemHandler toRemove) {
    _AutoDefineTableRelationListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DefineVariablesHandler> _DefineVariablesListeners =
      new java.util.ArrayList<DefineVariablesHandler>();

  public void addDefineVariables(DefineVariablesHandler toAdd) {
    _DefineVariablesListeners.add(toAdd);
  }

  public void removeDefineVariables(DefineVariablesHandler toRemove) {
    _DefineVariablesListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DefineFieldsHandler> _DefineFieldsListeners =
      new java.util.ArrayList<DefineFieldsHandler>();

  public void addDefineFields(DefineFieldsHandler toAdd) {
    _DefineFieldsListeners.add(toAdd);
  }

  public void removeDefineFields(DefineFieldsHandler toRemove) {
    _DefineFieldsListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DefinePrintOptionsHandler> _DefinePrintOptionsListeners =
      new java.util.ArrayList<DefinePrintOptionsHandler>();

  public void addDefinePrintOptions(DefinePrintOptionsHandler toAdd) {
    _DefinePrintOptionsListeners.add(toAdd);
  }

  public void removeDefinePrintOptions(DefinePrintOptionsHandler toRemove) {
    _DefinePrintOptionsListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ShowHelpHandler> _ShowHelpListeners =
      new java.util.ArrayList<ShowHelpHandler>();

  public void addShowHelp(ShowHelpHandler toAdd) {
    _ShowHelpListeners.add(toAdd);
  }

  public void removeShowHelp(ShowHelpHandler toRemove) {
    _ShowHelpListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EnableMenuHandler> _EnableMenuListeners =
      new java.util.ArrayList<EnableMenuHandler>();

  public void addEnableMenu(EnableMenuHandler toAdd) {
    _EnableMenuListeners.add(toAdd);
  }

  public void removeEnableMenu(EnableMenuHandler toRemove) {
    _EnableMenuListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ModifyMenuHandler> _ModifyMenuListeners =
      new java.util.ArrayList<ModifyMenuHandler>();

  public void addModifyMenu(ModifyMenuHandler toAdd) {
    _ModifyMenuListeners.add(toAdd);
  }

  public void removeModifyMenu(ModifyMenuHandler toRemove) {
    _ModifyMenuListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<ModifyMetafileEventArgs>> _ModifyMetafileListeners =
      new java.util.ArrayList<EventHandler<ModifyMetafileEventArgs>>();

  public void addModifyMetafile(EventHandler<ModifyMetafileEventArgs> toAdd) {
    _ModifyMetafileListeners.add(toAdd);
  }

  public void removeModifyMetafile(EventHandler<ModifyMetafileEventArgs> toRemove) {
    _ModifyMetafileListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<QueryFileNameForExportJobEventArgs>>
      _QueryFileNameForExportJobListeners =
          new java.util.ArrayList<EventHandler<QueryFileNameForExportJobEventArgs>>();

  public void addQueryFileNameForExportJob(EventHandler<QueryFileNameForExportJobEventArgs> toAdd) {
    _QueryFileNameForExportJobListeners.add(toAdd);
  }

  public void removeQueryFileNameForExportJob(
      EventHandler<QueryFileNameForExportJobEventArgs> toRemove) {
    _QueryFileNameForExportJobListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<NotifyEmfPageEventArgs>> _NotifyMetafilePageListeners =
      new java.util.ArrayList<EventHandler<NotifyEmfPageEventArgs>>();

  public void addNotifyMetafilePage(EventHandler<NotifyEmfPageEventArgs> toAdd) {
    _NotifyMetafilePageListeners.add(toAdd);
  }

  public void removeNotifyMetafilePage(EventHandler<NotifyEmfPageEventArgs> toRemove) {
    _NotifyMetafilePageListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<SelectMenuHandler> _SelectMenuListeners =
      new java.util.ArrayList<SelectMenuHandler>();

  public void addSelectMenu(SelectMenuHandler toAdd) {
    _SelectMenuListeners.add(toAdd);
  }

  public void removeSelectMenu(SelectMenuHandler toRemove) {
    _SelectMenuListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ViewerButtonStateHandler> _ViewerButtonStateListeners =
      new java.util.ArrayList<ViewerButtonStateHandler>();

  public void addViewerButtonState(ViewerButtonStateHandler toAdd) {
    _ViewerButtonStateListeners.add(toAdd);
  }

  public void removeViewerButtonState(ViewerButtonStateHandler toRemove) {
    _ViewerButtonStateListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ViewerButtonClickedHandler> _ViewerButtonClickedListeners =
      new java.util.ArrayList<ViewerButtonClickedHandler>();

  public void addViewerButtonClicked(ViewerButtonClickedHandler toAdd) {
    _ViewerButtonClickedListeners.add(toAdd);
  }

  public void removeViewerButtonClicked(ViewerButtonClickedHandler toRemove) {
    _ViewerButtonClickedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<VariableHelpTextHandler> _VariableHelpTextListeners =
      new java.util.ArrayList<VariableHelpTextHandler>();

  public void addVariableHelpText(VariableHelpTextHandler toAdd) {
    _VariableHelpTextListeners.add(toAdd);
  }

  public void removeVariableHelpText(VariableHelpTextHandler toRemove) {
    _VariableHelpTextListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ExpressionErrorHandler> _ExpressionErrorListeners =
      new java.util.ArrayList<ExpressionErrorHandler>();

  public void addExpressionError(ExpressionErrorHandler toAdd) {
    _ExpressionErrorListeners.add(toAdd);
  }

  public void removeExpressionError(ExpressionErrorHandler toRemove) {
    _ExpressionErrorListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<FailsFilterHandler> _FailsFilterListeners =
      new java.util.ArrayList<FailsFilterHandler>();

  public void addFailsFilter(FailsFilterHandler toAdd) {
    _FailsFilterListeners.add(toAdd);
  }

  public void removeFailsFilter(FailsFilterHandler toRemove) {
    _FailsFilterListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ChangeDCPropertiesCreateHandler> _ChangeDCPropertiesCreateListeners =
      new java.util.ArrayList<ChangeDCPropertiesCreateHandler>();

  public void addChangeDCPropertiesCreate(ChangeDCPropertiesCreateHandler toAdd) {
    _ChangeDCPropertiesCreateListeners.add(toAdd);
  }

  public void removeChangeDCPropertiesCreate(ChangeDCPropertiesCreateHandler toRemove) {
    _ChangeDCPropertiesCreateListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ChangeDCPropertiesPageHandler> _ChangeDCPropertiesPageListeners =
      new java.util.ArrayList<ChangeDCPropertiesPageHandler>();

  public void addChangeDCPropertiesPage(ChangeDCPropertiesPageHandler toAdd) {
    _ChangeDCPropertiesPageListeners.add(toAdd);
  }

  public void removeChangeDCPropertiesPage(ChangeDCPropertiesPageHandler toRemove) {
    _ChangeDCPropertiesPageListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ChangeDCPropertiesDocHandler> _ChangeDCPropertiesDocListeners =
      new java.util.ArrayList<ChangeDCPropertiesDocHandler>();

  public void addChangeDCPropertiesDoc(ChangeDCPropertiesDocHandler toAdd) {
    _ChangeDCPropertiesDocListeners.add(toAdd);
  }

  public void removeChangeDCPropertiesDoc(ChangeDCPropertiesDocHandler toRemove) {
    _ChangeDCPropertiesDocListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<InfoMeterHandler> _InfoMeterListeners =
      new java.util.ArrayList<InfoMeterHandler>();

  public void addInfoMeter(InfoMeterHandler toAdd) {
    _InfoMeterListeners.add(toAdd);
  }

  public void removeInfoMeter(InfoMeterHandler toRemove) {
    _InfoMeterListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DrawTableLineHandler> _DrawTableLineListeners =
      new java.util.ArrayList<DrawTableLineHandler>();

  public void addDrawTableLine(DrawTableLineHandler toAdd) {
    _DrawTableLineListeners.add(toAdd);
  }

  public void removeDrawTableLine(DrawTableLineHandler toRemove) {
    _DrawTableLineListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DrawTableFieldHandler> _DrawTableFieldListeners =
      new java.util.ArrayList<DrawTableFieldHandler>();

  public void addDrawTableField(DrawTableFieldHandler toAdd) {
    _DrawTableFieldListeners.add(toAdd);
  }

  public void removeDrawTableField(DrawTableFieldHandler toRemove) {
    _DrawTableFieldListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DrawProjectHandler> _DrawProjectListeners =
      new java.util.ArrayList<DrawProjectHandler>();

  public void addDrawProject(DrawProjectHandler toAdd) {
    _DrawProjectListeners.add(toAdd);
  }

  public void removeDrawProject(DrawProjectHandler toRemove) {
    _DrawProjectListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DrawPageHandler> _DrawPageListeners =
      new java.util.ArrayList<DrawPageHandler>();

  public void addDrawPage(DrawPageHandler toAdd) {
    _DrawPageListeners.add(toAdd);
  }

  public void removeDrawPage(DrawPageHandler toRemove) {
    _DrawPageListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DrawObjectHandler> _DrawObjectListeners =
      new java.util.ArrayList<DrawObjectHandler>();

  public void addDrawObject(DrawObjectHandler toAdd) {
    _DrawObjectListeners.add(toAdd);
  }

  public void removeDrawObject(DrawObjectHandler toRemove) {
    _DrawObjectListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<HostPrinterHandler> _HostPrinterListeners =
      new java.util.ArrayList<HostPrinterHandler>();

  public void addHostPrinter(HostPrinterHandler toAdd) {
    _HostPrinterListeners.add(toAdd);
  }

  public void removeHostPrinter(HostPrinterHandler toRemove) {
    _HostPrinterListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EvaluateHandler> _EvaluateListeners =
      new java.util.ArrayList<EvaluateHandler>();

  public void addEvaluate(EvaluateHandler toAdd) {
    _EvaluateListeners.add(toAdd);
  }

  public void removeEvaluate(EvaluateHandler toRemove) {
    _EvaluateListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<PrintJobInfoHandler> _PrintJobInfoListeners =
      new java.util.ArrayList<PrintJobInfoHandler>();

  public void addPrintJobInfo(PrintJobInfoHandler toAdd) {
    _PrintJobInfoListeners.add(toAdd);
  }

  public void removePrintJobInfo(PrintJobInfoHandler toRemove) {
    _PrintJobInfoListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<SaveFilenameHandler> _SaveFilenameListeners =
      new java.util.ArrayList<SaveFilenameHandler>();

  public void addSaveFilename(SaveFilenameHandler toAdd) {
    _SaveFilenameListeners.add(toAdd);
  }

  public void removeSaveFilename(SaveFilenameHandler toRemove) {
    _SaveFilenameListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<NotifyProgressHandler> _NotifyProgressListeners =
      new java.util.ArrayList<NotifyProgressHandler>();

  public void addNotifyProgress(NotifyProgressHandler toAdd) {
    _NotifyProgressListeners.add(toAdd);
  }

  public void removeNotifyProgress(NotifyProgressHandler toRemove) {
    _NotifyProgressListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ProjectLoadedHandler> _ProjectLoadedListeners =
      new java.util.ArrayList<ProjectLoadedHandler>();

  public void addProjectLoaded(ProjectLoadedHandler toAdd) {
    _ProjectLoadedListeners.add(toAdd);
  }

  public void removeProjectLoaded(ProjectLoadedHandler toRemove) {
    _ProjectLoadedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DesignerPrintJobHandler> _DesignerPrintJobListeners =
      new java.util.ArrayList<DesignerPrintJobHandler>();

  public void addDesignerPrintJob(DesignerPrintJobHandler toAdd) {
    _DesignerPrintJobListeners.add(toAdd);
  }

  public void removeDesignerPrintJob(DesignerPrintJobHandler toRemove) {
    _DesignerPrintJobListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<EventArgs>> _PrintingFinishedListeners =
      new java.util.ArrayList<EventHandler<EventArgs>>();

  public void addPrintingFinished(EventHandler<EventArgs> toAdd) {
    _PrintingFinishedListeners.add(toAdd);
  }

  public void removePrintingFinished(EventHandler<EventArgs> toRemove) {
    _PrintingFinishedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<ReportParametersCollectedEventArgs>>
      _ReportParametersCollectedListeners =
          new java.util.ArrayList<EventHandler<ReportParametersCollectedEventArgs>>();

  public void addReportParametersCollected(EventHandler<ReportParametersCollectedEventArgs> toAdd) {
    _ReportParametersCollectedListeners.add(toAdd);
  }

  public void removeReportParametersCollected(
      EventHandler<ReportParametersCollectedEventArgs> toRemove) {
    _ReportParametersCollectedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<ReportParametersCollectedEventArgs>>
      _ReportParametersCollectionFinishedListeners =
          new java.util.ArrayList<EventHandler<ReportParametersCollectedEventArgs>>();

  public void addReportParametersCollectionFinished(
      EventHandler<ReportParametersCollectedEventArgs> toAdd) {
    _ReportParametersCollectionFinishedListeners.add(toAdd);
  }

  public void removeReportParametersCollectionFinished(
      EventHandler<ReportParametersCollectedEventArgs> toRemove) {
    _ReportParametersCollectionFinishedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<PageExportedEventArgs>> _PageExportedListeners =
      new java.util.ArrayList<EventHandler<PageExportedEventArgs>>();

  public void addPageExported(EventHandler<PageExportedEventArgs> toAdd) {
    _PageExportedListeners.add(toAdd);
  }

  public void removePageExported(EventHandler<PageExportedEventArgs> toRemove) {
    _PageExportedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<PageExportFinishedEventArgs>>
      _PageExportFinishedListeners =
          new java.util.ArrayList<EventHandler<PageExportFinishedEventArgs>>();

  public void addPageExportFinished(EventHandler<PageExportFinishedEventArgs> toAdd) {
    _PageExportFinishedListeners.add(toAdd);
  }

  public void removePageExportFinished(EventHandler<PageExportFinishedEventArgs> toRemove) {
    _PageExportFinishedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<HyperLinkClickedEventArgs>>
      _HandleHyperlinkActionListeners =
          new java.util.ArrayList<EventHandler<HyperLinkClickedEventArgs>>();

  public void addHandleHyperlinkAction(EventHandler<HyperLinkClickedEventArgs> toAdd) {
    _HandleHyperlinkActionListeners.add(toAdd);
  }

  public void removeHandleHyperlinkAction(EventHandler<HyperLinkClickedEventArgs> toRemove) {
    _HandleHyperlinkActionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<ReportStateItemEventArgs>>
      _SaveReportStateItemListeners =
          new java.util.ArrayList<EventHandler<ReportStateItemEventArgs>>();

  public void addSaveReportStateItem(EventHandler<ReportStateItemEventArgs> toAdd) {
    _SaveReportStateItemListeners.add(toAdd);
  }

  public void removeSaveReportStateItem(EventHandler<ReportStateItemEventArgs> toRemove) {
    _SaveReportStateItemListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<ReportStateItemEventArgs>>
      _RestoreReportStateItemListeners =
          new java.util.ArrayList<EventHandler<ReportStateItemEventArgs>>();

  public void addRestoreReportStateItem(EventHandler<ReportStateItemEventArgs> toAdd) {
    _RestoreReportStateItemListeners.add(toAdd);
  }

  public void removeRestoreReportStateItem(EventHandler<ReportStateItemEventArgs> toRemove) {
    _RestoreReportStateItemListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<TriggeredJobInUIThreadEventArgs>>
      _TriggeredJobInUIThreadListeners =
          new java.util.ArrayList<EventHandler<TriggeredJobInUIThreadEventArgs>>();

  public void addTriggeredJobInUIThread(EventHandler<TriggeredJobInUIThreadEventArgs> toAdd) {
    _TriggeredJobInUIThreadListeners.add(toAdd);
  }

  public void removeTriggeredJobInUIThread(EventHandler<TriggeredJobInUIThreadEventArgs> toRemove) {
    _TriggeredJobInUIThreadListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<DelayedValueEventArgs>> _DelayedValueListeners =
      new java.util.ArrayList<EventHandler<DelayedValueEventArgs>>();

  public void addDelayedValue(EventHandler<DelayedValueEventArgs> toAdd) {
    _DelayedValueListeners.add(toAdd);
  }

  public void removeDelayedValue(EventHandler<DelayedValueEventArgs> toRemove) {
    _DelayedValueListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<ViewerPrintEventArgs>> _ViewerPrintListeners =
      new java.util.ArrayList<EventHandler<ViewerPrintEventArgs>>();

  public void addViewerPrint(EventHandler<ViewerPrintEventArgs> toAdd) {
    _ViewerPrintListeners.add(toAdd);
  }

  public void removeViewerPrint(EventHandler<ViewerPrintEventArgs> toRemove) {
    _ViewerPrintListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<NotifyFrameHandleEventArgs>>
      _NotifyFrameHandleListeners =
          new java.util.ArrayList<EventHandler<NotifyFrameHandleEventArgs>>();

  public void addNotifyFrameHandle(EventHandler<NotifyFrameHandleEventArgs> toAdd) {
    _NotifyFrameHandleListeners.add(toAdd);
  }

  public void removeNotifyFrameHandle(EventHandler<NotifyFrameHandleEventArgs> toRemove) {
    _NotifyFrameHandleListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<DefineDatastructureEventArgs>>
      _DefineDatastructureListeners =
          new java.util.ArrayList<EventHandler<DefineDatastructureEventArgs>>();

  public void addDefineDatastructure(EventHandler<DefineDatastructureEventArgs> toAdd) {
    _DefineDatastructureListeners.add(toAdd);
  }

  public void removeDefineDatastructure(EventHandler<DefineDatastructureEventArgs> toRemove) {
    _DefineDatastructureListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<QueryObjectLoadAllowedEventArgs>>
      _QueryObjectLoadAllowedListeners =
          new java.util.ArrayList<EventHandler<QueryObjectLoadAllowedEventArgs>>();

  public void addQueryObjectLoadAllowed(EventHandler<QueryObjectLoadAllowedEventArgs> toAdd) {
    _QueryObjectLoadAllowedListeners.add(toAdd);
  }

  public void removeQueryObjectLoadAllowed(EventHandler<QueryObjectLoadAllowedEventArgs> toRemove) {
    _QueryObjectLoadAllowedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<QueryFileNameReplacementEventArgs>>
      _QueryFileNameReplacementListeners =
          new java.util.ArrayList<EventHandler<QueryFileNameReplacementEventArgs>>();

  public void addQueryFileNameReplacement(EventHandler<QueryFileNameReplacementEventArgs> toAdd) {
    _QueryFileNameReplacementListeners.add(toAdd);
  }

  public void removeQueryFileNameReplacement(
      EventHandler<QueryFileNameReplacementEventArgs> toRemove) {
    _QueryFileNameReplacementListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<BeforeProjectImportEventArgs>>
      _BeforeProjectImportListeners =
          new java.util.ArrayList<EventHandler<BeforeProjectImportEventArgs>>();

  public void addBeforeProjectImport(EventHandler<BeforeProjectImportEventArgs> toAdd) {
    _BeforeProjectImportListeners.add(toAdd);
  }

  public void removeBeforeProjectImport(EventHandler<BeforeProjectImportEventArgs> toRemove) {
    _BeforeProjectImportListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<ViewerActionResultEventArgs>>
      _ViewerActionResultListeners =
          new java.util.ArrayList<EventHandler<ViewerActionResultEventArgs>>();

  public void addViewerActionResult(EventHandler<ViewerActionResultEventArgs> toAdd) {
    _ViewerActionResultListeners.add(toAdd);
  }

  public void removeViewerActionResult(EventHandler<ViewerActionResultEventArgs> toRemove) {
    _ViewerActionResultListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
