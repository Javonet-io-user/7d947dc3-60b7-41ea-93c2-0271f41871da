package combit.ListLabel24;

public enum LlVersion {
  Major(1L),
  Minor(2L),
  SerialNumber_LO(3L),
  SerialNumber_HI(4L),
  OEM_Number(5L),
  ;
  private long numVal;

  LlVersion(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
