package combit.ListLabel24;

public enum LlDebug {
  Disabled(0L),
  Enabled(1L),
  DWG(2L),
  NoCallbacks(4L),
  NoStorage(8L),
  NoSysInfo(32L),
  LogToFile(64L),
  PrinterInfo(256L),
  LicInfo(512L),
  ;
  private long numVal;

  LlDebug(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
