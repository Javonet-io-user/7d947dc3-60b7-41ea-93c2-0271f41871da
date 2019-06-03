package combit.ListLabel24;

public enum LogLevels {
  Debug(1L),
  Info(2L),
  Warning(3L),
  Error(4L),
  ;
  private long numVal;

  LogLevels(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
