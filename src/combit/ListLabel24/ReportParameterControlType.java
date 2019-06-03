package combit.ListLabel24;

public enum ReportParameterControlType {
  Text(0L),
  Date(1L),
  BoolYesNo(2L),
  BoolTrueFalse(3L),
  DateWithTime(4L),
  ;
  private long numVal;

  ReportParameterControlType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
