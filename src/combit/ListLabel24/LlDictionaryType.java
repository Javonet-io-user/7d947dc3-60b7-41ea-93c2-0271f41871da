package combit.ListLabel24;

public enum LlDictionaryType {
  Static(1L),
  Identifier(2L),
  Table(3L),
  Relation(4L),
  SortOrder(5L),
  ;
  private long numVal;

  LlDictionaryType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
