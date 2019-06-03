package combit.ListLabel24.DataProviders;

public enum SchemaRowUsageMode {
  None(0L),
  Design(1L),
  Print(2L),
  ;
  private long numVal;

  SchemaRowUsageMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
