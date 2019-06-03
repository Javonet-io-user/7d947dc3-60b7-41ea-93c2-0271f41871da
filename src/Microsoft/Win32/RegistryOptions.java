package Microsoft.Win32;

public enum RegistryOptions {
  None(0L),
  Volatile(1L),
  ;
  private long numVal;

  RegistryOptions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
