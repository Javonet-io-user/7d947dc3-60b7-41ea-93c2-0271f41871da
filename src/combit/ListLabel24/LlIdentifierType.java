package combit.ListLabel24;

public enum LlIdentifierType {
  Variables(1L),
  Fields(2L),
  ChartFields(4L),
  Tables(8L),
  Relations(16L),
  Files(32L),
  ;
  private long numVal;

  LlIdentifierType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
