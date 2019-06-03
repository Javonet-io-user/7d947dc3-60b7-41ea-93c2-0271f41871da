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
import jio.System.Collections.Generic.*;
import jio.System.Collections.ObjectModel.*;

public interface ITable {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void ApplySort(java.lang.String sortDescription);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void ApplyFilter(java.lang.String filter);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSupportsCount();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSupportsSorting();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSupportsAdvancedSorting();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSupportsFiltering();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCount();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTableName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IEnumerable<ITableRow> getRows();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ReadOnlyCollection<java.lang.String> getSortDescriptions();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ITableRow getSchemaRow();
}
