package combit.ListLabel24;

public enum LlTableColoring {
  ListLabel(0L),
  Program(1L),
  DontCare(2L),
  ;
  private long numVal;

  LlTableColoring(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
