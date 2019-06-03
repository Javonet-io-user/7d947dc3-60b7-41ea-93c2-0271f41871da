package Irony.Parsing;

public enum StringOptions {
  None(0L),
  IsChar(1L),
  AllowsDoubledQuote(2L),
  AllowsLineBreak(4L),
  IsTemplate(8L),
  NoEscapes(16L),
  AllowsUEscapes(32L),
  AllowsXEscapes(64L),
  AllowsOctalEscapes(128L),
  AllowsAllEscapes(224L),
  ;
  private long numVal;

  StringOptions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
