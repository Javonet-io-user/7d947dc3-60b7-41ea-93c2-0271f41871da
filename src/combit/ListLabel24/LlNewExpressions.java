package combit.ListLabel24;

public enum LlNewExpressions {
  Disable(0L),
  Formula(1L),
  Enhanced(2L),
  ;
  private long numVal;

  LlNewExpressions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
