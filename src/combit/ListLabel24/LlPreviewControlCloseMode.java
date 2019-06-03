package combit.ListLabel24;

public enum LlPreviewControlCloseMode {
  DeleteFile(0L),
  KeepFile(1L),
  ;
  private long numVal;

  LlPreviewControlCloseMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
