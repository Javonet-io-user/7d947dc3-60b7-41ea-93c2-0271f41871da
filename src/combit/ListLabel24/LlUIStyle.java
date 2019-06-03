package combit.ListLabel24;

public enum LlUIStyle {
  Standard(0L),
  OfficeXP(1L),
  Office2003(2L),
  ;
  private long numVal;

  LlUIStyle(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
