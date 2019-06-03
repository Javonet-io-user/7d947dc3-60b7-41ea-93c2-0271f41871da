package combit.ListLabel24;

public enum LlMetric {
  Inch_1_100(0L),
  Millimeter_1_10(1L),
  ;
  private long numVal;

  LlMetric(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
