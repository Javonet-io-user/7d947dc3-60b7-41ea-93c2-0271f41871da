package combit.ListLabel24;

public enum LlRTFTextMode {
  RTF(0L),
  Plain(1L),
  ;
  private long numVal;

  LlRTFTextMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
