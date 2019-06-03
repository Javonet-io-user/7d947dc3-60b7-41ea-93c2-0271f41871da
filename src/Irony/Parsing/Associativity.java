package Irony.Parsing;

public enum Associativity {
  Left(0L),
  Right(1L),
  Neutral(2L),
  ;
  private long numVal;

  Associativity(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
