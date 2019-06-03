package Microsoft.Win32;

public enum RegistryValueKind {
  Unknown(0L),
  String(1L),
  ExpandString(2L),
  Binary(3L),
  DWord(4L),
  MultiString(7L),
  QWord(11L),
  None(-1L),
  ;
  private long numVal;

  RegistryValueKind(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
