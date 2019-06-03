package combit.ListLabel24.DataProviders;

public enum DbConnectionElementTypes {
  None(0L),
  Table(1L),
  View(2L),
  ;
  private long numVal;

  DbConnectionElementTypes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
