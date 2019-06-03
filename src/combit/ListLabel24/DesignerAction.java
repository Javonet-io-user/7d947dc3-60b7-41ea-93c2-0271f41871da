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
import jio.System.*;
import combit.ListLabel24.*;
import jio.System.Windows.Forms.*;

public class DesignerAction extends Component implements IComponent, IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setMenuText(java.lang.String value) {
    try {
      javonetHandle.set("MenuText", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getMenuText() {
    try {
      java.lang.String res = javonetHandle.get("MenuText");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMenuHierarchy(java.lang.String value) {
    try {
      javonetHandle.set("MenuHierarchy", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getMenuHierarchy() {
    try {
      java.lang.String res = javonetHandle.get("MenuHierarchy");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTooltipText(java.lang.String value) {
    try {
      javonetHandle.set("TooltipText", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTooltipText() {
    try {
      java.lang.String res = javonetHandle.get("TooltipText");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAddToToolbar(java.lang.Boolean value) {
    try {
      javonetHandle.set("AddToToolbar", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAddToToolbar() {
    try {
      java.lang.Boolean res = javonetHandle.get("AddToToolbar");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setInsertionType(DesignerAction.LlActionInsertionType value) {
    try {
      javonetHandle.set("InsertionType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DesignerAction.LlActionInsertionType getInsertionType() {
    try {
      Object res = javonetHandle.<NEnum>get("InsertionType");
      if (res == null) return null;
      return DesignerAction.LlActionInsertionType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIconId(java.lang.Integer value) {
    try {
      javonetHandle.set("IconId", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getIconId() {
    try {
      java.lang.Integer res = javonetHandle.get("IconId");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setShortcutKeys(Keys value) {
    try {
      javonetHandle.set("ShortcutKeys", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Keys getShortcutKeys() {
    try {
      Object res = javonetHandle.<NEnum>get("ShortcutKeys");
      if (res == null) return null;
      return Keys.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DesignerAction() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DesignerAction");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ExecuteAction",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DesignerAction.ExecuteActionHandler handler : _ExecuteActionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetActionState",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DesignerAction.GetActionStateHandler handler : _GetActionStateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetActionStateEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DesignerAction(NObject handle) {
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
      javonetHandle.invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<DesignerAction.ExecuteActionHandler> _ExecuteActionListeners =
      new java.util.ArrayList<DesignerAction.ExecuteActionHandler>();

  public void addExecuteAction(DesignerAction.ExecuteActionHandler toAdd) {
    _ExecuteActionListeners.add(toAdd);
  }

  public void removeExecuteAction(DesignerAction.ExecuteActionHandler toRemove) {
    _ExecuteActionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DesignerAction.GetActionStateHandler> _GetActionStateListeners =
      new java.util.ArrayList<DesignerAction.GetActionStateHandler>();

  public void addGetActionState(DesignerAction.GetActionStateHandler toAdd) {
    _GetActionStateListeners.add(toAdd);
  }

  public void removeGetActionState(DesignerAction.GetActionStateHandler toRemove) {
    _GetActionStateListeners.remove(toRemove);
  }

  public enum LlActionInsertionType {
    Append(0L),
    Insert(268435456L),
    ;
    private long numVal;

    LlActionInsertionType(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  public interface ExecuteActionHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, EventArgs e);
  }

  public interface GetActionStateHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, GetActionStateEventArgs e);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
