package combit.ListLabel24;

public enum LlViewerButtonState {
  Enabled(1L),
  Disabled(2L),
  Hidden(-1L),
  ;
  private long numVal;

  LlViewerButtonState(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
