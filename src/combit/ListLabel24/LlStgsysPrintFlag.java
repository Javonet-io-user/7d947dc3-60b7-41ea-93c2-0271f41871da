package combit.ListLabel24;

public enum LlStgsysPrintFlag {
  Empty(0L),
  Fit(1L),
  StackedCopies(2L),
  TryPrinterCopies(4L),
  ShowDialog(8L),
  Meter(16L),
  AbortTableMeter(32L),
  MeterMask(112L),
  UseDefPrinterIfNull(128L),
  IgnoreProjectTray(65536L),
  IgnoreProjectDuplex(131072L),
  IgnoreProjectCollation(262144L),
  IgnoreProjectExtraData(524288L),
  ;
  private long numVal;

  LlStgsysPrintFlag(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
