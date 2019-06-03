package Irony.Parsing;

public enum TermReportGroupType {
  Normal(0L),
  DoNotReport(1L),
  Operator(2L),
  ;
  private long numVal;

  TermReportGroupType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
