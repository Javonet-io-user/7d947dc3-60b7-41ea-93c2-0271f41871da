package jio.System.Data.OleDb;

public enum OleDbType {
  Empty(0L),
  SmallInt(2L),
  Integer(3L),
  Single(4L),
  Double(5L),
  Currency(6L),
  Date(7L),
  BSTR(8L),
  IDispatch(9L),
  Error(10L),
  Boolean(11L),
  Variant(12L),
  IUnknown(13L),
  Decimal(14L),
  TinyInt(16L),
  UnsignedTinyInt(17L),
  UnsignedSmallInt(18L),
  UnsignedInt(19L),
  BigInt(20L),
  UnsignedBigInt(21L),
  Filetime(64L),
  Guid(72L),
  Binary(128L),
  Char(129L),
  WChar(130L),
  Numeric(131L),
  DBDate(133L),
  DBTime(134L),
  DBTimeStamp(135L),
  PropVariant(138L),
  VarNumeric(139L),
  VarChar(200L),
  LongVarChar(201L),
  VarWChar(202L),
  LongVarWChar(203L),
  VarBinary(204L),
  LongVarBinary(205L),
  ;
  private long numVal;

  OleDbType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
