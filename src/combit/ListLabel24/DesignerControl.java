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

public class DesignerControl extends Control
    implements IComponent,
        IDisposable,
        IDropTarget,
        ISynchronizeInvoke,
        IWin32Window,
        IBindableComponent {
  protected NObject javonetHandle;
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

  public DesignerControl() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DesignerControl");
      super.construct(javonetHandle);
      javonetHandle.addEventListener(
          "DesignerOpening",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _DesignerOpeningListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DesignerClosing",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _DesignerClosingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DesignerControl(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
  public void Save() {
    try {
      javonetHandle.invoke("Save");
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

  private java.util.ArrayList<EventHandler<EventArgs>> _DesignerOpeningListeners =
      new java.util.ArrayList<EventHandler<EventArgs>>();

  public void addDesignerOpening(EventHandler<EventArgs> toAdd) {
    _DesignerOpeningListeners.add(toAdd);
  }

  public void removeDesignerOpening(EventHandler<EventArgs> toRemove) {
    _DesignerOpeningListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<EventArgs>> _DesignerClosingListeners =
      new java.util.ArrayList<EventHandler<EventArgs>>();

  public void addDesignerClosing(EventHandler<EventArgs> toAdd) {
    _DesignerClosingListeners.add(toAdd);
  }

  public void removeDesignerClosing(EventHandler<EventArgs> toRemove) {
    _DesignerClosingListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
