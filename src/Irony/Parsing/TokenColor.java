package Irony.Parsing;

public enum TokenColor {
  Text(0L),
  Keyword(1L),
  Comment(2L),
  Identifier(3L),
  String(4L),
  Number(5L),
  ;
  private long numVal;

  TokenColor(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
