package Irony.Parsing;

public enum PreferredActionType {
  Shift(0L),
  Reduce(1L),
  ;
  private long numVal;

  PreferredActionType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
