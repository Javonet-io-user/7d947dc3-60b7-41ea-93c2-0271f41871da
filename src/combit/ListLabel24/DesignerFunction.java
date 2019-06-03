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
import jio.System.ComponentModel.*;
import combit.ListLabel24.*;
import jio.System.*;
import combit.ListLabel24.DesignerExtensions.*;

public class DesignerFunction extends Component
    implements IComponent, IDisposable, IDesignerFunction {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setFunctionName(java.lang.String value) {
    try {
      javonetHandle.set("FunctionName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFunctionName() {
    try {
      java.lang.String res = javonetHandle.get("FunctionName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDescription(java.lang.String value) {
    try {
      javonetHandle.set("Description", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDescription() {
    try {
      java.lang.String res = javonetHandle.get("Description");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setGroupName(java.lang.String value) {
    try {
      javonetHandle.set("GroupName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getGroupName() {
    try {
      java.lang.String res = javonetHandle.get("GroupName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setVisible(java.lang.Boolean value) {
    try {
      javonetHandle.set("Visible", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getVisible() {
    try {
      java.lang.Boolean res = javonetHandle.get("Visible");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIsConstantForConstantData(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsConstantForConstantData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsConstantForConstantData() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsConstantForConstantData");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMinimalParameters(java.lang.Integer value) {
    try {
      javonetHandle.set("MinimalParameters", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMinimalParameters() {
    try {
      java.lang.Integer res = javonetHandle.get("MinimalParameters");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMaximumParameters(java.lang.Integer value) {
    try {
      javonetHandle.set("MaximumParameters", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMaximumParameters() {
    try {
      java.lang.Integer res = javonetHandle.get("MaximumParameters");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setParameter1(DesignerFunctionParameter value) {
    try {
      javonetHandle.set("Parameter1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DesignerFunctionParameter getParameter1() {
    try {
      Object res = javonetHandle.<NObject>get("Parameter1");
      if (res == null) return null;
      return new DesignerFunctionParameter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setParameter2(DesignerFunctionParameter value) {
    try {
      javonetHandle.set("Parameter2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DesignerFunctionParameter getParameter2() {
    try {
      Object res = javonetHandle.<NObject>get("Parameter2");
      if (res == null) return null;
      return new DesignerFunctionParameter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setParameter3(DesignerFunctionParameter value) {
    try {
      javonetHandle.set("Parameter3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DesignerFunctionParameter getParameter3() {
    try {
      Object res = javonetHandle.<NObject>get("Parameter3");
      if (res == null) return null;
      return new DesignerFunctionParameter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setParameter4(DesignerFunctionParameter value) {
    try {
      javonetHandle.set("Parameter4", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DesignerFunctionParameter getParameter4() {
    try {
      Object res = javonetHandle.<NObject>get("Parameter4");
      if (res == null) return null;
      return new DesignerFunctionParameter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setResultType(LlParamType value) {
    try {
      javonetHandle.set("ResultType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlParamType getResultType() {
    try {
      Object res = javonetHandle.<NEnum>get("ResultType");
      if (res == null) return null;
      return LlParamType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DesignerFunction() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DesignerFunction");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "EvaluateFunction",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EvaluateFunctionHandler handler : _EvaluateFunctionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EvaluateFunctionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckFunctionSyntax",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (CheckFunctionSyntaxHandler handler : _CheckFunctionSyntaxListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckFunctionSyntaxEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ParameterAutoComplete",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ParameterAutoCompleteHandler handler : _ParameterAutoCompleteListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ParameterAutoCompleteEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DesignerFunction(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CleanUp() {
    try {
      javonetHandle.invoke("CleanUp");
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
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetLLJob(java.lang.Integer hLLJob, java.lang.Integer pLLBase) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerFunction")
              .invoke("SetLLJob", hLLJob, pLLBase);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetOption(java.lang.Integer nOption, java.lang.Integer nValue) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerFunction")
              .invoke("SetOption", nOption, nValue);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetOption(
      java.lang.Integer nOption, AtomicReference<java.lang.Integer> pnValue) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerFunction")
              .invoke(
                  "GetOption",
                  nOption,
                  new NOut(pnValue, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetName(AtomicReference<java.lang.String> pbsName) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerFunction")
              .invoke(
                  "GetName",
                  new NOut(pbsName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetDescr(AtomicReference<java.lang.String> pbsDescr) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerFunction")
              .invoke(
                  "GetDescr",
                  new NOut(pbsDescr, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetGroups(AtomicReference<java.lang.String> pbsGroups) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerFunction")
              .invoke(
                  "GetGroups",
                  new NOut(pbsGroups, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetGroupDescr(
      java.lang.String bsGroup, AtomicReference<java.lang.String> pbsDescr) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerFunction")
              .invoke(
                  "GetGroupDescr",
                  bsGroup,
                  new NOut(pbsDescr, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetParaCount(
      AtomicReference<java.lang.Integer> pnMinParas,
      AtomicReference<java.lang.Integer> pnMaxParas) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerFunction")
              .invoke(
                  "GetParaCount",
                  new NOut(pnMinParas, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      pnMaxParas, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetParaTypes(
      AtomicReference<java.lang.Integer> pnTypeRes,
      AtomicReference<java.lang.Integer> pnTypeArg1,
      AtomicReference<java.lang.Integer> pnTypeArg2,
      AtomicReference<java.lang.Integer> pnTypeArg3,
      AtomicReference<java.lang.Integer> pnTypeArg4) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerFunction")
              .invoke(
                  "GetParaTypes",
                  new NOut(pnTypeRes, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(pnTypeArg1, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(pnTypeArg2, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(pnTypeArg3, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      pnTypeArg4, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer CheckSyntax(
      AtomicReference<java.lang.String> pbsError,
      AtomicReference<java.lang.Integer> pnTypeRes,
      AtomicReference<java.lang.Integer> pnTypeResLL,
      AtomicReference<java.lang.Integer> pnDecs,
      java.lang.Integer nArgs,
      Object VarArg1,
      Object VarArg2,
      Object VarArg3,
      Object VarArg4) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerFunction")
              .invoke(
                  "CheckSyntax",
                  new NRef(pbsError),
                  new NOut(pnTypeRes, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      pnTypeResLL, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NRef(pnDecs),
                  nArgs,
                  VarArg1,
                  VarArg2,
                  VarArg3,
                  VarArg4);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Execute(
      Object pVarRes,
      AtomicReference<java.lang.Integer> pnTypeRes,
      AtomicReference<java.lang.Integer> pnTypeResLL,
      AtomicReference<java.lang.Integer> pnDecs,
      java.lang.Integer nArgs,
      Object VarArg1,
      Object VarArg2,
      Object VarArg3,
      Object VarArg4) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerFunction")
              .invoke(
                  "Execute",
                  pVarRes,
                  new NOut(pnTypeRes, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      pnTypeResLL, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NRef(pnDecs),
                  nArgs,
                  VarArg1,
                  VarArg2,
                  VarArg3,
                  VarArg4);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetVisibleFlag(AtomicReference<java.lang.Boolean> pbVisible) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerFunction")
              .invoke(
                  "GetVisibleFlag",
                  new NOut(pbVisible, JavonetHelper.JavaToDotnetType.get(java.lang.Boolean.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetParaValueHint(
      java.lang.Integer nPara,
      AtomicReference<java.lang.String> pbsHint,
      AtomicReference<java.lang.String> pbsTabbedList) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerFunction")
              .invoke(
                  "GetParaValueHint",
                  nPara,
                  new NOut(pbsHint, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(
                      pbsTabbedList, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Event */

  private java.util.ArrayList<EvaluateFunctionHandler> _EvaluateFunctionListeners =
      new java.util.ArrayList<EvaluateFunctionHandler>();

  public void addEvaluateFunction(EvaluateFunctionHandler toAdd) {
    _EvaluateFunctionListeners.add(toAdd);
  }

  public void removeEvaluateFunction(EvaluateFunctionHandler toRemove) {
    _EvaluateFunctionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<CheckFunctionSyntaxHandler> _CheckFunctionSyntaxListeners =
      new java.util.ArrayList<CheckFunctionSyntaxHandler>();

  public void addCheckFunctionSyntax(CheckFunctionSyntaxHandler toAdd) {
    _CheckFunctionSyntaxListeners.add(toAdd);
  }

  public void removeCheckFunctionSyntax(CheckFunctionSyntaxHandler toRemove) {
    _CheckFunctionSyntaxListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ParameterAutoCompleteHandler> _ParameterAutoCompleteListeners =
      new java.util.ArrayList<ParameterAutoCompleteHandler>();

  public void addParameterAutoComplete(ParameterAutoCompleteHandler toAdd) {
    _ParameterAutoCompleteListeners.add(toAdd);
  }

  public void removeParameterAutoComplete(ParameterAutoCompleteHandler toRemove) {
    _ParameterAutoCompleteListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
