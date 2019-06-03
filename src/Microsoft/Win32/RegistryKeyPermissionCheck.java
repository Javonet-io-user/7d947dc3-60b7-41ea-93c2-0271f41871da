package Microsoft.Win32;

public enum RegistryKeyPermissionCheck {
  Default(0L),
  ReadSubTree(1L),
  ReadWriteSubTree(2L),
  ;
  private long numVal;

  RegistryKeyPermissionCheck(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
