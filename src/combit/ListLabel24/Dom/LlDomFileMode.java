package combit.ListLabel24.Dom;

public enum LlDomFileMode {
  Open(0L),
  Create(268435456L),
  CreateNew(536870912L),
  OpenOrCreate(805306368L),
  ;
  private long numVal;

  LlDomFileMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
