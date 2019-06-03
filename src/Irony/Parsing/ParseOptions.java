package Irony.Parsing;

public enum ParseOptions {
  Reserved(1L),
  AnalyzeCode(16L),
  ;
  private long numVal;

  ParseOptions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
