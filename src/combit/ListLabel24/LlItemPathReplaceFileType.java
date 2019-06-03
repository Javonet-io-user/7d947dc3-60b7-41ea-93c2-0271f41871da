package combit.ListLabel24;

public enum LlItemPathReplaceFileType {
  Drawing(0L),
  Drilldown(1L),
  Template(2L),
  ReportSection_TOC(3L),
  ReportSection_Index(4L),
  ReportSection_GTC(5L),
  ;
  private long numVal;

  LlItemPathReplaceFileType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
