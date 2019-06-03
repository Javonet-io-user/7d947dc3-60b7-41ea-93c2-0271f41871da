package Irony.Parsing;

public enum ParseTreeStatus {
  Parsing(0L),
  Partial(1L),
  Parsed(2L),
  Error(3L),
  ;
  private long numVal;

  ParseTreeStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
