package combit.ListLabel24;

public enum LlDrilldownJob {
  Start(1L),
  Finalize(2L),
  PrintJob_Finalize(3L),
  ;
  private long numVal;

  LlDrilldownJob(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
