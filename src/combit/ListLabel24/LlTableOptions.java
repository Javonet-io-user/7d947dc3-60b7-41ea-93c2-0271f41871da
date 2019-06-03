package combit.ListLabel24;

public enum LlTableOptions {
  None(0L),
  SupportsAdvancedSorting(1L),
  SupportsAdvancedFiltering(2L),
  OnlyFor1To1Relations(4L),
  ;
  private long numVal;

  LlTableOptions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
