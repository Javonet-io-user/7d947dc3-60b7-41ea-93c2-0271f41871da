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

public interface IQueryableLocalizationDictionary extends ILocalizationDictionary {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Clear();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IQueryableTranslationList getIQueryableLocalizationDictionary_Tables();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IQueryableIdentifierTranslationList getIQueryableLocalizationDictionary_Identifiers();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IQueryableTranslationList getIQueryableLocalizationDictionary_Relations();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IQueryableTranslationList getIQueryableLocalizationDictionary_SortOrders();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IQueryableTranslationList getIQueryableLocalizationDictionary_StaticTexts();
}
