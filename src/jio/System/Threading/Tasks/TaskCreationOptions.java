package jio.System.Threading.Tasks;

public enum TaskCreationOptions {
  None(0L),
  PreferFairness(1L),
  LongRunning(2L),
  AttachedToParent(4L),
  DenyChildAttach(8L),
  HideScheduler(16L),
  RunContinuationsAsynchronously(64L),
  ;
  private long numVal;

  TaskCreationOptions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
