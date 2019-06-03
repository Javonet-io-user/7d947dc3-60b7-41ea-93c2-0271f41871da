package combit.ListLabel24;

public enum LlParamType {
  Double(1L),
  Date(2L),
  String(4L),
  Bool(8L),
  Drawing(16L),
  Barcode(32L),
  All(63L),
  ;
  private long numVal;

  LlParamType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
