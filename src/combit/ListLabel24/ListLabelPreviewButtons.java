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

public class ListLabelPreviewButtons {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setSearchOptions(LlButtonState value) {
    try {
      javonetHandle.set("SearchOptions", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getSearchOptions() {
    try {
      Object res = javonetHandle.<NEnum>get("SearchOptions");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPrintToFax(LlButtonState value) {
    try {
      javonetHandle.set("PrintToFax", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getPrintToFax() {
    try {
      Object res = javonetHandle.<NEnum>get("PrintToFax");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPrintAllPages(LlButtonState value) {
    try {
      javonetHandle.set("PrintAllPages", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getPrintAllPages() {
    try {
      Object res = javonetHandle.<NEnum>get("PrintAllPages");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setGotoFirst(LlButtonState value) {
    try {
      javonetHandle.set("GotoFirst", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getGotoFirst() {
    try {
      Object res = javonetHandle.<NEnum>get("GotoFirst");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSendTo(LlButtonState value) {
    try {
      javonetHandle.set("SendTo", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getSendTo() {
    try {
      Object res = javonetHandle.<NEnum>get("SendTo");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPrintCurrentPage(LlButtonState value) {
    try {
      javonetHandle.set("PrintCurrentPage", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getPrintCurrentPage() {
    try {
      Object res = javonetHandle.<NEnum>get("PrintCurrentPage");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setGotoPrev(LlButtonState value) {
    try {
      javonetHandle.set("GotoPrev", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getGotoPrev() {
    try {
      Object res = javonetHandle.<NEnum>get("GotoPrev");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setGotoLast(LlButtonState value) {
    try {
      javonetHandle.set("GotoLast", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getGotoLast() {
    try {
      Object res = javonetHandle.<NEnum>get("GotoLast");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExit(LlButtonState value) {
    try {
      javonetHandle.set("Exit", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getExit() {
    try {
      Object res = javonetHandle.<NEnum>get("Exit");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSaveAs(LlButtonState value) {
    try {
      javonetHandle.set("SaveAs", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getSaveAs() {
    try {
      Object res = javonetHandle.<NEnum>get("SaveAs");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setGotoNext(LlButtonState value) {
    try {
      javonetHandle.set("GotoNext", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getGotoNext() {
    try {
      Object res = javonetHandle.<NEnum>get("GotoNext");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSearchNext(LlButtonState value) {
    try {
      javonetHandle.set("SearchNext", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getSearchNext() {
    try {
      Object res = javonetHandle.<NEnum>get("SearchNext");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setZoomTimes2(LlButtonState value) {
    try {
      javonetHandle.set("ZoomTimes2", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getZoomTimes2() {
    try {
      Object res = javonetHandle.<NEnum>get("ZoomTimes2");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setZoomRevert(LlButtonState value) {
    try {
      javonetHandle.set("ZoomRevert", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getZoomRevert() {
    try {
      Object res = javonetHandle.<NEnum>get("ZoomRevert");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSearchStart(LlButtonState value) {
    try {
      javonetHandle.set("SearchStart", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getSearchStart() {
    try {
      Object res = javonetHandle.<NEnum>get("SearchStart");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setZoomReset(LlButtonState value) {
    try {
      javonetHandle.set("ZoomReset", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getZoomReset() {
    try {
      Object res = javonetHandle.<NEnum>get("ZoomReset");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSearchText(LlButtonState value) {
    try {
      javonetHandle.set("SearchText", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getSearchText() {
    try {
      Object res = javonetHandle.<NEnum>get("SearchText");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPageRange(LlButtonState value) {
    try {
      javonetHandle.set("PageRange", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getPageRange() {
    try {
      Object res = javonetHandle.<NEnum>get("PageRange");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setZoomCombo(LlButtonState value) {
    try {
      javonetHandle.set("ZoomCombo", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getZoomCombo() {
    try {
      Object res = javonetHandle.<NEnum>get("ZoomCombo");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSlideshowMode(LlButtonState value) {
    try {
      javonetHandle.set("SlideshowMode", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getSlideshowMode() {
    try {
      Object res = javonetHandle.<NEnum>get("SlideshowMode");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPreviousFile(LlButtonState value) {
    try {
      javonetHandle.set("PreviousFile", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getPreviousFile() {
    try {
      Object res = javonetHandle.<NEnum>get("PreviousFile");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNextFile(LlButtonState value) {
    try {
      javonetHandle.set("NextFile", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getNextFile() {
    try {
      Object res = javonetHandle.<NEnum>get("NextFile");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMouseModeMove(LlButtonState value) {
    try {
      javonetHandle.set("MouseModeMove", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getMouseModeMove() {
    try {
      Object res = javonetHandle.<NEnum>get("MouseModeMove");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMouseModeZoom(LlButtonState value) {
    try {
      javonetHandle.set("MouseModeZoom", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LlButtonState getMouseModeZoom() {
    try {
      Object res = javonetHandle.<NEnum>get("MouseModeZoom");
      if (res == null) return null;
      return LlButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ListLabelPreviewButtons(ListLabelPreviewControl parent) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ListLabelPreviewButtons", parent);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabelPreviewButtons(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
