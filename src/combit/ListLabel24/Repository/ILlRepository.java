package combit.ListLabel24.Repository;

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
import combit.ListLabel24.Repository.*;
import jio.System.*;

public interface ILlRepository {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer DefineItems(IntPtr debugSink, ILLRepositoryItemSink itemsList);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Load(IntPtr debugSink, java.lang.String id, IntPtr destinationStream);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Save(
      IntPtr debugSink,
      java.lang.String id,
      java.lang.String type,
      java.lang.String userDefinedID,
      IntPtr nativeStream,
      java.lang.String itemDescriptor);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Delete(IntPtr debugSink, java.lang.String id);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetInfo(
      IntPtr debugSink, java.lang.String id, RepositoryItemInfo infoType, Object Info);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer AbortLoad(IntPtr debugSink, java.lang.String id);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Lock(IntPtr debugSink, java.lang.String id);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Unlock(IntPtr debugSink, java.lang.String id);
}
