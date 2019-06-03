package combit.ListLabel24;

public enum LlTabStop {
  Delete(0L),
  Expand(1L),
  ;
  private long numVal;

  LlTabStop(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
