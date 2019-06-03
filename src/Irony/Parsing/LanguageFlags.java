package Irony.Parsing;

public enum LanguageFlags {
  Default(0L),
  NewLineBeforeEOF(1L),
  EmitLineStartToken(2L),
  DisableScannerParserLink(4L),
  CreateAst(8L),
  SupportsCommandLine(512L),
  TailRecursive(1024L),
  SupportsBigInt(4096L),
  SupportsComplex(8192L),
  SupportsRational(16384L),
  ;
  private long numVal;

  LanguageFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
