package combit.ListLabel24.DataProviders;

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
import combit.ListLabel24.DataProviders.*;
import jio.System.*;
import combit.ListLabel24.*;

public interface IAdvancedFiltering {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void ApplyAdvancedFilter(java.lang.String filter, Object[] parameters);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Object TranslateFilterSyntax(
      LlExpressionPart part, Object name, java.lang.Integer argumentCount, Object[] arguments);
}
