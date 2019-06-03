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
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public interface IQueryableTranslationList
    extends ITranslationList,
        jio.System.Collections.Generic.IEnumerable<java.lang.Integer>,
        jio.System.Collections.IEnumerable {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Contains(java.lang.String itemName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetItemDisplayName(
      java.lang.String itemName, java.lang.Boolean returnItemIfNotFound, java.lang.Integer LCID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetItemDisplayName(
      java.lang.String itemName, java.lang.Boolean returnItemIfNotFound);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetItemDisplayName(java.lang.String itemName);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getEmpty();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Collections.Generic.IEnumerable<java.lang.Integer> getLCIDs();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Collections.Generic.ICollection<
          KeyValuePair<java.lang.String, java.lang.String>>
      getIQueryableTranslationList_Item(java.lang.Integer lcid);
}
