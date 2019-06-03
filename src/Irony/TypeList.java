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
import jio.System.*;
import jio.System.Collections.Generic.*;
import Irony.*;
import jio.System.Collections.*;

public class TypeList extends List<jio.System.Type>
    implements jio.System.Collections.Generic.IList<jio.System.Type>,
        jio.System.Collections.Generic.ICollection<jio.System.Type>,
        jio.System.Collections.Generic.IEnumerable<jio.System.Type>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<jio.System.Type>,
        IReadOnlyCollection<jio.System.Type> {
  protected NObject javonetHandle;

  public TypeList() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.TypeList");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TypeList(jio.System.Type[] types) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.TypeList", new Object[] {types});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TypeList(NObject handle) {
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
