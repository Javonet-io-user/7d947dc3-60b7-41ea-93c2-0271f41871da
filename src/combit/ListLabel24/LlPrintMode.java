package combit.ListLabel24;

public enum LlPrintMode {
  Normal(256L),
  Preview(512L),
  PreviewControl(513L),
  File(1024L),
  Export(2048L),
  MultipleJobs(4096L),
  KeepJob(8192L),
  ;
  private long numVal;

  LlPrintMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
