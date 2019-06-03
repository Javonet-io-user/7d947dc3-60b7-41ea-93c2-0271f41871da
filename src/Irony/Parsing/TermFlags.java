package Irony.Parsing;

public enum TermFlags {
  None(0L),
  IsOperator(1L),
  IsOpenBrace(2L),
  IsCloseBrace(4L),
  IsBrace(6L),
  IsLiteral(8L),
  IsConstant(16L),
  IsPunctuation(32L),
  IsDelimiter(64L),
  IsReservedWord(128L),
  IsMemberSelect(256L),
  InheritPrecedence(512L),
  IsNonScanner(4096L),
  IsNonGrammar(8192L),
  IsTransient(16384L),
  IsNotReported(32768L),
  IsNullable(65536L),
  IsVisible(131072L),
  IsKeyword(262144L),
  IsMultiline(1048576L),
  IsList(2097152L),
  IsListContainer(4194304L),
  NoAstNode(8388608L),
  AstDelayChildren(16777216L),
  ;
  private long numVal;

  TermFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
