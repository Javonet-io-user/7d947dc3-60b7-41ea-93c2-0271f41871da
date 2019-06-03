package combit.ListLabel24.Dom;

public enum LlDomVerticalSizeAdaptionType {
  None(0L),
  Proportional(4096L),
  Inverse(8192L),
  ;
  private long numVal;

  LlDomVerticalSizeAdaptionType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
