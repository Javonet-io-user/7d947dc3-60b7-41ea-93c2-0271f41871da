package Irony.Parsing;

public enum IdOptions {
  None(0L),
  AllowsEscapes(1L),
  CanStartWithEscape(3L),
  IsNotKeyword(16L),
  NameIncludesPrefix(32L),
  ;
  private long numVal;

  IdOptions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
