package combit.ListLabel24;

public enum LlDeclareChartRow {
  ForObjects(1L),
  ForTablefields(2L),
  ;
  private long numVal;

  LlDeclareChartRow(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
