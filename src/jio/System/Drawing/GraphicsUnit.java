package jio.System.Drawing;

public enum GraphicsUnit {
  World(0L),
  Display(1L),
  Pixel(2L),
  Point(3L),
  Inch(4L),
  Document(5L),
  Millimeter(6L),
  ;
  private long numVal;

  GraphicsUnit(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
