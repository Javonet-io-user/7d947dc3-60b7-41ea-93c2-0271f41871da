package combit.ListLabel24;

public enum LlViewerAction {
  ZoomTimes2(100L),
  ZoomRevert(101L),
  FirstPage(102L),
  LastPage(103L),
  PreviousPage(104L),
  NextPage(105L),
  ZoomFit(108L),
  PrintPage(112L),
  PrintPagerange(113L),
  Exit(114L),
  SendTo(115L),
  SaveAs(116L),
  Fax(117L),
  Search(118L),
  SearchNext(119L),
  SearchTextEdit(121L),
  SearchOptions(122L),
  PageCombo(124L),
  ZoomCombo(125L),
  SlideshowMode(126L),
  MouseModeZoom(127L),
  MouseModeMove(128L),
  ;
  private long numVal;

  LlViewerAction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
