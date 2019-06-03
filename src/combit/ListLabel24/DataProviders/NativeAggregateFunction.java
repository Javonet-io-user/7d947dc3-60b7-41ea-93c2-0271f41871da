package combit.ListLabel24.DataProviders;

public enum NativeAggregateFunction {
  Avg(0L),
  Count(1L),
  Max(2L),
  Min(3L),
  Sum(4L),
  StdDevSamp(5L),
  StdDevPop(6L),
  VarSamp(7L),
  VarPop(8L),
  ;
  private long numVal;

  NativeAggregateFunction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
