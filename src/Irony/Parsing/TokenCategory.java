package Irony.Parsing;

public enum TokenCategory {
  Content(0L),
  Outline(1L),
  Comment(2L),
  Directive(3L),
  Error(4L),
  ;
  private long numVal;

  TokenCategory(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
