package combit.ListLabel24;

public enum LlRTFPrintState {
  Pending(0L),
  Finished(1L),
  ;
  private long numVal;

  LlRTFPrintState(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
