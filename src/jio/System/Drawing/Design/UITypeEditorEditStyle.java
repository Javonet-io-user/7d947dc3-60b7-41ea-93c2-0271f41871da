package jio.System.Drawing.Design;

public enum UITypeEditorEditStyle {
  None(1L),
  Modal(2L),
  DropDown(3L),
  ;
  private long numVal;

  UITypeEditorEditStyle(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
