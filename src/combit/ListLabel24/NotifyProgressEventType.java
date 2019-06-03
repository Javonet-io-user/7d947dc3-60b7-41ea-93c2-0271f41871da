package combit.ListLabel24;

public enum NotifyProgressEventType {
  DataInitialization(0L),
  PrintProgress(1L),
  ;
  private long numVal;

  NotifyProgressEventType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
