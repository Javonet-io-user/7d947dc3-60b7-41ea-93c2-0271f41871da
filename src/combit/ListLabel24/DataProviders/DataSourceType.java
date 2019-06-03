package combit.ListLabel24.DataProviders;

public enum DataSourceType {
  OleDb(0L),
  Sql(1L),
  SqlFile(2L),
  Oracle(3L),
  Odbc(4L),
  ;
  private long numVal;

  DataSourceType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
