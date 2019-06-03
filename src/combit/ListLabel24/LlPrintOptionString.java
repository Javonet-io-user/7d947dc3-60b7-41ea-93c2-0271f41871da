package combit.ListLabel24;

public enum LlPrintOptionString {
  Destination_Filename(0L),
  ExportDescription(1L),
  Export(2L),
  PrintJobname(3L),
  PageRanges(10L),
  IssueRanges(11L),
  ;
  private long numVal;

  LlPrintOptionString(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
