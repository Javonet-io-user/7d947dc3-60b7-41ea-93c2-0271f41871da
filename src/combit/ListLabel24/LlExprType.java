package combit.ListLabel24;

public enum LlExprType {
  Double(1L),
  Date(2L),
  String(3L),
  Bool(4L),
  Drawing(5L),
  Barcode(6L),
  ;
  private long numVal;

  LlExprType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
