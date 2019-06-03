package combit.ListLabel24;

public enum LlActionState {
  Enabled(1L),
  Disabled(2L),
  ;
  private long numVal;

  LlActionState(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
