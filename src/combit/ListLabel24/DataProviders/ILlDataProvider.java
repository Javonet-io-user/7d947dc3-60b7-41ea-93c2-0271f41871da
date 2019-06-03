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

public interface ILlDataProvider {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer OpenTable(java.lang.String tableName, Object dataProvider);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer OpenChildTable(java.lang.String relationName, Object dataProvider);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetRowCount(AtomicReference<java.lang.Integer> count);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer DefineDelayedInfo(java.lang.Integer delayedInfo);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer MoveNext();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer DefineRow(java.lang.Integer parentRowMode, Object parentPath);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Dispose();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetUsedIdentifiers(Object usedIdentifiers);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ApplySortOrder(java.lang.String sortDescription);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ApplyFilter(Object keys, Object values);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ApplyAdvancedFilter(java.lang.String filter, Object parameters);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetOption(TableOption option, Object value);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetOption(TableOption option, Object value);
}
