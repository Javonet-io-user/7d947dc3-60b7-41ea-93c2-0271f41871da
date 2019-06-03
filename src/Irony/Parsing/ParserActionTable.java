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

public class ParserActionTable extends Dictionary<BnfTerm, ParserAction>
    implements jio.System.Collections.Generic.IDictionary<BnfTerm, ParserAction>,
        jio.System.Collections.Generic.ICollection<KeyValuePair<BnfTerm, ParserAction>>,
        jio.System.Collections.Generic.IEnumerable<KeyValuePair<BnfTerm, ParserAction>>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IDictionary,
        jio.System.Collections.ICollection,
        IReadOnlyDictionary<BnfTerm, ParserAction>,
        IReadOnlyCollection<KeyValuePair<BnfTerm, ParserAction>>,
        ISerializable,
        IDeserializationCallback {
  protected NObject javonetHandle;

  public ParserActionTable() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.ParserActionTable");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParserActionTable(NObject handle) {
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
