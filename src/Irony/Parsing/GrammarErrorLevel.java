package Irony.Parsing;

public enum GrammarErrorLevel {
  NoError(0L),
  Info(1L),
  Warning(2L),
  Conflict(3L),
  Error(4L),
  InternalError(5L),
  ;
  private long numVal;

  GrammarErrorLevel(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
