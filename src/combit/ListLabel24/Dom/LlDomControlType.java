package combit.ListLabel24.Dom;

public enum LlDomControlType {
  Text(0L),
  Date(1L),
  BooleanYesNo(2L),
  BooleanTrueFalse(3L),
  ;
  private long numVal;

  LlDomControlType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
