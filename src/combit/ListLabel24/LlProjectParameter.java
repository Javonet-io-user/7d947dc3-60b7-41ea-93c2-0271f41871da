package combit.ListLabel24;

public enum LlProjectParameter {
  FaxQueue(0L),
  FaxRecipNumber(1L),
  FaxRecipName(2L),
  FaxSenderName(3L),
  FaxSenderCompany(4L),
  FaxSenderDepartment(5L),
  FaxSenderBillingCode(6L),
  MailTo(7L),
  MailCC(8L),
  MailBCC(9L),
  MailFrom(10L),
  MailReplyTo(11L),
  MailSubject(12L),
  MinPageCount(13L),
  ProjectDescription(14L),
  SlideShowXformID(15L),
  ActiveLayout(16L),
  IssueCount(17L),
  SingleFileDrilldown(18L),
  PageCondition(19L),
  PrintJobLanguage(20L),
  SortOrderID(21L),
  SaveAsFormat(22L),
  SaveAsFilename(23L),
  SaveAsShowDialog(24L),
  SaveAsNoSaveQuery(25L),
  SaveAsShowResult(26L),
  ;
  private long numVal;

  LlProjectParameter(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
