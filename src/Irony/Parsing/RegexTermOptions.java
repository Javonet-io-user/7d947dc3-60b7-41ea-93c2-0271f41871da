package Irony.Parsing;

public enum RegexTermOptions {
  None(0L),
  AllowLetterAfter(1L),
  CreateRegExObject(2L),
  UniqueSwitches(4L),
  Default(6L),
  ;
  private long numVal;

  RegexTermOptions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
