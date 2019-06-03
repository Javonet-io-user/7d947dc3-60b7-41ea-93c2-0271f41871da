package combit.ListLabel24;

public enum LlAutoRecoveryOption {
  NewFile(1L),
  Overwrite(2L),
  ;
  private long numVal;

  LlAutoRecoveryOption(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
