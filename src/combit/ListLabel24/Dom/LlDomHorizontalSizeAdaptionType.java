package combit.ListLabel24.Dom;

public enum LlDomHorizontalSizeAdaptionType {
  None(0L),
  Proportional(256L),
  Inverse(512L),
  ;
  private long numVal;

  LlDomHorizontalSizeAdaptionType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
