package Irony.Parsing;

public enum FreeTextOptions {
  None(0L),
  ConsumeTerminator(1L),
  IncludeTerminator(2L),
  AllowEof(4L),
  AllowEmpty(8L),
  ;
  private long numVal;

  FreeTextOptions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
