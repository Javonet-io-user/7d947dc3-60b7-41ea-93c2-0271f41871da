package Irony.Parsing;

public enum TokenFlags {
  IsIncomplete(1L),
  ;
  private long numVal;

  TokenFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
