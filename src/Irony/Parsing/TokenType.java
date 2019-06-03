package Irony.Parsing;

public enum TokenType {
  Unknown(0L),
  Text(1L),
  Keyword(2L),
  Identifier(3L),
  String(4L),
  Literal(5L),
  Operator(6L),
  Delimiter(7L),
  WhiteSpace(8L),
  LineComment(9L),
  Comment(10L),
  ;
  private long numVal;

  TokenType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
