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
import jio.System.Runtime.Serialization.*;
import jio.System.*;
import jio.System.Text.*;
import jio.System.IO.*;
import jio.System.Collections.ObjectModel.*;

public class CsvDataProvider implements IDataProvider, IDisposable, ISerializable {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFileName() {
    try {
      java.lang.String res = javonetHandle.get("FileName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setContentEncoding(Encoding value) {
    try {
      javonetHandle.set("ContentEncoding", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Encoding getContentEncoding() {
    try {
      Object res = javonetHandle.<NObject>get("ContentEncoding");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIsNewLineAllowedInQuotedField(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsNewLineAllowedInQuotedField", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsNewLineAllowedInQuotedField() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsNewLineAllowedInQuotedField");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTableName(java.lang.String value) {
    try {
      javonetHandle.set("TableName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTableName() {
    try {
      java.lang.String res = javonetHandle.get("TableName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFirstLineIsHeader(java.lang.Boolean value) {
    try {
      javonetHandle.set("FirstLineIsHeader", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getFirstLineIsHeader() {
    try {
      java.lang.Boolean res = javonetHandle.get("FirstLineIsHeader");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSeparator(java.lang.Character value) {
    try {
      javonetHandle.set("Separator", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getSeparator() {
    try {
      java.lang.Character res = javonetHandle.get("Separator");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLinesToSkip(java.lang.Integer value) {
    try {
      javonetHandle.set("LinesToSkip", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getLinesToSkip() {
    try {
      java.lang.Integer res = javonetHandle.get("LinesToSkip");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSupportsCount(java.lang.Boolean value) {
    try {
      javonetHandle.set("SupportsCount", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSupportsCount() {
    try {
      java.lang.Boolean res = javonetHandle.get("SupportsCount");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFramingCharacter(java.lang.Character value) {
    try {
      javonetHandle.set("FramingCharacter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getFramingCharacter() {
    try {
      java.lang.Character res = javonetHandle.get("FramingCharacter");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CsvDataProvider(java.lang.String fileName) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.CsvDataProvider", fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CsvDataProvider(java.lang.String fileName, java.lang.Boolean firstLineIsHeader) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.CsvDataProvider", fileName, firstLineIsHeader);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CsvDataProvider(
      java.lang.String fileName, java.lang.Boolean firstLineIsHeader, java.lang.String tableName) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.CsvDataProvider",
              fileName,
              firstLineIsHeader,
              tableName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CsvDataProvider(
      java.lang.String fileName,
      java.lang.Boolean firstLineIsHeader,
      java.lang.String tableName,
      java.lang.Character separator) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.CsvDataProvider",
              fileName,
              firstLineIsHeader,
              tableName,
              separator);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CsvDataProvider(
      java.lang.String fileName,
      java.lang.Boolean firstLineIsHeader,
      java.lang.String tableName,
      java.lang.Character separator,
      java.lang.Integer linesToSkip) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.CsvDataProvider",
              fileName,
              firstLineIsHeader,
              tableName,
              separator,
              linesToSkip);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CsvDataProvider(
      java.lang.String fileName,
      java.lang.Boolean firstLineIsHeader,
      java.lang.String tableName,
      java.lang.Character separator,
      java.lang.Integer linesToSkip,
      java.lang.Boolean supportsCount) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.CsvDataProvider",
              fileName,
              firstLineIsHeader,
              tableName,
              separator,
              linesToSkip,
              supportsCount);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CsvDataProvider(
      Stream stream,
      java.lang.Boolean firstLineIsHeader,
      java.lang.String tableName,
      java.lang.Character separator,
      java.lang.Integer linesToSkip,
      java.lang.Boolean supportsCount) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.CsvDataProvider",
              stream,
              firstLineIsHeader,
              tableName,
              separator,
              linesToSkip,
              supportsCount);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CsvDataProvider(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSupportsAnyBaseTable() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("get_SupportsAnyBaseTable");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ReadOnlyCollection<ITable> getTables() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("get_Tables");
      if (res == null) return null;
      return new ReadOnlyCollection<ITable>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ReadOnlyCollection<ITableRelation> getRelations() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("get_Relations");
      if (res == null) return null;
      return new ReadOnlyCollection<ITableRelation>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ITable GetTable(java.lang.String tableName) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("GetTable", tableName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ITableRelation GetRelation(java.lang.String relationName) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("GetRelation", relationName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
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
