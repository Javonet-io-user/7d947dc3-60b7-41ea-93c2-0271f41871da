package combit.ListLabel24.Dom;

public enum LlDomGaugeType {
  Round(0L),
  LinearVertical(1L),
  LinearHorizontal(2L),
  ;
  private long numVal;

  LlDomGaugeType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
