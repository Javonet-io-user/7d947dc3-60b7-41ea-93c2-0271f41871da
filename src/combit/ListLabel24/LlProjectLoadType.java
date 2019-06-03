package combit.ListLabel24;

public enum LlProjectLoadType {
  DesignOrDOM(0L),
  Import(1L),
  ImportTemplate(2L),
  ;
  private long numVal;

  LlProjectLoadType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
