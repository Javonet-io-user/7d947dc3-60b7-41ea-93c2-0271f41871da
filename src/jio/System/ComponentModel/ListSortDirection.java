package jio.System.ComponentModel;

public enum ListSortDirection {
  Ascending(0L),
  Descending(1L),
  ;
  private long numVal;

  ListSortDirection(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
