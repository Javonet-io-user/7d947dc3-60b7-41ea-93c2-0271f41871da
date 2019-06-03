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
import combit.ListLabel24.Dom.*;
import combit.ListLabel24.*;

public class DatasourceParameterDomBuilder {
  protected NObject javonetHandle;

  public DatasourceParameterDomBuilder() {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.DatasourceParameterDomBuilder");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DatasourceParameterDomBuilder(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CreateReportParametersForDatasourceParameters(
      IEnumerable<DatasourceParameter> parameters, ProjectBase project) {
    try {
      javonetHandle.invoke("CreateReportParametersForDatasourceParameters", parameters, project);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CreateReportParametersForDatasourceParameters(
      IEnumerable<DatasourceParameter> parameters, ListLabel llJob) {
    try {
      javonetHandle.invoke("CreateReportParametersForDatasourceParameters", parameters, llJob);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
