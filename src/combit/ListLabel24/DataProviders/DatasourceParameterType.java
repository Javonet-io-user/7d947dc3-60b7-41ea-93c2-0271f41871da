package combit.ListLabel24.DataProviders;

public enum DatasourceParameterType {
  Text(1L),
  Number(2L),
  ;
  private long numVal;

  DatasourceParameterType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
