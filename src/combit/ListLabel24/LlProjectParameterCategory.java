package combit.ListLabel24;

public enum LlProjectParameterCategory {
  User(0L),
  Fax(1L),
  Mail(2L),
  Internal(4L),
  ;
  private long numVal;

  LlProjectParameterCategory(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
