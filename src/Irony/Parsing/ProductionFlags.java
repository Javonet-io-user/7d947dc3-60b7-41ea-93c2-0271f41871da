package Irony.Parsing;

public enum ProductionFlags {
  None(0L),
  HasTerminals(2L),
  IsError(4L),
  IsEmpty(8L),
  ;
  private long numVal;

  ProductionFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
