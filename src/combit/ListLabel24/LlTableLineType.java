package combit.ListLabel24;

public enum LlTableLineType {
  Header(0L),
  Body(1L),
  Footer(2L),
  Fill(3L),
  GroupHeader(4L),
  GroupFooter(5L),
  ;
  private long numVal;

  LlTableLineType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
