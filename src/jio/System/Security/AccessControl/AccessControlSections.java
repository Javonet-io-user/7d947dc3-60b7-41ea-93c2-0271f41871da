package jio.System.Security.AccessControl;

public enum AccessControlSections {
  None(0L),
  Audit(1L),
  Access(2L),
  Owner(4L),
  Group(8L),
  All(15L),
  ;
  private long numVal;

  AccessControlSections(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
