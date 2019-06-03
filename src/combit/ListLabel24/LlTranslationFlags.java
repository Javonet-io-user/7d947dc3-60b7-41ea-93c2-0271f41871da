package combit.ListLabel24;

public enum LlTranslationFlags {
  Load(1L),
  Save(2L),
  Default(3L),
  ;
  private long numVal;

  LlTranslationFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
