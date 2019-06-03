package jio.System.Globalization;

public enum UnicodeCategory {
  UppercaseLetter(0L),
  LowercaseLetter(1L),
  TitlecaseLetter(2L),
  ModifierLetter(3L),
  OtherLetter(4L),
  NonSpacingMark(5L),
  SpacingCombiningMark(6L),
  EnclosingMark(7L),
  DecimalDigitNumber(8L),
  LetterNumber(9L),
  OtherNumber(10L),
  SpaceSeparator(11L),
  LineSeparator(12L),
  ParagraphSeparator(13L),
  Control(14L),
  Format(15L),
  Surrogate(16L),
  PrivateUse(17L),
  ConnectorPunctuation(18L),
  DashPunctuation(19L),
  OpenPunctuation(20L),
  ClosePunctuation(21L),
  InitialQuotePunctuation(22L),
  FinalQuotePunctuation(23L),
  OtherPunctuation(24L),
  MathSymbol(25L),
  CurrencySymbol(26L),
  ModifierSymbol(27L),
  OtherSymbol(28L),
  OtherNotAssigned(29L),
  ;
  private long numVal;

  UnicodeCategory(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
