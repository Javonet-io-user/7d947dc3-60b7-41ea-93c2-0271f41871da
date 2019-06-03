package combit.ListLabel24;

public enum LlProjectParameterScope {
  Global(0L),
  Local(268435456L),
  ;
  private long numVal;

  LlProjectParameterScope(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
