package combit.ListLabel24;

public enum LlDesignerWorkspaceFileMode {
  Open(0L),
  Create(268435456L),
  CreateNew(536870912L),
  OpenOrCreate(805306368L),
  Import(1073741824L),
  ;
  private long numVal;

  LlDesignerWorkspaceFileMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
