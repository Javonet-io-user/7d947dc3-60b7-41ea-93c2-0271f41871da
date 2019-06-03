package combit.ListLabel24;

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
import combit.ListLabel24.*;
import jio.System.Globalization.*;

public class LocalizedName {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCultureCode() {
    try {
      java.lang.String res = javonetHandle.get("CultureCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDisplayName() {
    try {
      java.lang.String res = javonetHandle.get("DisplayName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public LocalizedName(java.lang.String displayName, java.lang.String twoLetterLanguageCode) {
    try {
      javonetHandle =
          Javonet.New("combit.ListLabel24.LocalizedName", displayName, twoLetterLanguageCode);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LocalizedName(java.lang.String displayName, CultureInfo culture) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.LocalizedName", displayName, culture);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LocalizedName(NObject handle) {
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
