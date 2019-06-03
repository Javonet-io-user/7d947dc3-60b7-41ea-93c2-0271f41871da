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
import jio.System.Runtime.Serialization.*;
import jio.System.Collections.ObjectModel.*;
import combit.ListLabel24.*;

public class CDataDataProvider extends DbConnectionDataProvider
    implements IDataProvider,
        ICanHandleUsedIdentifiers,
        ISerializable,
        IDisposable,
        ISupportsLogger {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public ReadOnlyCollection<java.lang.String> getTableNames() {
    try {
      Object res = javonetHandle.<NObject>get("TableNames");
      if (res == null) return null;
      return new ReadOnlyCollection<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSupportedElementTypes(DbConnectionElementTypes value) {
    try {
      javonetHandle.set("SupportedElementTypes", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DbConnectionElementTypes getSupportedElementTypes() {
    try {
      Object res = javonetHandle.<NEnum>get("SupportedElementTypes");
      if (res == null) return null;
      return DbConnectionElementTypes.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSupportsAdvancedFilteringAsCDataDataProvider(java.lang.Boolean value) {
    try {
      javonetHandle.set("SupportsAdvancedFiltering", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSupportsAdvancedFilteringAsCDataDataProvider() {
    try {
      java.lang.Boolean res = javonetHandle.get("SupportsAdvancedFiltering");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public CDataDataProvider(
      java.lang.String connectionString,
      CDataDataProvider.CDataProviderInvariantName providerInvariantName,
      ReadOnlyCollection<java.lang.String> tableNames) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.CDataDataProvider",
              connectionString,
              NEnum.fromJavaEnum(providerInvariantName),
              tableNames);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CDataDataProvider(
      java.lang.String connectionString,
      CDataDataProvider.CDataProviderInvariantName providerInvariantName) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.CDataDataProvider",
              connectionString,
              NEnum.fromJavaEnum(providerInvariantName));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CDataDataProvider(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Nullable<CDataDataProvider.CDataProviderInvariantName> GetInvariantNameFromString(
      java.lang.String invariantName) {
    try {
      Object res =
          Javonet.getType("combit.ListLabel24.DataProviders.CDataDataProvider")
              .invoke("GetInvariantNameFromString", invariantName);
      if (res == null) return null;
      return new Nullable<CDataDataProvider.CDataProviderInvariantName>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetObjectData(SerializationInfo info, StreamingContext context) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
          .invoke("GetObjectData", info, context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public enum CDataProviderInvariantName {
    Excel(0L),
    Core(1L),
    QuickBooks(2L),
    SharePoint(3L),
    OData(4L),
    PowerShell(5L),
    GoogleSheets(6L),
    Twitter(7L),
    Salesforce(8L),
    Google(9L),
    SAP(10L),
    OFX(11L),
    SimpleDB(12L),
    Email(13L),
    DynamicsCRM(14L),
    LDAP(15L),
    Facebook(16L),
    RSS(17L),
    GMAIL(18L),
    GoogleApps(19L),
    QuickBooksIDS(20L),
    RSSBusExcel(21L),
    RSSBusCore(22L),
    RSSBusQuickBooks(23L),
    RSSBusSharePoint(24L),
    RSSBusOData(25L),
    RSSBusPowerShell(26L),
    RSSBusGoogleSheets(27L),
    RSSBusTwitter(28L),
    RSSBusSalesforce(29L),
    RSSBusGoogle(30L),
    RSSBusSAP(31L),
    RSSBusOFX(32L),
    RSSBusSimpleDB(33L),
    RSSBusEmail(34L),
    RSSBusDynamicsCRM(35L),
    RSSBusLDAP(36L),
    RSSBusacebook(37L),
    RSSBusRSS(38L),
    RSSBusGMAIL(39L),
    RSSBusGoogleApps(40L),
    RSSBusQuickBooksIDS(41L),
    ;
    private long numVal;

    CDataProviderInvariantName(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
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
