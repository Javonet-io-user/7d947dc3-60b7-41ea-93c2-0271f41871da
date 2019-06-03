package combit.ListLabel24;

public enum LlMeterJob {
  Load(1L),
  Save(2L),
  ConsistencyCheck(3L),
  ;
  private long numVal;

  LlMeterJob(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
