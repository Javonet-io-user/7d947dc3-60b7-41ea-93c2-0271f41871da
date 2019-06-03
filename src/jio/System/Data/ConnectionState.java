package jio.System.Data;

public enum ConnectionState {
  Closed(0L),
  Open(1L),
  Connecting(2L),
  Executing(4L),
  Fetching(8L),
  Broken(16L),
  ;
  private long numVal;

  ConnectionState(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
