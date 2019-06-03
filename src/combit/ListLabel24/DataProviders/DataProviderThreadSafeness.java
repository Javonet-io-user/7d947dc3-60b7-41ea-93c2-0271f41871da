package combit.ListLabel24.DataProviders;

public enum DataProviderThreadSafeness {
  None(0L),
  OneInstancePerThread(1L),
  Full(2L),
  ;
  private long numVal;

  DataProviderThreadSafeness(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
