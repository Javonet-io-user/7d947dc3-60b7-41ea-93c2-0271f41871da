package Irony.Parsing.Construction;

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
import Irony.Parsing.Construction.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public class LR0ItemList extends List<LR0Item>
    implements jio.System.Collections.Generic.IList<LR0Item>,
        jio.System.Collections.Generic.ICollection<LR0Item>,
        jio.System.Collections.Generic.IEnumerable<LR0Item>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<LR0Item>,
        IReadOnlyCollection<LR0Item> {
  protected NObject javonetHandle;

  public LR0ItemList() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.Construction.LR0ItemList");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LR0ItemList(NObject handle) {
    super(handle);
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
