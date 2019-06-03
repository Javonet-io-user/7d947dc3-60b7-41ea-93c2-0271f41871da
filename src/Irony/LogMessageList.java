package Irony;

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
import Irony.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public class LogMessageList extends List<LogMessage>
    implements jio.System.Collections.Generic.IList<LogMessage>,
        jio.System.Collections.Generic.ICollection<LogMessage>,
        jio.System.Collections.Generic.IEnumerable<LogMessage>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<LogMessage>,
        IReadOnlyCollection<LogMessage> {
  protected NObject javonetHandle;

  public LogMessageList() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.LogMessageList");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LogMessageList(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ByLocation(LogMessage x, LogMessage y) {
    try {
      java.lang.Integer res = Javonet.getType("Irony.LogMessageList").invoke("ByLocation", x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
