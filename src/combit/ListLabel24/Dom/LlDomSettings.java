package combit.ListLabel24.Dom;

public enum LlDomSettings {
  NoPrinterInitialization(67108864L),
  IgnoreErrors(134217728L),
  ;
  private long numVal;

  LlDomSettings(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
