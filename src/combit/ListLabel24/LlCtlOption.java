package combit.ListLabel24;

public enum LlCtlOption {
  AddToSysMenu(4L),
  AlsoChildren(16L),
  ConverControls(65536L),
  ;
  private long numVal;

  LlCtlOption(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
