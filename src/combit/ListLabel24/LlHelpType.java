package combit.ListLabel24;

public enum LlHelpType {
  ShowContextHelp(1L),
  ShowIndex(3L),
  ShowHelpOnHelp(4L),
  ;
  private long numVal;

  LlHelpType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
