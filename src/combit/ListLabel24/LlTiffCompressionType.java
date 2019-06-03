package combit.ListLabel24;

public enum LlTiffCompressionType {
  None(0L),
  CCITTRLE(1L),
  CCITT3(2L),
  CCITT4(3L),
  JPEG(4L),
  ZIP(5L),
  LZW(6L),
  ;
  private long numVal;

  LlTiffCompressionType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
