package combit.ListLabel24.Dom;

public enum LlDomSourceContentsType {
  Boolean(33554432L),
  Date(67108864L),
  Numeric(134217728L),
  Text(268435456L),
  ;
  private long numVal;

  LlDomSourceContentsType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
