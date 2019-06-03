package combit.ListLabel24;

public enum LlHyperlinkAction {
  QueryTooltip(0L),
  RightButtonAllowed(1L),
  LeftClicked(2L),
  RightClicked(3L),
  ;
  private long numVal;

  LlHyperlinkAction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
