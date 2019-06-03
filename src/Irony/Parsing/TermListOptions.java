package Irony.Parsing;

public enum TermListOptions {
  None(0L),
  AllowEmpty(1L),
  AllowTrailingDelimiter(2L),
  PlusList(4L),
  StarList(5L),
  ;
  private long numVal;

  TermListOptions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
