package combit.ListLabel24;

public enum DesignerObjectUpdateView {
  None(0L),
  AllObjects(1L),
  ObjectChanged(2L),
  ;
  private long numVal;

  DesignerObjectUpdateView(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
