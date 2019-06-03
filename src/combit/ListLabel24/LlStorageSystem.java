package combit.ListLabel24;

public enum LlStorageSystem {
  MultipleFiles(0L),
  SingleFile(1L),
  ;
  private long numVal;

  LlStorageSystem(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
