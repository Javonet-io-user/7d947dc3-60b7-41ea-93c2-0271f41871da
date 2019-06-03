package jio.System.Windows.Forms;

public enum DockStyle {
  None(0L),
  Top(1L),
  Bottom(2L),
  Left(3L),
  Right(4L),
  Fill(5L),
  ;
  private long numVal;

  DockStyle(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
