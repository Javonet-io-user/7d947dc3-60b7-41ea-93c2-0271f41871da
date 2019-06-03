package combit.ListLabel24.DataProviders;

public enum AutoResolveNamespacesMode {
  None(0L),
  SearchInFirstElement(1L),
  SearchEverywhere(2L),
  ;
  private long numVal;

  AutoResolveNamespacesMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
