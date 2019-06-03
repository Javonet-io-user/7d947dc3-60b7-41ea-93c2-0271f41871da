package combit.ListLabel24;

public enum LlDesignerPrintJob {
  StartPreview(1L),
  AbortPreview(2L),
  FinalizePreview(3L),
  GetPreviewJobState(4L),
  StartExport(5L),
  AbortExport(6L),
  FinalizeExport(7L),
  GetExportJobState(8L),
  ;
  private long numVal;

  LlDesignerPrintJob(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
