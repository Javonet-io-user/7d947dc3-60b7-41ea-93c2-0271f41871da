package jio.System.Windows.Forms;

public enum DragDropEffects {
  None(0L),
  Copy(1L),
  Move(2L),
  Link(4L),
  Scroll(-2147483648L),
  All(-2147483645L),
  ;
  private long numVal;

  DragDropEffects(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
