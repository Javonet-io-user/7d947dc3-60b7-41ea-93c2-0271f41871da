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
import combit.ListLabel24.DataProviders.*;
import jio.System.Collections.ObjectModel.*;

public class UsedIdentifierHelper {
  protected NObject javonetHandle;

  public UsedIdentifierHelper(ReadOnlyCollection<java.lang.String> identifiers) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.UsedIdentifierHelper", identifiers);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UsedIdentifierHelper(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean HasIdentifiersStartingWith(
      java.lang.String value, java.lang.Boolean caseSensitive) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke("HasIdentifiersStartingWith", value, caseSensitive);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ReadOnlyCollection<java.lang.String> GetIdentifiersForTable(
      IDataProvider dataProvider,
      java.lang.String tableName,
      java.lang.Boolean includeJoinedIdentifiers) {
    try {
      Object res =
          javonetHandle.invoke(
              "GetIdentifiersForTable", dataProvider, tableName, includeJoinedIdentifiers);
      if (res == null) return null;
      return new ReadOnlyCollection<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
