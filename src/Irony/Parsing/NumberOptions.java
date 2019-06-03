package Irony.Parsing;

public enum NumberOptions {
  None(0L),
  AllowStartEndDot(1L),
  IntOnly(2L),
  NoDotAfterInt(4L),
  AllowSign(8L),
  DisableQuickParse(16L),
  AllowLetterAfter(32L),
  AllowUnderscore(64L),
  Binary(256L),
  Octal(512L),
  Hex(1024L),
  ;
  private long numVal;

  NumberOptions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
