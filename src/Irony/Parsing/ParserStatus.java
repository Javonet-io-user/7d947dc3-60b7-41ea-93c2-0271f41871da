package Irony.Parsing;

public enum ParserStatus {
  Init(0L),
  Parsing(1L),
  Previewing(2L),
  Recovering(3L),
  Accepted(4L),
  AcceptedPartial(5L),
  Error(6L),
  ;
  private long numVal;

  ParserStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
