package jio.System.Data.OleDb;

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
import jio.System.Data.Common.*;
import jio.System.Data.OleDb.*;
import jio.System.*;
import jio.System.Data.*;

public class OleDbParameter extends DbParameter
    implements IDbDataParameter, IDataParameter, ICloneable {
  protected NObject javonetHandle;

  public OleDbParameter() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.OleDb.OleDbParameter");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbParameter(java.lang.String name, Object value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.OleDb.OleDbParameter", name, value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbParameter(java.lang.String name, OleDbType dataType) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Data.OleDb.OleDbParameter", name, NEnum.fromJavaEnum(dataType));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbParameter(java.lang.String name, OleDbType dataType, java.lang.Integer size) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Data.OleDb.OleDbParameter", name, NEnum.fromJavaEnum(dataType), size);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbParameter(
      java.lang.String name,
      OleDbType dataType,
      java.lang.Integer size,
      java.lang.String srcColumn) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.OleDb.OleDbParameter",
              name,
              NEnum.fromJavaEnum(dataType),
              size,
              srcColumn);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbParameter(
      java.lang.String parameterName,
      OleDbType dbType,
      java.lang.Integer size,
      ParameterDirection direction,
      java.lang.Boolean isNullable,
      java.lang.Byte precision,
      java.lang.Byte scale,
      java.lang.String srcColumn,
      DataRowVersion srcVersion,
      Object value) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.OleDb.OleDbParameter",
              parameterName,
              NEnum.fromJavaEnum(dbType),
              size,
              NEnum.fromJavaEnum(direction),
              isNullable,
              precision,
              scale,
              srcColumn,
              NEnum.fromJavaEnum(srcVersion),
              value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbParameter(
      java.lang.String parameterName,
      OleDbType dbType,
      java.lang.Integer size,
      ParameterDirection direction,
      java.lang.Byte precision,
      java.lang.Byte scale,
      java.lang.String sourceColumn,
      DataRowVersion sourceVersion,
      java.lang.Boolean sourceColumnNullMapping,
      Object value) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.OleDb.OleDbParameter",
              parameterName,
              NEnum.fromJavaEnum(dbType),
              size,
              NEnum.fromJavaEnum(direction),
              precision,
              scale,
              sourceColumn,
              NEnum.fromJavaEnum(sourceVersion),
              sourceColumnNullMapping,
              value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbParameter(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object ICloneable_Clone() {
    try {
      Object res = javonetHandle.explicitInterface("jio.System.ICloneable").invoke("Clone");
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
