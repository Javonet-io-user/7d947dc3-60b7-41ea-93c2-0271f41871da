package combit.ListLabel24;

public enum LlObjectType {
  Marker(0L),
  Text(1L),
  Rectangle(2L),
  Line(3L),
  Barcode(4L),
  Drawing(5L),
  Table(6L),
  Template(7L),
  Ellipse(8L),
  RTF(10L),
  LLX(11L),
  Input(12L),
  ;
  private long numVal;

  LlObjectType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
