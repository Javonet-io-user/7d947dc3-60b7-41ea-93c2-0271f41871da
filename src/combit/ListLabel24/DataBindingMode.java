package combit.ListLabel24;

public enum DataBindingMode {
  EventBased(0L),
  Compatible(1L),
  Preload(2L),
  DelayLoad(3L),
  ;
  private long numVal;

  DataBindingMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
