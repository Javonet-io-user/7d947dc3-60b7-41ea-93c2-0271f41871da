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
import jio.System.*;

public interface ILlLogger {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean WantOutput(LogLevels level, LogCategory category);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Debug(LogCategory category, java.lang.String message, Object[] args);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Debug(
      java.lang.Integer indentationDelta,
      LogCategory category,
      java.lang.String message,
      Object[] args);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Info(LogCategory category, java.lang.String message, Object[] args);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Info(
      java.lang.Integer indentationDelta,
      LogCategory category,
      java.lang.String message,
      Object[] args);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Warn(LogCategory category, java.lang.String message, Object[] args);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Error(LogCategory category, java.lang.String message, Object[] args);
}
