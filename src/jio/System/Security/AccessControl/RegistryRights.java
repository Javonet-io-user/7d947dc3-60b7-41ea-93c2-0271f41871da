package jio.System.Security.AccessControl;

public enum RegistryRights {
  QueryValues(1L),
  SetValue(2L),
  CreateSubKey(4L),
  EnumerateSubKeys(8L),
  Notify(16L),
  CreateLink(32L),
  Delete(65536L),
  ReadPermissions(131072L),
  WriteKey(131078L),
  ReadKey(131097L),
  ChangePermissions(262144L),
  TakeOwnership(524288L),
  FullControl(983103L),
  ;
  private long numVal;

  RegistryRights(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
