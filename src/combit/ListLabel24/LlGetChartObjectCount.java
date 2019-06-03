package combit.ListLabel24;

public enum LlGetChartObjectCount {
  ChartObjects(1L),
  ChartObjectsBeforeTable(2L),
  ChartObjectsChartColumns(3L),
  ;
  private long numVal;

  LlGetChartObjectCount(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
