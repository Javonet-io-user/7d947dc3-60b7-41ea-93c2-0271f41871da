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
import jio.System.Drawing.*;
import jio.System.Collections.*;
import combit.ListLabel24.DesignerExtensions.*;

public class DesignerObject extends Component
    implements IComponent, IDisposable, IDesignerObject, IPropertyEnumeration {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setSupportsContentDialog(java.lang.Boolean value) {
    try {
      javonetHandle.set("SupportsContentDialog", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSupportsContentDialog() {
    try {
      java.lang.Boolean res = javonetHandle.get("SupportsContentDialog");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlUnits getUnitSystem() {
    try {
      Object res = javonetHandle.<NEnum>get("UnitSystem");
      if (res == null) return null;
      return LlUnits.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getExportFormat() {
    try {
      java.lang.String res = javonetHandle.get("ExportFormat");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getPageIsOutOfPrintingRange() {
    try {
      java.lang.Boolean res = javonetHandle.get("PageIsOutOfPrintingRange");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setObjectName(java.lang.String value) {
    try {
      javonetHandle.set("ObjectName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getObjectName() {
    try {
      java.lang.String res = javonetHandle.get("ObjectName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDescription(java.lang.String value) {
    try {
      javonetHandle.set("Description", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDescription() {
    try {
      java.lang.String res = javonetHandle.get("Description");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAllowPageBreak(java.lang.Boolean value) {
    try {
      javonetHandle.set("AllowPageBreak", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAllowPageBreak() {
    try {
      java.lang.Boolean res = javonetHandle.get("AllowPageBreak");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIcon(Icon value) {
    try {
      javonetHandle.set("Icon", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Icon getIcon() {
    try {
      Object res = javonetHandle.<NObject>get("Icon");
      if (res == null) return null;
      return new Icon((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSmallRibbonImage(Image value) {
    try {
      javonetHandle.set("SmallRibbonImage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Image getSmallRibbonImage() {
    try {
      Object res = javonetHandle.<NObject>get("SmallRibbonImage");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLargeRibbonImage(Image value) {
    try {
      javonetHandle.set("LargeRibbonImage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Image getLargeRibbonImage() {
    try {
      Object res = javonetHandle.<NObject>get("LargeRibbonImage");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTooltipDescription(java.lang.String value) {
    try {
      javonetHandle.set("TooltipDescription", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTooltipDescription() {
    try {
      java.lang.String res = javonetHandle.get("TooltipDescription");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFont(Font value) {
    try {
      javonetHandle.set("Font", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Font getFont() {
    try {
      Object res = javonetHandle.<NObject>get("Font");
      if (res == null) return null;
      return new Font((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IDictionary getObjectProperties() {
    try {
      Object res = javonetHandle.<NObject>get("ObjectProperties");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsInTableCell() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsInTableCell");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DesignerPropertyCollection getDesignerProperties() {
    try {
      Object res = javonetHandle.<NObject>get("DesignerProperties");
      if (res == null) return null;
      return new DesignerPropertyCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DesignerObject() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DesignerObject");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "SetOptionString",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SetOptionStringHandler handler : _SetOptionStringListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SetOptionStringEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PostCloneDesignerObject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PostCloneDesignerObjectHandler handler : _PostCloneDesignerObjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PostCloneDesignerObjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DrawDesignerObject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrawDesignerObjectHandler handler : _DrawDesignerObjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrawDesignerObjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EditDesignerObject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EditDesignerObjectHandler handler : _EditDesignerObjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EditDesignerObjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CreateDesignerObject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (CreateDesignerObjectHandler handler : _CreateDesignerObjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CreateDesignerObjectEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResetPrintState",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ResetPrintStateDesignerObjectHandler handler : _ResetPrintStateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetFieldHeightInformation",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GetFieldHeightInformationHandler handler : _GetFieldHeightInformationListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetFieldHeightInformationEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "InitializationFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _InitializationFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PrintStartDesignerObject",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PrintStartDesignerObjectHandler handler : _PrintStartDesignerObjectListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DesignerObject(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UpdateView(java.lang.Boolean changed) {
    try {
      javonetHandle.invoke("UpdateView", changed);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UpdateView(java.lang.Boolean changed, java.lang.Boolean immediate) {
    try {
      javonetHandle.invoke("UpdateView", changed, immediate);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
  public java.lang.Integer SetLLJob(java.lang.Integer hLLJob, java.lang.Integer pLLBase) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("SetLLJob", hLLJob, pLLBase);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetName(AtomicReference<java.lang.String> pbsName) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke(
                  "GetName",
                  new NOut(pbsName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetDescr(AtomicReference<java.lang.String> pbsDescr) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke(
                  "GetDescr",
                  new NOut(pbsDescr, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetIcon(IntPtr phIcon) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("GetIcon", phIcon);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer IsProjectSupported(
      java.lang.Integer nProjType, AtomicReference<java.lang.Boolean> pbSupported) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke(
                  "IsProjectSupported",
                  nProjType,
                  new NOut(
                      pbSupported, JavonetHelper.JavaToDotnetType.get(java.lang.Boolean.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetOption(java.lang.Integer nOption, java.lang.Integer nValue) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("SetOption", nOption, nValue);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetOption(java.lang.Integer nOption, IntPtr pnValue) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("GetOption", nOption, pnValue);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetOptionString(java.lang.String sOption, java.lang.String sText) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("SetOptionString", sOption, sText);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetOptionString(
      java.lang.String sOption, AtomicReference<java.lang.String> psText) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke(
                  "GetOptionString",
                  sOption,
                  new NOut(psText, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetParameters(Object pUnk) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("SetParameters", pUnk);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetParameters(Object pUnk) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("GetParameters", pUnk);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Clone(Object ppNewObj) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("Clone", ppNewObj);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer FirstCreation(IntPtr hWndParent) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("FirstCreation", hWndParent);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetMinDimensionsSCM(
      java.lang.Boolean bForNew, AtomicReference<java.lang.Integer> ptMinSize) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("GetMinDimensionsSCM", bForNew, new NRef(ptMinSize));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Show(
      IntPtr hDC,
      RECT prcPaint,
      IntPtr hExportProfJob,
      IntPtr hExportProfList,
      java.lang.Integer nExportVerbosity,
      java.lang.Integer nDestination,
      java.lang.Boolean bSelected) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke(
                  "Show",
                  hDC,
                  prcPaint,
                  hExportProfJob,
                  hExportProfList,
                  nExportVerbosity,
                  nDestination,
                  bSelected);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetTrueRect(RECT prc) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("GetTrueRect", prc);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetErrorcode() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("GetErrorcode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer AllowPageBreak() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("AllowPageBreak");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ResetPrintState() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("ResetPrintState");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ForceResetPrintState() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("ForceResetPrintState");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer PrintWaiting() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("PrintWaiting");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer PrintUnfinished() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("PrintUnfinished");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer PrintFinished() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("PrintFinished");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer PrintPastFinished() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("PrintPastFinished");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetNtfySink(Object pNtfySink) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("SetNtfySink", pNtfySink);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Edit(IntPtr hWnd, PointInt ptMouse) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("Edit", hWnd, ptMouse);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ClearEditPartInfo() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("ClearEditPartInfo");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer CanEditPart(PointInt ptMouse, IntPtr phMenu) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("CanEditPart", ptMouse, phMenu);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer EditPart(IntPtr hWnd, PointInt ptMouse, java.lang.Integer nMenuID) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("EditPart", hWnd, ptMouse, nMenuID);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer CancelEditPart() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("CancelEditPart");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer OnDragDrop(
      IntPtr pDataObj,
      java.lang.Integer grfKeyState,
      PointInt p,
      IntPtr pdwEffect,
      java.lang.Boolean bQuery) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("OnDragDrop", pDataObj, grfKeyState, p, pdwEffect, bQuery);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer IsSetFontSupported(AtomicReference<java.lang.Boolean> pbSupported) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke(
                  "IsSetFontSupported",
                  new NOut(
                      pbSupported, JavonetHelper.JavaToDotnetType.get(java.lang.Boolean.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetFont(IntPtr pLF, java.lang.Integer nSize, IntPtr rgbColor) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("SetFont", pLF, nSize, rgbColor);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer OnObject(IntPtr hDC, PointInt ptMouse) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("OnObject", hDC, ptMouse);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer InObject(IntPtr hDC, PointInt ptMouse) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("InObject", hDC, ptMouse);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer CalcDistanceToFrame(
      IntPtr hDC, PointInt ptMouse, AtomicReference<java.lang.Integer> pnDistance) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("CalcDistanceToFrame", hDC, ptMouse, new NRef(pnDistance));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer OnMouseMove(IntPtr hDC, PointInt ptMouse, IntPtr phCrs) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("OnMouseMove", hDC, ptMouse, phCrs);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer OnMouseLButton(IntPtr hDC, PointInt ptMouse, IntPtr hWnd) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("OnMouseLButton", hDC, ptMouse, hWnd);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer OnDeclareChartRow(java.lang.String sActiveTable) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("OnDeclareChartRow", sActiveTable);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer CanCreateObjectFromType(
      java.lang.Integer nLLType, java.lang.String sVarName, RECT prcCreate) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke("CanCreateObjectFromType", nLLType, sVarName, prcCreate);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetVarSizeInfo(
      IntPtr hDC,
      IntPtr prcSpaceAvailable,
      AtomicReference<java.lang.Integer> pnMinHeight,
      AtomicReference<java.lang.Integer> pnIdealHeight) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerObject")
              .invoke(
                  "GetVarSizeInfo",
                  hDC,
                  prcSpaceAvailable,
                  new NRef(pnMinHeight),
                  new NRef(pnIdealHeight));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Next(
      java.lang.Integer size, Object property, AtomicReference<java.lang.Integer> count) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IPropertyEnumeration")
              .invoke(
                  "Next",
                  size,
                  property,
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
  public java.lang.Integer Skip(java.lang.Integer value) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IPropertyEnumeration")
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
  public java.lang.Integer Reset() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IPropertyEnumeration")
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
  public IPropertyEnumeration Clone() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IPropertyEnumeration")
              .invoke("Clone");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Event */

  private java.util.ArrayList<SetOptionStringHandler> _SetOptionStringListeners =
      new java.util.ArrayList<SetOptionStringHandler>();

  public void addSetOptionString(SetOptionStringHandler toAdd) {
    _SetOptionStringListeners.add(toAdd);
  }

  public void removeSetOptionString(SetOptionStringHandler toRemove) {
    _SetOptionStringListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<PostCloneDesignerObjectHandler> _PostCloneDesignerObjectListeners =
      new java.util.ArrayList<PostCloneDesignerObjectHandler>();

  public void addPostCloneDesignerObject(PostCloneDesignerObjectHandler toAdd) {
    _PostCloneDesignerObjectListeners.add(toAdd);
  }

  public void removePostCloneDesignerObject(PostCloneDesignerObjectHandler toRemove) {
    _PostCloneDesignerObjectListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DrawDesignerObjectHandler> _DrawDesignerObjectListeners =
      new java.util.ArrayList<DrawDesignerObjectHandler>();

  public void addDrawDesignerObject(DrawDesignerObjectHandler toAdd) {
    _DrawDesignerObjectListeners.add(toAdd);
  }

  public void removeDrawDesignerObject(DrawDesignerObjectHandler toRemove) {
    _DrawDesignerObjectListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EditDesignerObjectHandler> _EditDesignerObjectListeners =
      new java.util.ArrayList<EditDesignerObjectHandler>();

  public void addEditDesignerObject(EditDesignerObjectHandler toAdd) {
    _EditDesignerObjectListeners.add(toAdd);
  }

  public void removeEditDesignerObject(EditDesignerObjectHandler toRemove) {
    _EditDesignerObjectListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<CreateDesignerObjectHandler> _CreateDesignerObjectListeners =
      new java.util.ArrayList<CreateDesignerObjectHandler>();

  public void addCreateDesignerObject(CreateDesignerObjectHandler toAdd) {
    _CreateDesignerObjectListeners.add(toAdd);
  }

  public void removeCreateDesignerObject(CreateDesignerObjectHandler toRemove) {
    _CreateDesignerObjectListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ResetPrintStateDesignerObjectHandler> _ResetPrintStateListeners =
      new java.util.ArrayList<ResetPrintStateDesignerObjectHandler>();

  public void addResetPrintState(ResetPrintStateDesignerObjectHandler toAdd) {
    _ResetPrintStateListeners.add(toAdd);
  }

  public void removeResetPrintState(ResetPrintStateDesignerObjectHandler toRemove) {
    _ResetPrintStateListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<GetFieldHeightInformationHandler>
      _GetFieldHeightInformationListeners =
          new java.util.ArrayList<GetFieldHeightInformationHandler>();

  public void addGetFieldHeightInformation(GetFieldHeightInformationHandler toAdd) {
    _GetFieldHeightInformationListeners.add(toAdd);
  }

  public void removeGetFieldHeightInformation(GetFieldHeightInformationHandler toRemove) {
    _GetFieldHeightInformationListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<EventArgs>> _InitializationFinishedListeners =
      new java.util.ArrayList<EventHandler<EventArgs>>();

  public void addInitializationFinished(EventHandler<EventArgs> toAdd) {
    _InitializationFinishedListeners.add(toAdd);
  }

  public void removeInitializationFinished(EventHandler<EventArgs> toRemove) {
    _InitializationFinishedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<PrintStartDesignerObjectHandler> _PrintStartDesignerObjectListeners =
      new java.util.ArrayList<PrintStartDesignerObjectHandler>();

  public void addPrintStartDesignerObject(PrintStartDesignerObjectHandler toAdd) {
    _PrintStartDesignerObjectListeners.add(toAdd);
  }

  public void removePrintStartDesignerObject(PrintStartDesignerObjectHandler toRemove) {
    _PrintStartDesignerObjectListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
