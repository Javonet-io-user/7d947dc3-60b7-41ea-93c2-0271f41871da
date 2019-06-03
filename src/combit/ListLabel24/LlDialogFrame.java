package combit.ListLabel24;

public enum LlDialogFrame {
  Standard(0L),
  Alt_1(4096L),
  Alt_2(16384L),
  ;
  private long numVal;

  LlDialogFrame(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
