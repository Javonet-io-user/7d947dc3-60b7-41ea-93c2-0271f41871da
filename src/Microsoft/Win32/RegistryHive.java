package Microsoft.Win32;

public enum RegistryHive {
  ClassesRoot(-2147483648L),
  CurrentUser(-2147483647L),
  LocalMachine(-2147483646L),
  Users(-2147483645L),
  PerformanceData(-2147483644L),
  CurrentConfig(-2147483643L),
  DynData(-2147483642L),
  ;
  private long numVal;

  RegistryHive(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
