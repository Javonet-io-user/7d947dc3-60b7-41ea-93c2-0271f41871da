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

public class ConditionalParserAction extends ParserAction {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public ConditionalParserAction.ConditionalEntryList getConditionalEntries() {
    try {
      Object res = javonetHandle.<NObject>get("ConditionalEntries");
      if (res == null) return null;
      return new ConditionalParserAction.ConditionalEntryList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setConditionalEntries(ConditionalParserAction.ConditionalEntryList param) {
    try {
      javonetHandle.set("ConditionalEntries", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public ParserAction getDefaultAction() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultAction");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultAction(ParserAction param) {
    try {
      javonetHandle.set("DefaultAction", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ConditionalParserAction() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.ConditionalParserAction");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ConditionalParserAction(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Execute(ParsingContext context) {
    try {
      javonetHandle.invoke("Execute", context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public static class ConditionalEntry {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public ConditionalParserAction.ConditionChecker getCondition() {
      try {
        Object res = javonetHandle.<NObject>get("Condition");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCondition(ConditionalParserAction.ConditionChecker param) {
      try {
        javonetHandle.set("Condition", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public ParserAction getAction() {
      try {
        Object res = javonetHandle.<NObject>get("Action");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setAction(ParserAction param) {
      try {
        javonetHandle.set("Action", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getDescription() {
      try {
        java.lang.String res = javonetHandle.get("Description");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setDescription(java.lang.String param) {
      try {
        javonetHandle.set("Description", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ConditionalEntry(
        ConditionalParserAction.ConditionChecker condition,
        ParserAction action,
        java.lang.String description) {
      try {
        javonetHandle =
            Javonet.New(
                "Irony.Parsing.ConditionalParserAction+ConditionalEntry",
                condition,
                action,
                description);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ConditionalEntry(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
  }

  public static class ConditionalEntryList extends List<ConditionalParserAction.ConditionalEntry>
      implements jio.System.Collections.Generic.IList<ConditionalParserAction.ConditionalEntry>,
          jio.System.Collections.Generic.ICollection<ConditionalParserAction.ConditionalEntry>,
          jio.System.Collections.Generic.IEnumerable<ConditionalParserAction.ConditionalEntry>,
          jio.System.Collections.IEnumerable,
          jio.System.Collections.IList,
          jio.System.Collections.ICollection,
          IReadOnlyList<ConditionalParserAction.ConditionalEntry>,
          IReadOnlyCollection<ConditionalParserAction.ConditionalEntry> {
    protected NObject javonetHandle;

    public ConditionalEntryList() {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("Irony.Parsing.ConditionalParserAction+ConditionalEntryList");
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ConditionalEntryList(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public interface ConditionChecker {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public java.lang.Boolean Invoke(ParsingContext context);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
