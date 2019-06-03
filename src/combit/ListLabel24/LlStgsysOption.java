package combit.ListLabel24;

public enum LlStgsysOption {
  PageNumber(0L),
  Copies(1L),
  Orientation(2L),
  PhysicalPage(3L),
  Printer_PixelsOffset_X(4L),
  Printer_PixelsOffset_Y(5L),
  Printer_Pixels_X(6L),
  Printer_Pixels_Y(7L),
  Printer_PhysicalPages_X(8L),
  Printer_PhysicalPages_Y(9L),
  Printer_PixelsPerInch_X(10L),
  Printer_PixelsPerInch_Y(11L),
  PrinterIndex(12L),
  Printer_PaperType(13L),
  Printer_PaperSize_X(14L),
  Printer_PaperSize_Y(15L),
  StartNewSheet(17L),
  IssueIndex(18L),
  StartNewJob(19L),
  ProjectName(100L),
  JobName(101L),
  PrinterPort(104L),
  UserValue(105L),
  Creation(106L),
  Creation_Application(107L),
  Creation_Dll(108L),
  Creation_User(109L),
  PrinterDevice(121L),
  GetDevmode(122L),
  Has16BitPages(200L),
  BoxType(201L),
  Units(203L),
  PrinterCount(204L),
  IsStorage(205L),
  EmfResolution(206L),
  ;
  private long numVal;

  LlStgsysOption(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
