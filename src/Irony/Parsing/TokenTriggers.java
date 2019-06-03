package Irony.Parsing;

public enum TokenTriggers {
  None(0L),
  MemberSelect(1L),
  MatchBraces(2L),
  ParameterStart(16L),
  ParameterNext(32L),
  ParameterEnd(64L),
  Parameter(128L),
  MethodTip(240L),
  ;
  private long numVal;

  TokenTriggers(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
