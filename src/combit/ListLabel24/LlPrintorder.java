package combit.ListLabel24;

public enum LlPrintorder {
  Horizontal_LTRB(0L),
  Vertical_LTRB(1L),
  Horizontal_RBLT(2L),
  Vertical_RBLT(3L),
  ;
  private long numVal;

  LlPrintorder(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
