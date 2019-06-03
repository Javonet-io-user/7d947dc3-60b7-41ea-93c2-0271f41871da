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
import jio.System.Drawing.*;

public class CoordinateHelper {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SCMFromPosition(java.lang.Double value, LlUnits unit) {
    try {
      java.lang.Integer res =
          Javonet.getType("combit.ListLabel24.CoordinateHelper")
              .invoke("SCMFromPosition", value, NEnum.fromJavaEnum(unit));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Double ConvertUnit(
      java.lang.Double value,
      CoordinateHelper.ConversionUnit source,
      LlUnits target,
      Graphics graphics) {
    try {
      java.lang.Double res =
          Javonet.getType("combit.ListLabel24.CoordinateHelper")
              .invoke(
                  "ConvertUnit",
                  value,
                  NEnum.fromJavaEnum(source),
                  NEnum.fromJavaEnum(target),
                  graphics);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Double ConvertToPixel(
      java.lang.Double value, LlUnits source, java.lang.Integer dpi) {
    try {
      java.lang.Double res =
          Javonet.getType("combit.ListLabel24.CoordinateHelper")
              .invoke("ConvertToPixel", value, NEnum.fromJavaEnum(source), dpi);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }

  public enum ConversionUnit {
    Point(0L),
    Pixel(1L),
    Twip(2L),
    SCM(3L),
    ;
    private long numVal;

    ConversionUnit(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
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
