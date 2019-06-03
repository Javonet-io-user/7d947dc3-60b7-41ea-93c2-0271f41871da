package combit.ListLabel24;

public enum LogCategory {
  Unknown(0L),
  API(1L),
  Printer(2L),
  Licensing(3L),
  Net(4L),
  Mail(5L),
  Native2SqlTranslation(6L),
  Notification(7L),
  SystemInfo(8L),
  DOM(9L),
  DataProvider(10L),
  Storage(11L),
  ObjectStates(12L),
  Export(13L),
  Webdesigner(14L),
  ;
  private long numVal;

  LogCategory(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
