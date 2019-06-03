package jio.System.Data;

public enum DataViewRowState {
  None(0L),
  Unchanged(2L),
  Added(4L),
  Deleted(8L),
  ModifiedCurrent(16L),
  CurrentRows(22L),
  ModifiedOriginal(32L),
  OriginalRows(42L),
  ;
  private long numVal;

  DataViewRowState(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
