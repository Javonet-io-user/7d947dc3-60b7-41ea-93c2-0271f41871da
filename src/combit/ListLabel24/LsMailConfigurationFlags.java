package combit.ListLabel24;

public enum LsMailConfigurationFlags {
  Global(1L),
  User(2L),
  Provider(4L),
  ;
  private long numVal;

  LsMailConfigurationFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
