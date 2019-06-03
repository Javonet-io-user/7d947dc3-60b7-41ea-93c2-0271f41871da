package combit.ListLabel24;

public enum ReportParameterSourceType {
  Text(0L),
  Numeric(1L),
  Date(2L),
  Boolean(3L),
  ;
  private long numVal;

  ReportParameterSourceType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
