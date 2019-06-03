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

public interface ILlRtfEventSink {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnSelectionChanged(
      java.lang.Integer type, java.lang.Integer min, java.lang.Integer max);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnContentsChanged();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean OnKeyDown(java.lang.Integer keyCode, java.lang.Integer lParam);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean OnKeyUp(java.lang.Integer keyCode, java.lang.Integer lParam);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean OnChar(java.lang.Integer character, java.lang.Integer lParam);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean OnDialogKey(
      java.lang.Boolean down, java.lang.Integer keyCode, java.lang.Integer lParam);
}
