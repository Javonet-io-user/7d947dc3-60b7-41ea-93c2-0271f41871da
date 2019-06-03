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
import jio.System.Windows.Forms.*;
import combit.ListLabel24.*;
import jio.System.*;
import jio.System.Drawing.*;
import jio.System.ComponentModel.*;

public class ListLabelPreviewControl extends Control
    implements IComponent,
        IDisposable,
        IDropTarget,
        ISynchronizeInvoke,
        IWin32Window,
        IBindableComponent {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setFileName(java.lang.String value) {
    try {
      javonetHandle.set("FileName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFileName() {
    try {
      java.lang.String res = javonetHandle.get("FileName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCloseMode(LlPreviewControlCloseMode value) {
    try {
      javonetHandle.set("CloseMode", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlPreviewControlCloseMode getCloseMode() {
    try {
      Object res = javonetHandle.<NEnum>get("CloseMode");
      if (res == null) return null;
      return LlPreviewControlCloseMode.valueOf(((NEnum) res).getValueName());
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
  public void setSaveAsFileName(java.lang.String value) {
    try {
      javonetHandle.set("SaveAsFileName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSaveAsFileName() {
    try {
      java.lang.String res = javonetHandle.get("SaveAsFileName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setShowUnprintableArea(java.lang.Boolean value) {
    try {
      javonetHandle.set("ShowUnprintableArea", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getShowUnprintableArea() {
    try {
      java.lang.Boolean res = javonetHandle.get("ShowUnprintableArea");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAllowRbuttonUsage(java.lang.Boolean value) {
    try {
      javonetHandle.set("AllowRbuttonUsage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAllowRbuttonUsage() {
    try {
      java.lang.Boolean res = javonetHandle.get("AllowRbuttonUsage");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setShowToolbar(java.lang.Boolean value) {
    try {
      javonetHandle.set("ShowToolbar", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getShowToolbar() {
    try {
      java.lang.Boolean res = javonetHandle.get("ShowToolbar");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setShowThumbnails(java.lang.Boolean value) {
    try {
      javonetHandle.set("ShowThumbnails", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getShowThumbnails() {
    try {
      java.lang.Boolean res = javonetHandle.get("ShowThumbnails");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setThumbnailWidth(java.lang.Integer value) {
    try {
      javonetHandle.set("ThumbnailWidth", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getThumbnailWidth() {
    try {
      java.lang.Integer res = javonetHandle.get("ThumbnailWidth");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setThumbnailBackColor(Color value) {
    try {
      javonetHandle.set("ThumbnailBackColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getThumbnailBackColor() {
    try {
      Object res = javonetHandle.<NObject>get("ThumbnailBackColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setZoomStyle(ListLabelPreviewControl.PreviewZoomStyle value) {
    try {
      javonetHandle.set("ZoomStyle", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ListLabelPreviewControl.PreviewZoomStyle getZoomStyle() {
    try {
      Object res = javonetHandle.<NObject>get("ZoomStyle");
      if (res == null) return null;
      return new ListLabelPreviewControl.PreviewZoomStyle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPageStyle(ListLabelPreviewControl.PreviewPageStyle value) {
    try {
      javonetHandle.set("PageStyle", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ListLabelPreviewControl.PreviewPageStyle getPageStyle() {
    try {
      Object res = javonetHandle.<NObject>get("PageStyle");
      if (res == null) return null;
      return new ListLabelPreviewControl.PreviewPageStyle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSelectionFrame(ListLabelPreviewControl.PreviewSelectionFrame value) {
    try {
      javonetHandle.set("SelectionFrame", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ListLabelPreviewControl.PreviewSelectionFrame getSelectionFrame() {
    try {
      Object res = javonetHandle.<NObject>get("SelectionFrame");
      if (res == null) return null;
      return new ListLabelPreviewControl.PreviewSelectionFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setToolbarBackColor(Color value) {
    try {
      javonetHandle.set("ToolbarBackColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getToolbarBackColor() {
    try {
      Object res = javonetHandle.<NObject>get("ToolbarBackColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBackColor(Color value) {
    try {
      javonetHandle.set("BackColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getBackColor() {
    try {
      Object res = javonetHandle.<NObject>get("BackColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCurrentPage(java.lang.Integer value) {
    try {
      javonetHandle.set("CurrentPage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCurrentPage() {
    try {
      java.lang.Integer res = javonetHandle.get("CurrentPage");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPageCount() {
    try {
      java.lang.Integer res = javonetHandle.get("PageCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setForceReadOnly(java.lang.Boolean value) {
    try {
      javonetHandle.set("ForceReadOnly", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getForceReadOnly() {
    try {
      java.lang.Boolean res = javonetHandle.get("ForceReadOnly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setToolbarButtons(ListLabelPreviewButtons value) {
    try {
      javonetHandle.set("ToolbarButtons", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ListLabelPreviewButtons getToolbarButtons() {
    try {
      Object res = javonetHandle.<NObject>get("ToolbarButtons");
      if (res == null) return null;
      return new ListLabelPreviewButtons((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSlideshowMode(java.lang.Boolean value) {
    try {
      javonetHandle.set("SlideshowMode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSlideshowMode() {
    try {
      java.lang.Boolean res = javonetHandle.get("SlideshowMode");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public ListLabelPreviewControl(IContainer container) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ListLabelPreviewControl", container);
      super.construct(javonetHandle);
      javonetHandle.addEventListener(
          "PageChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ListLabelPreviewControl.PageChangedHandler handler : _PageChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ListLabelPreviewControl.PageChangedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ZoomChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _ZoomChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ButtonPress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ListLabelPreviewControl.ButtonPressHandler handler : _ButtonPressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ListLabelPreviewControl.ButtonPressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LoadFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ListLabelPreviewControl.LoadFinishedHandler handler : _LoadFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ListLabelPreviewControl.LoadFinishedEventArgs.class));
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
      javonetHandle.addEventListener(
          "Progress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ProgressEventArgs> handler : _ProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ProgressEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabelPreviewControl() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ListLabelPreviewControl");
      super.construct(javonetHandle);
      javonetHandle.addEventListener(
          "PageChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ListLabelPreviewControl.PageChangedHandler handler : _PageChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ListLabelPreviewControl.PageChangedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ZoomChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _ZoomChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ButtonPress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ListLabelPreviewControl.ButtonPressHandler handler : _ButtonPressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ListLabelPreviewControl.ButtonPressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LoadFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ListLabelPreviewControl.LoadFinishedHandler handler : _LoadFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ListLabelPreviewControl.LoadFinishedEventArgs.class));
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
      javonetHandle.addEventListener(
          "Progress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ProgressEventArgs> handler : _ProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ProgressEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabelPreviewControl(ILlLogger logger) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ListLabelPreviewControl", logger);
      super.construct(javonetHandle);
      javonetHandle.addEventListener(
          "PageChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ListLabelPreviewControl.PageChangedHandler handler : _PageChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ListLabelPreviewControl.PageChangedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ZoomChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _ZoomChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ButtonPress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ListLabelPreviewControl.ButtonPressHandler handler : _ButtonPressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ListLabelPreviewControl.ButtonPressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LoadFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ListLabelPreviewControl.LoadFinishedHandler handler : _LoadFinishedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ListLabelPreviewControl.LoadFinishedEventArgs.class));
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
      javonetHandle.addEventListener(
          "Progress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ProgressEventArgs> handler : _ProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ProgressEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabelPreviewControl(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ZoomTimes2() {
    try {
      javonetHandle.invoke("ZoomTimes2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ZoomRevert() {
    try {
      javonetHandle.invoke("ZoomRevert");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ZoomReset() {
    try {
      javonetHandle.invoke("ZoomReset");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SelectSlideshowTransition() {
    try {
      javonetHandle.invoke("SelectSlideshowTransition");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PrintCurrentPage(java.lang.Boolean showPrintOptions) {
    try {
      javonetHandle.invoke("PrintCurrentPage", showPrintOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PrintAllPages(java.lang.Boolean showPrintOptions) {
    try {
      javonetHandle.invoke("PrintAllPages", showPrintOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GotoFirst() {
    try {
      javonetHandle.invoke("GotoFirst");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GotoLast() {
    try {
      javonetHandle.invoke("GotoLast");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GotoNext() {
    try {
      javonetHandle.invoke("GotoNext");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GotoPrevious() {
    try {
      javonetHandle.invoke("GotoPrevious");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetZoom(LlZoomMode zoomMode, java.lang.Double value) {
    try {
      javonetHandle.invoke("SetZoom", NEnum.fromJavaEnum(zoomMode), value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetZoom(LlZoomPredefined zoomPredefined) {
    try {
      javonetHandle.invoke("SetZoom", NEnum.fromJavaEnum(zoomPredefined));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Double GetZoom(LlZoomMode zoomMode) {
    try {
      java.lang.Double res = javonetHandle.invoke("GetZoom", NEnum.fromJavaEnum(zoomMode));
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetOption(IntPtr option, IntPtr value) {
    try {
      javonetHandle.invoke("SetOption", option, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetOptionString(java.lang.String option, java.lang.String value) {
    try {
      javonetHandle.invoke("SetOptionString", option, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetOptionString(java.lang.String option) {
    try {
      java.lang.String res = javonetHandle.invoke("GetOptionString", option);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RefreshToolbar() {
    try {
      javonetHandle.invoke("RefreshToolbar");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetActualButtonState(java.lang.Integer buttonID) {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetActualButtonState", buttonID);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean CanClose() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("CanClose");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveAs() {
    try {
      javonetHandle.invoke("SaveAs");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveAs(java.lang.String targetFormat) {
    try {
      javonetHandle.invoke("SaveAs", targetFormat);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SendTo() {
    try {
      javonetHandle.invoke("SendTo");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SearchLink(java.lang.String searchText) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("SearchLink", searchText);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SearchFirst(java.lang.String searchText, java.lang.Boolean caseSensitive) {
    try {
      javonetHandle.invoke("SearchFirst", searchText, caseSensitive);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SearchNext() {
    try {
      javonetHandle.invoke("SearchNext");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MoveToNextFile() {
    try {
      javonetHandle.invoke("MoveToNextFile");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MoveToPreviousFile() {
    try {
      javonetHandle.invoke("MoveToPreviousFile");
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
  /** Event */

  private java.util.ArrayList<ListLabelPreviewControl.PageChangedHandler> _PageChangedListeners =
      new java.util.ArrayList<ListLabelPreviewControl.PageChangedHandler>();

  public void addPageChanged(ListLabelPreviewControl.PageChangedHandler toAdd) {
    _PageChangedListeners.add(toAdd);
  }

  public void removePageChanged(ListLabelPreviewControl.PageChangedHandler toRemove) {
    _PageChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<EventArgs>> _ZoomChangedListeners =
      new java.util.ArrayList<EventHandler<EventArgs>>();

  public void addZoomChanged(EventHandler<EventArgs> toAdd) {
    _ZoomChangedListeners.add(toAdd);
  }

  public void removeZoomChanged(EventHandler<EventArgs> toRemove) {
    _ZoomChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ListLabelPreviewControl.ButtonPressHandler> _ButtonPressListeners =
      new java.util.ArrayList<ListLabelPreviewControl.ButtonPressHandler>();

  public void addButtonPress(ListLabelPreviewControl.ButtonPressHandler toAdd) {
    _ButtonPressListeners.add(toAdd);
  }

  public void removeButtonPress(ListLabelPreviewControl.ButtonPressHandler toRemove) {
    _ButtonPressListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ListLabelPreviewControl.LoadFinishedHandler> _LoadFinishedListeners =
      new java.util.ArrayList<ListLabelPreviewControl.LoadFinishedHandler>();

  public void addLoadFinished(ListLabelPreviewControl.LoadFinishedHandler toAdd) {
    _LoadFinishedListeners.add(toAdd);
  }

  public void removeLoadFinished(ListLabelPreviewControl.LoadFinishedHandler toRemove) {
    _LoadFinishedListeners.remove(toRemove);
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
  /** Event */

  private java.util.ArrayList<EventHandler<ProgressEventArgs>> _ProgressListeners =
      new java.util.ArrayList<EventHandler<ProgressEventArgs>>();

  public void addProgress(EventHandler<ProgressEventArgs> toAdd) {
    _ProgressListeners.add(toAdd);
  }

  public void removeProgress(EventHandler<ProgressEventArgs> toRemove) {
    _ProgressListeners.remove(toRemove);
  }

  public static class PreviewZoomStyle {
    protected NObject javonetHandle;
    /** SetProperty */
    @MethodTypeAnnotation(type = "SetField")
    public void setValue(java.lang.Integer value) {
      try {
        javonetHandle.set("Value", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getValue() {
      try {
        java.lang.Integer res = javonetHandle.get("Value");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setMode(LlZoomMode value) {
      try {
        javonetHandle.set("Mode", NEnum.fromJavaEnum(value));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public LlZoomMode getMode() {
      try {
        Object res = javonetHandle.<NEnum>get("Mode");
        if (res == null) return null;
        return LlZoomMode.valueOf(((NEnum) res).getValueName());
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public PreviewZoomStyle(ListLabelPreviewControl parentPreviewControl) {
      try {
        javonetHandle =
            Javonet.New(
                "combit.ListLabel24.ListLabelPreviewControl+PreviewZoomStyle",
                parentPreviewControl);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public PreviewZoomStyle(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class PreviewPageStyle {
    protected NObject javonetHandle;
    /** SetProperty */
    @MethodTypeAnnotation(type = "SetField")
    public void setShowPageNumbers(java.lang.Boolean value) {
      try {
        javonetHandle.set("ShowPageNumbers", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getShowPageNumbers() {
      try {
        java.lang.Boolean res = javonetHandle.get("ShowPageNumbers");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setDropShadow(ListLabelPreviewControl.PreviewPageStyle.DropShadowType value) {
      try {
        javonetHandle.set("DropShadow", NEnum.fromJavaEnum(value));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public ListLabelPreviewControl.PreviewPageStyle.DropShadowType getDropShadow() {
      try {
        Object res = javonetHandle.<NEnum>get("DropShadow");
        if (res == null) return null;
        return ListLabelPreviewControl.PreviewPageStyle.DropShadowType.valueOf(
            ((NEnum) res).getValueName());
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public PreviewPageStyle(ListLabelPreviewControl parentPreviewControl) {
      try {
        javonetHandle =
            Javonet.New(
                "combit.ListLabel24.ListLabelPreviewControl+PreviewPageStyle",
                parentPreviewControl);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public PreviewPageStyle(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }

    public enum DropShadowType {
      None(0L),
      Standard(1L),
      ;
      private long numVal;

      DropShadowType(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }
  }

  public static class PreviewSelectionFrame {
    protected NObject javonetHandle;
    /** SetProperty */
    @MethodTypeAnnotation(type = "SetField")
    public void setFrameType(
        ListLabelPreviewControl.PreviewSelectionFrame.SelectedPageFrameType value) {
      try {
        javonetHandle.set("FrameType", NEnum.fromJavaEnum(value));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public ListLabelPreviewControl.PreviewSelectionFrame.SelectedPageFrameType getFrameType() {
      try {
        Object res = javonetHandle.<NEnum>get("FrameType");
        if (res == null) return null;
        return ListLabelPreviewControl.PreviewSelectionFrame.SelectedPageFrameType.valueOf(
            ((NEnum) res).getValueName());
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setColorHighlighted(Color value) {
      try {
        javonetHandle.set("ColorHighlighted", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public Color getColorHighlighted() {
      try {
        Object res = javonetHandle.<NObject>get("ColorHighlighted");
        if (res == null) return null;
        return new Color((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setColor(Color value) {
      try {
        javonetHandle.set("Color", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public Color getColor() {
      try {
        Object res = javonetHandle.<NObject>get("Color");
        if (res == null) return null;
        return new Color((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setFillColorHighlighted(Color value) {
      try {
        javonetHandle.set("FillColorHighlighted", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public Color getFillColorHighlighted() {
      try {
        Object res = javonetHandle.<NObject>get("FillColorHighlighted");
        if (res == null) return null;
        return new Color((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setFillColor(Color value) {
      try {
        javonetHandle.set("FillColor", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public Color getFillColor() {
      try {
        Object res = javonetHandle.<NObject>get("FillColor");
        if (res == null) return null;
        return new Color((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setMarginHeight(java.lang.Integer value) {
      try {
        javonetHandle.set("MarginHeight", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getMarginHeight() {
      try {
        java.lang.Integer res = javonetHandle.get("MarginHeight");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setMarginWidth(java.lang.Integer value) {
      try {
        javonetHandle.set("MarginWidth", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getMarginWidth() {
      try {
        java.lang.Integer res = javonetHandle.get("MarginWidth");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setRoundedCorner(java.lang.Integer value) {
      try {
        javonetHandle.set("RoundedCorner", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getRoundedCorner() {
      try {
        java.lang.Integer res = javonetHandle.get("RoundedCorner");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }

    public PreviewSelectionFrame(ListLabelPreviewControl parentPreviewControl) {
      try {
        javonetHandle =
            Javonet.New(
                "combit.ListLabel24.ListLabelPreviewControl+PreviewSelectionFrame",
                parentPreviewControl);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public PreviewSelectionFrame(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }

    public enum SelectedPageFrameType {
      AreaFillSystem(0L),
      AreaFillLikeWin7(1L),
      AreaFill(2L),
      Frame(3L),
      ;
      private long numVal;

      SelectedPageFrameType(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }
  }

  public static class PageChangedEventArgs extends EventArgs {
    protected NObject javonetHandle;
    /** SetProperty */
    @MethodTypeAnnotation(type = "SetField")
    public void setNewIndex(java.lang.Integer value) {
      try {
        javonetHandle.set("NewIndex", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getNewIndex() {
      try {
        java.lang.Integer res = javonetHandle.get("NewIndex");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }

    public PageChangedEventArgs() {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New("combit.ListLabel24.ListLabelPreviewControl+PageChangedEventArgs");
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public PageChangedEventArgs(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class ButtonPressEventArgs extends EventArgs {
    protected NObject javonetHandle;
    /** SetProperty */
    @MethodTypeAnnotation(type = "SetField")
    public void setButtonID(java.lang.Integer value) {
      try {
        javonetHandle.set("ButtonID", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getButtonID() {
      try {
        java.lang.Integer res = javonetHandle.get("ButtonID");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setIgnore(java.lang.Boolean value) {
      try {
        javonetHandle.set("Ignore", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getIgnore() {
      try {
        java.lang.Boolean res = javonetHandle.get("Ignore");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }

    public ButtonPressEventArgs() {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New("combit.ListLabel24.ListLabelPreviewControl+ButtonPressEventArgs");
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ButtonPressEventArgs(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class LoadFinishedEventArgs extends EventArgs {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getisSuccessful() {
      try {
        java.lang.Boolean res = javonetHandle.get("isSuccessful");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setisSuccessful(java.lang.Boolean param) {
      try {
        javonetHandle.set("isSuccessful", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public LoadFinishedEventArgs() {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New("combit.ListLabel24.ListLabelPreviewControl+LoadFinishedEventArgs");
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public LoadFinishedEventArgs(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public interface PageChangedHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, ListLabelPreviewControl.PageChangedEventArgs e);
  }

  public interface ButtonPressHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, ListLabelPreviewControl.ButtonPressEventArgs e);
  }

  public interface LoadFinishedHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, ListLabelPreviewControl.LoadFinishedEventArgs e);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
