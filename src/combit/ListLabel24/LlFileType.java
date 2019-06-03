package combit.ListLabel24;

public enum LlFileType {
  Sketch(0L),
  Project(1L),
  PrinterSettings(2L),
  ;
  private long numVal;

  LlFileType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
