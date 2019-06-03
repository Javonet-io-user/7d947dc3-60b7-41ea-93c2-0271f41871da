package combit.ListLabel24;

public enum LlExportTarget {
  Pdf(0L),
  Html(1L),
  Rtf(2L),
  Bitmap(3L),
  MetaFile(4L),
  Tiff(5L),
  MultiTiff(6L),
  Jpeg(7L),
  Png(8L),
  Xls(9L),
  Xlsx(10L),
  Docx(11L),
  Xps(12L),
  Mhtml(13L),
  Xhtml(14L),
  Svg(15L),
  Jqm(16L),
  Xml(17L),
  Text(18L),
  TextLayout(19L),
  Tty(20L),
  Preview(21L),
  Pptx(22L),
  ;
  private long numVal;

  LlExportTarget(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
