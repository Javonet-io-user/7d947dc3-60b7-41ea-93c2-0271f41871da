package combit.ListLabel24;

public enum LlViewerPrintEvent {
  Start(99L),
  Page(100L),
  End(101L),
  ;
  private long numVal;

  LlViewerPrintEvent(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
