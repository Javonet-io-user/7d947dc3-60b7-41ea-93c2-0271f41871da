package combit.ListLabel24;

public enum LlDestination {
  Printer(1L),
  Preview(2L),
  File(4L),
  ;
  private long numVal;

  LlDestination(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
