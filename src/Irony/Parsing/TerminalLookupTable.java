package Irony.Parsing;

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
import Irony.Parsing.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;
import jio.System.Runtime.Serialization.*;
import jio.System.*;

public class TerminalLookupTable extends Dictionary<java.lang.Character, TerminalList>
    implements jio.System.Collections.Generic.IDictionary<java.lang.Character, TerminalList>,
        jio.System.Collections.Generic.ICollection<KeyValuePair<java.lang.Character, TerminalList>>,
        jio.System.Collections.Generic.IEnumerable<KeyValuePair<java.lang.Character, TerminalList>>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IDictionary,
        jio.System.Collections.ICollection,
        IReadOnlyDictionary<java.lang.Character, TerminalList>,
        IReadOnlyCollection<KeyValuePair<java.lang.Character, TerminalList>>,
        ISerializable,
        IDeserializationCallback {
  protected NObject javonetHandle;

  public TerminalLookupTable() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.TerminalLookupTable");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TerminalLookupTable(NObject handle) {
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
