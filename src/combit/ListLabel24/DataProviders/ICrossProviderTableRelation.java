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

public interface ICrossProviderTableRelation extends ITableRelation {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Matches1to1Identifier(java.lang.String identifier);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ITable ResolveChildTable(ITableRow parentRow);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ITableRow ResolveParentRow(ITableRow childRow);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void InvalidateColumnsLayoutCache(java.lang.String tableName);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSupportsGetParentRow();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IDataProvider getParentTableProvider();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IDataProvider getChildTableProvider();
}
