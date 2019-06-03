package combit.ListLabel24;

public enum LlOpenMode {
  Read(0L),
  ReadWrite(1L),
  ;
  private long numVal;

  LlOpenMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
