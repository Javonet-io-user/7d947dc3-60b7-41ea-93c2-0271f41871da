package Irony.Parsing;

public enum CaseRestriction {
  None(0L),
  FirstUpper(1L),
  FirstLower(2L),
  AllUpper(3L),
  AllLower(4L),
  ;
  private long numVal;

  CaseRestriction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
