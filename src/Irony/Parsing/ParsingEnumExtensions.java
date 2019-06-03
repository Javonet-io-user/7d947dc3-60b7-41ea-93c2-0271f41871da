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

public class ParsingEnumExtensions {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsSet(TermFlags flags, TermFlags flag) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Irony.Parsing.ParsingEnumExtensions")
              .invoke("IsSet", NEnum.fromJavaEnum(flags), NEnum.fromJavaEnum(flag));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsSet(LanguageFlags flags, LanguageFlags flag) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Irony.Parsing.ParsingEnumExtensions")
              .invoke("IsSet", NEnum.fromJavaEnum(flags), NEnum.fromJavaEnum(flag));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsSet(ParseOptions options, ParseOptions option) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Irony.Parsing.ParsingEnumExtensions")
              .invoke("IsSet", NEnum.fromJavaEnum(options), NEnum.fromJavaEnum(option));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsSet(TermListOptions options, TermListOptions option) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Irony.Parsing.ParsingEnumExtensions")
              .invoke("IsSet", NEnum.fromJavaEnum(options), NEnum.fromJavaEnum(option));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsSet(ProductionFlags flags, ProductionFlags flag) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Irony.Parsing.ParsingEnumExtensions")
              .invoke("IsSet", NEnum.fromJavaEnum(flags), NEnum.fromJavaEnum(flag));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
