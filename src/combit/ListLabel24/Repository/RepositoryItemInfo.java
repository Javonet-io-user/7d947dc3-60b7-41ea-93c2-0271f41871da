package combit.ListLabel24.Repository;

public enum RepositoryItemInfo {
  Timestamp(1L),
  ReadOnly(2L),
  BLOBData(3L),
  ThreadedAccess(4L),
  ;
  private long numVal;

  RepositoryItemInfo(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
