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

public class ParserStack extends List<ParseTreeNode>
    implements jio.System.Collections.Generic.IList<ParseTreeNode>,
        jio.System.Collections.Generic.ICollection<ParseTreeNode>,
        jio.System.Collections.Generic.IEnumerable<ParseTreeNode>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<ParseTreeNode>,
        IReadOnlyCollection<ParseTreeNode> {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public ParseTreeNode getTop() {
    try {
      Object res = javonetHandle.<NObject>get("Top");
      if (res == null) return null;
      return new ParseTreeNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ParserStack() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.ParserStack");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParserStack(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Push(ParseTreeNode nodeInfo) {
    try {
      javonetHandle.invoke("Push", nodeInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Push(ParseTreeNode nodeInfo, ParserState state) {
    try {
      javonetHandle.invoke("Push", nodeInfo, state);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ParseTreeNode Pop() {
    try {
      Object res = javonetHandle.invoke("Pop");
      if (res == null) return null;
      return new ParseTreeNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Pop(java.lang.Integer count) {
    try {
      javonetHandle.invoke("Pop", count);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PopUntil(java.lang.Integer finalCount) {
    try {
      javonetHandle.invoke("PopUntil", finalCount);
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
