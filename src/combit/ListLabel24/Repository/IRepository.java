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
import jio.System.IO.*;
import jio.System.Threading.*;
import jio.System.Collections.Generic.*;

public interface IRepository {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ContainsItem(java.lang.String id);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void LoadItem(
      java.lang.String id, Stream destinationStream, CancellationToken cancelToken);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IEnumerable<RepositoryItem> GetAllItems();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RepositoryItem GetItem(java.lang.String id);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void DeleteItem(java.lang.String id);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void CreateOrUpdateItem(
      RepositoryItem item, java.lang.String importUserData, Stream sourceStream);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean LockItem(java.lang.String id);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void UnlockItem(java.lang.String id);
}
