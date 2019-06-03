package combit.ListLabel24;

public enum LlBoxType {
  NormalMeter(0L),
  BridgeMeter(1L),
  Normalwait(2L),
  BridgeWait(3L),
  EmptyWait(4L),
  EmptyAbort(5L),
  StandardWait(6L),
  StandardAbort(7L),
  Marquee(1008L),
  None(-1L),
  ;
  private long numVal;

  LlBoxType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
