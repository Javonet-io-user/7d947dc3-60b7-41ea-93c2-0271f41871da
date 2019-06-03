package combit.ListLabel24;

public enum LlPrintOption {
  Copies(0L),
  StartPage(1L),
  Offset(2L),
  Copies_Supported(3L),
  Units(4L),
  FirstPage(5L),
  LastPage(6L),
  JobPages(7L),
  PrintOrder(8L),
  PrintOrder_Printer1(9L),
  PrintOrder_Printer2(10L),
  DefaultPrinterInstalled(11L),
  Dialog_DestinationMask(12L),
  Dialog_Destination(13L),
  Dialog_OnlyPrinterCopies(14L),
  PageIndex(18L),
  UseMemoryMetafile(22L),
  ;
  private long numVal;

  LlPrintOption(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
