package combit.ListLabel24.DataProviders;

public enum TableOption {
  SchemaRowUsage(2L),
  FilterIsTemporary(4L),
  QueryIsDistinct(5L),
  SupportedAs1to1Relation(6L),
  MaximumRecordCount(7L),
  IsForInfoQuery(8L),
  ;
  private long numVal;

  TableOption(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
