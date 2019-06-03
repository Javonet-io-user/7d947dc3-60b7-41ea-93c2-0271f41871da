package combit.ListLabel24;

public enum LlBarcodeTextmode {
  DontCare(0L),
  WithText(256L),
  WithoutText(512L),
  ;
  private long numVal;

  LlBarcodeTextmode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
