package Microsoft.Win32;

public enum RegistryView {
  Default(0L),
  Registry64(256L),
  Registry32(512L),
  ;
  private long numVal;

  RegistryView(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
