package combit.ListLabel24.DesignerExtensions;

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
import combit.ListLabel24.DesignerExtensions.*;

public interface IDesignerObjectNotifySink {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer UpdateView(java.lang.Integer nFlags, java.lang.Boolean bImmediate);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetActive(java.lang.Boolean bActive);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer NotifyParsingError(
      java.lang.String bsExpr, java.lang.String bsErrortext);
}
