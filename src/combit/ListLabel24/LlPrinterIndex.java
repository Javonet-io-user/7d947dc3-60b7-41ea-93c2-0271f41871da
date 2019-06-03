package combit.ListLabel24;

public enum LlPrinterIndex {
  FirstPage(0L),
  FollowingPages(1L),
  FirstRegion(100L),
  SecondRegion(101L),
  ThirdRegion(102L),
  FourthRegion(103L),
  FifthRegion(104L),
  SixthRegion(105L),
  SeventhRegion(106L),
  EigthRegion(107L),
  NinthRegion(108L),
  TenthRegion(109L),
  AllPages(-1L),
  ;
  private long numVal;

  LlPrinterIndex(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
