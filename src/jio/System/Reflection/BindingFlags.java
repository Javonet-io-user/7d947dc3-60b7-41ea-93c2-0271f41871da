package jio.System.Reflection;

public enum BindingFlags {
  Default(0L),
  IgnoreCase(1L),
  DeclaredOnly(2L),
  Instance(4L),
  Static(8L),
  Public(16L),
  NonPublic(32L),
  FlattenHierarchy(64L),
  InvokeMethod(256L),
  CreateInstance(512L),
  GetField(1024L),
  SetField(2048L),
  GetProperty(4096L),
  SetProperty(8192L),
  PutDispProperty(16384L),
  PutRefDispProperty(32768L),
  ExactBinding(65536L),
  SuppressChangeType(131072L),
  OptionalParamBinding(262144L),
  IgnoreReturn(16777216L),
  ;
  private long numVal;

  BindingFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
