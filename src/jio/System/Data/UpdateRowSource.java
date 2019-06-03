package jio.System.Data;

public enum UpdateRowSource {
  None(0L),
  OutputParameters(1L),
  FirstReturnedRecord(2L),
  Both(3L),
  ;
  private long numVal;

  UpdateRowSource(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
