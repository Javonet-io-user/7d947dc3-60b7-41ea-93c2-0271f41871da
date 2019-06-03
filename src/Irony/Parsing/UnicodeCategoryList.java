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
import jio.System.Globalization.*;
import jio.System.Collections.Generic.*;
import Irony.Parsing.*;
import jio.System.Collections.*;

public class UnicodeCategoryList extends List<UnicodeCategory>
    implements jio.System.Collections.Generic.IList<UnicodeCategory>,
        jio.System.Collections.Generic.ICollection<UnicodeCategory>,
        jio.System.Collections.Generic.IEnumerable<UnicodeCategory>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<UnicodeCategory>,
        IReadOnlyCollection<UnicodeCategory> {
  protected NObject javonetHandle;

  public UnicodeCategoryList() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.UnicodeCategoryList");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UnicodeCategoryList(NObject handle) {
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
