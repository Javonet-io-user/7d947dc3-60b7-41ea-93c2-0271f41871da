package combit.ListLabel24.Dom;

public enum LlDomVerticalLinkType {
  None(0L),
  RelativeToStart(16L),
  RelativeToEnd(32L),
  AtEnd(48L),
  AtEndKeepSize(16384L),
  ;
  private long numVal;

  LlDomVerticalLinkType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
