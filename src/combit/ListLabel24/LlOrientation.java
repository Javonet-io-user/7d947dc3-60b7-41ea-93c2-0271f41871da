package combit.ListLabel24;

public enum LlOrientation {
  Portrait(1L),
  Landscape(2L),
  ;
  private long numVal;

  LlOrientation(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
