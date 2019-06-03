package combit.ListLabel24;

public enum LlOptionString {
  Label_ProjectFileExtension(0L),
  Label_SketchFileExtension(1L),
  Label_PrinterSettingsFileExtension(2L),
  Card_ProjectFileExtension(3L),
  Card_SketchFileExtension(4L),
  Card_PrinterSettingsFileExtension(5L),
  List_ProjectFileExtension(6L),
  List_SketchFileExtension(7L),
  List_PrinterSettingsFileExtension(8L),
  LLXPathList(12L),
  ShortDateFormat(13L),
  Decimal(14L),
  Thousand(15L),
  Currency(16L),
  Exports_Available(17L),
  Exports_Allowed(18L),
  DefaultDefaultFont(19L),
  ExportFileList(20L),
  MailTo(24L),
  MailTo_CC(25L),
  MailTo_BCC(26L),
  MailTo_Subject(27L),
  SaveAs_Path(28L),
  Label_ProjectDescription(29L),
  Card_ProjectDescription(30L),
  List_ProjectDescription(31L),
  LlFile_Description(32L),
  ProjectPassword(33L),
  Fax_RecipName(34L),
  Fax_RecipNumber(35L),
  Fax_QueueName(36L),
  Fax_SenderName(37L),
  Fax_SenderCompany(38L),
  Fax_SenderDept(39L),
  LogFilePath(43L),
  LicensingInfo(44L),
  PreviewFileName(46L),
  ExportsAllowedInPreview(47L),
  HelpFileName(48L),
  NullValue(49L),
  OriginalProjectFileName(51L),
  DefaultDesignScheme(63L),
  RepresentationBoolTrue(74L),
  RepresentationBoolFalse(75L),
  EmbeddedExportFormats(84L),
  ;
  private long numVal;

  LlOptionString(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
