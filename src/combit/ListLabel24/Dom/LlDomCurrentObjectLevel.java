package combit.ListLabel24.Dom;

public enum LlDomCurrentObjectLevel {
  Object(0L),
  ContainerItem(1L),
  ;
  private long numVal;

  LlDomCurrentObjectLevel(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
