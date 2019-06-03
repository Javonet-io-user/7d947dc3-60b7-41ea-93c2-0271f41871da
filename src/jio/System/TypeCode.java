package jio.System;

public enum TypeCode {
  Empty(0L),
  Object(1L),
  DBNull(2L),
  Boolean(3L),
  Char(4L),
  SByte(5L),
  Byte(6L),
  Int16(7L),
  UInt16(8L),
  Int32(9L),
  UInt32(10L),
  Int64(11L),
  UInt64(12L),
  Single(13L),
  Double(14L),
  Decimal(15L),
  DateTime(16L),
  String(18L),
  ;
  private long numVal;

  TypeCode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
