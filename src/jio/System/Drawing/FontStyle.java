package jio.System.Drawing;

public enum FontStyle {
  Regular(0L),
  Bold(1L),
  Italic(2L),
  Underline(4L),
  Strikeout(8L),
  ;
  private long numVal;

  FontStyle(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
