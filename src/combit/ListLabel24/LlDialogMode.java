package combit.ListLabel24;

public enum LlDialogMode {
  DontCare(0L),
  SAA(1L),
  combit_1(2L),
  combit_2(3L),
  combit_3(4L),
  combit_4(5L),
  combit_5(6L),
  combit_6(7L),
  CTL3D(8L),
  Win95(9L),
  Win98(10L),
  Win98_Gray(11L),
  OfficeXP(12L),
  Office2003(13L),
  ;
  private long numVal;

  LlDialogMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
