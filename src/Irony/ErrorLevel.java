package Irony;

public enum ErrorLevel {
  Info(0L),
  Warning(1L),
  Error(2L),
  ;
  private long numVal;

  ErrorLevel(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
