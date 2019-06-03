package combit.ListLabel24;

public enum ReportParametersCollectedReturnType {
  Continue(0L),
  CheckConsistency(-998L),
  Aborted(-99L),
  ;
  private long numVal;

  ReportParametersCollectedReturnType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
