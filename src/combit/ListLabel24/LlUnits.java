package combit.ListLabel24;

public enum LlUnits {
  Millimeter_1_10(0L),
  Inch_1_100(1L),
  Inch_1_1000(2L),
  SysDefault(3L),
  SysDefaultLoRes(4L),
  Millimeter_1_100(5L),
  Millimeter_1_1000(6L),
  SysDefaultHiRes(7L),
  ;
  private long numVal;

  LlUnits(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
