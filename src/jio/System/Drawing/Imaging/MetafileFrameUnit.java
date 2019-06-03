package jio.System.Drawing.Imaging;

public enum MetafileFrameUnit {
  Pixel(2L),
  Point(3L),
  Inch(4L),
  Document(5L),
  Millimeter(6L),
  GdiCompatible(7L),
  ;
  private long numVal;

  MetafileFrameUnit(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
