package combit.ListLabel24;

public enum LlZoomPredefined {
  CompletePage(100L),
  PageWidth(-100L),
  ;
  private long numVal;

  LlZoomPredefined(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
