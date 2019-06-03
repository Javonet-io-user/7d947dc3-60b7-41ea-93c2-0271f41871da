package jio.System.Drawing.Imaging;

public enum EmfType {
  EmfOnly(3L),
  EmfPlusOnly(4L),
  EmfPlusDual(5L),
  ;
  private long numVal;

  EmfType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
