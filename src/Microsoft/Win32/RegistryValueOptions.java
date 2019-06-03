package Microsoft.Win32;

public enum RegistryValueOptions {
  None(0L),
  DoNotExpandEnvironmentNames(1L),
  ;
  private long numVal;

  RegistryValueOptions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
