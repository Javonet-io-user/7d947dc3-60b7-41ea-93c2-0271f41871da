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
import Irony.Parsing.*;
import jio.System.Collections.*;
import jio.System.Runtime.Serialization.*;

public class LRItemSet extends HashSet<LRItem>
    implements jio.System.Collections.Generic.ICollection<LRItem>,
        jio.System.Collections.Generic.IEnumerable<LRItem>,
        jio.System.Collections.IEnumerable,
        ISerializable,
        IDeserializationCallback,
        ISet<LRItem>,
        IReadOnlyCollection<LRItem> {
  protected NObject javonetHandle;

  public LRItemSet() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.Construction.LRItemSet");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LRItemSet(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public LRItem FindByCore(LR0Item core) {
    try {
      Object res = javonetHandle.invoke("FindByCore", core);
      if (res == null) return null;
      return new LRItem((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public LRItemSet SelectByCurrent(BnfTerm current) {
    try {
      Object res = javonetHandle.invoke("SelectByCurrent", current);
      if (res == null) return null;
      return new LRItemSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public LR0ItemSet GetShiftedCores() {
    try {
      Object res = javonetHandle.invoke("GetShiftedCores");
      if (res == null) return null;
      return new LR0ItemSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public LRItemSet SelectByLookahead(Terminal lookahead) {
    try {
      Object res = javonetHandle.invoke("SelectByLookahead", lookahead);
      if (res == null) return null;
      return new LRItemSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
