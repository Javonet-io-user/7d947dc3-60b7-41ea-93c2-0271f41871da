package combit.ListLabel24;

public enum LlRTFContentMode {
  Raw(0L),
  Evaluated(1L),
  ;
  private long numVal;

  LlRTFContentMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
