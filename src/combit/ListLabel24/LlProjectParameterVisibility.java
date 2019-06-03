package combit.ListLabel24;

public enum LlProjectParameterVisibility {
  Public(0L),
  Private(1073741824L),
  ;
  private long numVal;

  LlProjectParameterVisibility(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
