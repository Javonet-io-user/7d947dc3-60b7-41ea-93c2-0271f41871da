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

public class PaperSize {
  public NObject javonetHandle;

  public PaperSize() {
    try {
      javonetHandle = Javonet.New("System.Drawing.Printing.PaperSize");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PaperSize(java.lang.String name, java.lang.Integer width, java.lang.Integer height) {
    try {
      javonetHandle = Javonet.New("System.Drawing.Printing.PaperSize", name, width, height);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PaperSize(NObject handle) {
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
