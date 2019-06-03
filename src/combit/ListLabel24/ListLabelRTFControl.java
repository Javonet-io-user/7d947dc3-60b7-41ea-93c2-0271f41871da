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
import jio.System.ComponentModel.*;

public class ListLabelRTFControl extends Control
    implements IComponent,
        IDisposable,
        IDropTarget,
        ISynchronizeInvoke,
        IWin32Window,
        IBindableComponent,
        ILlRtfEventSink {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public IntPtr getObjectInstance() {
    try {
      Object res = javonetHandle.<NObject>get("ObjectInstance");
      if (res == null) return null;
      return (jio.System.IntPtr) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setParentComponent(ListLabel value) {
    try {
      javonetHandle.set("ParentComponent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ListLabel getParentComponent() {
    try {
      Object res = javonetHandle.<NObject>get("ParentComponent");
      if (res == null) return null;
      return new ListLabel((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTextMode(LlRTFTextMode value) {
    try {
      javonetHandle.set("TextMode", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlRTFTextMode getTextMode() {
    try {
      Object res = javonetHandle.<NEnum>get("TextMode");
      if (res == null) return null;
      return LlRTFTextMode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setContentMode(LlRTFContentMode value) {
    try {
      javonetHandle.set("ContentMode", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlRTFContentMode getContentMode() {
    try {
      Object res = javonetHandle.<NEnum>get("ContentMode");
      if (res == null) return null;
      return LlRTFContentMode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setContent(java.lang.String value) {
    try {
      javonetHandle.set("Content", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getContent() {
    try {
      java.lang.String res = javonetHandle.get("Content");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSelectedText(java.lang.String value) {
    try {
      javonetHandle.set("SelectedText", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSelectedText() {
    try {
      java.lang.String res = javonetHandle.get("SelectedText");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IntPtr getRtfControlHandle() {
    try {
      Object res = javonetHandle.<NObject>get("RtfControlHandle");
      if (res == null) return null;
      return (jio.System.IntPtr) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSelectionStart(java.lang.Integer value) {
    try {
      javonetHandle.set("SelectionStart", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getSelectionStart() {
    try {
      java.lang.Integer res = javonetHandle.get("SelectionStart");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSelectionLength(java.lang.Integer value) {
    try {
      javonetHandle.set("SelectionLength", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getSelectionLength() {
    try {
      java.lang.Integer res = javonetHandle.get("SelectionLength");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public ListLabelRTFControl(IContainer container) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ListLabelRTFControl", container);
      super.construct(javonetHandle);
      javonetHandle.addEventListener(
          "SelectionChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _SelectionChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabelRTFControl() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ListLabelRTFControl");
      super.construct(javonetHandle);
      javonetHandle.addEventListener(
          "SelectionChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _SelectionChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabelRTFControl(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyToClipboard() {
    try {
      javonetHandle.invoke("CopyToClipboard");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ProhibitAction(java.lang.Integer buttonID) {
    try {
      javonetHandle.invoke("ProhibitAction", buttonID);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void InvokeAction(java.lang.Integer buttonID) {
    try {
      javonetHandle.invoke("InvokeAction", buttonID);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ProhibitAction(LlRTFEditorAction action) {
    try {
      javonetHandle.invoke("ProhibitAction", NEnum.fromJavaEnum(action));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void InvokeAction(LlRTFEditorAction action) {
    try {
      javonetHandle.invoke("InvokeAction", NEnum.fromJavaEnum(action));
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
  public void OnSelectionChanged(
      java.lang.Integer type, java.lang.Integer min, java.lang.Integer max) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.ILlRtfEventSink")
          .invoke("OnSelectionChanged", type, min, max);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnContentsChanged() {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.ILlRtfEventSink")
          .invoke("OnContentsChanged");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean OnKeyDown(java.lang.Integer keyCode, java.lang.Integer lParam) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.ILlRtfEventSink")
              .invoke("OnKeyDown", keyCode, lParam);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean OnKeyUp(java.lang.Integer keyCode, java.lang.Integer lParam) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.ILlRtfEventSink")
              .invoke("OnKeyUp", keyCode, lParam);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean OnChar(java.lang.Integer character, java.lang.Integer lParam) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.ILlRtfEventSink")
              .invoke("OnChar", character, lParam);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean OnDialogKey(
      java.lang.Boolean down, java.lang.Integer keyCode, java.lang.Integer lParam) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.ILlRtfEventSink")
              .invoke("OnDialogKey", down, keyCode, lParam);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandler<EventArgs>> _SelectionChangedListeners =
      new java.util.ArrayList<EventHandler<EventArgs>>();

  public void addSelectionChanged(EventHandler<EventArgs> toAdd) {
    _SelectionChangedListeners.add(toAdd);
  }

  public void removeSelectionChanged(EventHandler<EventArgs> toRemove) {
    _SelectionChangedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
