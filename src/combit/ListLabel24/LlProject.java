package combit.ListLabel24;

public enum LlProject {
  Unknown(0L),
  Label(1L),
  List(2L),
  Card(3L),
  TableOfContents(4L),
  Index(5L),
  ReverseSide(6L),
  NoNameInTitle(2048L),
  CreatePartsFromProject(16384L),
  FileAlsoNew(32768L),
  ;
  private long numVal;

  LlProject(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
