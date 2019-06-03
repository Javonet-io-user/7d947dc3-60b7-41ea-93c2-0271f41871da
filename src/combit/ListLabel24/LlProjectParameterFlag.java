package combit.ListLabel24;

public enum LlProjectParameterFlag {
  Formula(0L),
  Fax(1L),
  Mail(2L),
  Internal(4L),
  SaveDefault(65536L),
  Local(268435456L),
  Value(536870912L),
  Private(1073741824L),
  ;
  private long numVal;

  LlProjectParameterFlag(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
