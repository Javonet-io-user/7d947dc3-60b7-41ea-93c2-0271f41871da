package combit.ListLabel24;

public enum LlCharRepresentation {
  EXPRSEP(164L),
  NewLine(182L),
  CODE93EXPLUS(251L),
  EAN128FNC3(252L),
  EAN128FNC2(253L),
  CODE93EXDOLLAR(254L),
  EAN128NUL(255L),
  PhantomSpace(8203L),
  Lock(8288L),
  ;
  private long numVal;

  LlCharRepresentation(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
