package jio.System.Drawing.Text;

public enum GenericFontFamilies {
  Serif(0L),
  SansSerif(1L),
  Monospace(2L),
  ;
  private long numVal;

  GenericFontFamilies(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
