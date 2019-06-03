package combit.ListLabel24;

public enum LlDlgExprVarbtn {
  Enable(1L),
  DoModal(2L),
  ;
  private long numVal;

  LlDlgExprVarbtn(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
