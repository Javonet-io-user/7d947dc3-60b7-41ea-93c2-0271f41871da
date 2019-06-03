package combit.ListLabel24.Dom;

public enum ReportParameterValueType {
  Double(1L),
  Date(2L),
  String(4L),
  Bool(8L),
  Drawing(10L),
  Barcode(20L),
  ;
  private long numVal;

  ReportParameterValueType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
