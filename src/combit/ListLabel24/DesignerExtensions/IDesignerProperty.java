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
import jio.System.*;

public interface IDesignerProperty {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetLLJob(java.lang.Integer jobHandle, IntPtr baseInterface);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetName(AtomicReference<java.lang.String> name);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetPropertyItem(Object propertyItem);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetOption(java.lang.String optionName, Object value);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer NotifyChanged();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer NotifyButtonClicked();
}
