package jio.System.Windows.Forms.Design;

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
import jio.System.ComponentModel.Design.*;
import jio.System.Windows.Forms.Design.*;
import jio.System.*;
import jio.System.Windows.Forms.*;
import jio.System.Reflection.*;
import Accessibility.*;

public class ControlDesigner extends ComponentDesigner
    implements ITreeDesigner, IDesigner, IDisposable, IDesignerFilter, IComponentInitializer {
  protected NObject javonetHandle;

  public ControlDesigner() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.Design.ControlDesigner");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ControlDesigner(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  public static class ControlDesignerAccessibleObject extends AccessibleObject
      implements IReflect, IAccessible {
    protected NObject javonetHandle;

    public ControlDesignerAccessibleObject(ControlDesigner designer, Control control) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "System.Windows.Forms.Design.ControlDesigner+ControlDesignerAccessibleObject",
                designer,
                control);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ControlDesignerAccessibleObject(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
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
