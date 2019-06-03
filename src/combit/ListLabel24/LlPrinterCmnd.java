package combit.ListLabel24;

public enum LlPrinterCmnd {
  CreateDC(1L),
  DeleteDC(2L),
  SetOrientation(3L),
  GetOrientation(4L),
  Edit(5L),
  GetDevicename(6L),
  GetDrivername(7L),
  GetPortname(8L),
  ResetDC(9L),
  ComparePrinter(10L),
  GetPhysicalPage(11L),
  SetPhysicalPage(12L),
  ;
  private long numVal;

  LlPrinterCmnd(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
