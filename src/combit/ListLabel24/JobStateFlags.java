package combit.ListLabel24;

public enum JobStateFlags {
  VarList(1L),
  FieldList(2L),
  ChartFieldList(4L),
  DatabaseStructure(8L),
  Dictionaries(16L),
  JobSettings(32L),
  All(63L),
  ;
  private long numVal;

  JobStateFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
