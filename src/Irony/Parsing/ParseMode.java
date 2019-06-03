package Irony.Parsing;

public enum ParseMode {
  File(0L),
  VsLineScan(1L),
  CommandLine(2L),
  ;
  private long numVal;

  ParseMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
