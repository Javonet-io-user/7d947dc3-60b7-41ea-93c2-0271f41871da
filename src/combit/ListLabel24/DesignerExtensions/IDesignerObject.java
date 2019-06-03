package combit.ListLabel24.DesignerExtensions;

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
import combit.ListLabel24.DesignerExtensions.*;
import jio.System.*;
import combit.ListLabel24.*;

public interface IDesignerObject {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetLLJob(java.lang.Integer hLLJob, java.lang.Integer pLLBase);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetName(AtomicReference<java.lang.String> pbsName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetDescr(AtomicReference<java.lang.String> pbsDescr);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetIcon(IntPtr phIcon);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer IsProjectSupported(
      java.lang.Integer nProjType, AtomicReference<java.lang.Boolean> pbSupported);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetOption(java.lang.Integer nOption, java.lang.Integer nValue);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetOption(java.lang.Integer nOption, IntPtr pnValue);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetOptionString(java.lang.String sOption, java.lang.String sText);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetOptionString(
      java.lang.String sOption, AtomicReference<java.lang.String> psText);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetParameters(Object pUnk);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetParameters(Object pUnk);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Clone(Object ppNewObj);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer FirstCreation(IntPtr hWndParent);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetMinDimensionsSCM(
      java.lang.Boolean bForNew, AtomicReference<java.lang.Integer> ptMinSize);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Show(
      IntPtr hDC,
      RECT prcPaint,
      IntPtr hExportProfJob,
      IntPtr hExportProfList,
      java.lang.Integer nExportVerbosity,
      java.lang.Integer nDestination,
      java.lang.Boolean bSelected);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetTrueRect(RECT prc);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetErrorcode();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer AllowPageBreak();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ResetPrintState();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ForceResetPrintState();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer PrintWaiting();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer PrintUnfinished();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer PrintFinished();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer PrintPastFinished();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetNtfySink(Object pNtfySink);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Edit(IntPtr hWnd, PointInt ptMouse);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ClearEditPartInfo();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer CanEditPart(PointInt ptMouse, IntPtr phMenu);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer EditPart(IntPtr hWnd, PointInt ptMouse, java.lang.Integer nMenuID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer CancelEditPart();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer OnDragDrop(
      IntPtr pDataObj,
      java.lang.Integer grfKeyState,
      PointInt p,
      IntPtr pdwEffect,
      java.lang.Boolean bQuery);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer IsSetFontSupported(AtomicReference<java.lang.Boolean> pbSupported);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetFont(IntPtr pLF, java.lang.Integer nSize, IntPtr rgbColor);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer OnObject(IntPtr hDC, PointInt ptMouse);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer InObject(IntPtr hDC, PointInt ptMouse);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer CalcDistanceToFrame(
      IntPtr hDC, PointInt ptMouse, AtomicReference<java.lang.Integer> pnDistance);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer OnMouseMove(IntPtr hDC, PointInt ptMouse, IntPtr phCrs);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer OnMouseLButton(IntPtr hDC, PointInt ptMouse, IntPtr hWnd);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer OnDeclareChartRow(java.lang.String sActiveTable);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer CanCreateObjectFromType(
      java.lang.Integer nLLType, java.lang.String sVarName, RECT prcCreate);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetVarSizeInfo(
      IntPtr hDC,
      IntPtr prcSpaceAvailable,
      AtomicReference<java.lang.Integer> pnMinHeight,
      AtomicReference<java.lang.Integer> pnIdealHeight);
}
