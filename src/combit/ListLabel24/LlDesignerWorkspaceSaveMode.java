package combit.ListLabel24;

public enum LlDesignerWorkspaceSaveMode {
  Default(0L),
  NoSaveQuery(1L),
  NoSave(2L),
  ;
  private long numVal;

  LlDesignerWorkspaceSaveMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
