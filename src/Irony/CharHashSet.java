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
import jio.System.Collections.Generic.*;
import Irony.*;
import jio.System.Collections.*;
import jio.System.Runtime.Serialization.*;
import jio.System.*;

public class CharHashSet extends HashSet<java.lang.Character>
    implements jio.System.Collections.Generic.ICollection<java.lang.Character>,
        jio.System.Collections.Generic.IEnumerable<java.lang.Character>,
        jio.System.Collections.IEnumerable,
        ISerializable,
        IDeserializationCallback,
        ISet<java.lang.Character>,
        IReadOnlyCollection<java.lang.Character> {
  protected NObject javonetHandle;

  public CharHashSet(java.lang.Boolean caseSensitive) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.CharHashSet", caseSensitive);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CharHashSet(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(java.lang.Character ch) {
    try {
      javonetHandle.invoke("Add", ch);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
