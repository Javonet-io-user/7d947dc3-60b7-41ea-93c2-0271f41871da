package combit.ListLabel24;

public enum LlProjectParameterType {
  Formula(0L),
  Value(536870912L),
  ;
  private long numVal;

  LlProjectParameterType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
