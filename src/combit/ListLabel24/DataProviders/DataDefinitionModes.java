package combit.ListLabel24.DataProviders;

public enum DataDefinitionModes {
  SyntaxParsingForPrint(0L),
  BaseIdentifiers(1L),
  ParentIdentifiers(2L),
  SyntaxParsingForDesign(16L),
  RealDataForPrint(32L),
  RowModeField(256L),
  ;
  private long numVal;

  DataDefinitionModes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
