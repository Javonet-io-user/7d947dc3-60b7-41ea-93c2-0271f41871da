package combit.ListLabel24.Dom;

public enum LlDomHorizontalLinkType {
  None(0L),
  RelativeToStart(1L),
  RelativeToEnd(2L),
  AtEnd(3L),
  AtEndKeepSize(16384L),
  ;
  private long numVal;

  LlDomHorizontalLinkType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
