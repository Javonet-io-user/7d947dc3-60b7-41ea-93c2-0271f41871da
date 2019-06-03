package jio.System.Drawing.Printing;

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
import jio.System.Drawing.Printing.*;
import jio.System.*;

public class PageSettings implements ICloneable {
  protected NObject javonetHandle;

  public PageSettings() {
    try {
      javonetHandle = Javonet.New("System.Drawing.Printing.PageSettings");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PageSettings(PrinterSettings printerSettings) {
    try {
      javonetHandle = Javonet.New("System.Drawing.Printing.PageSettings", printerSettings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PageSettings(NObject handle) {
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
