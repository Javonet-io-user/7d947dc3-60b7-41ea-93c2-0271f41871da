package combit.ListLabel24;

public enum LlRTFEditorAction {
  WYSIWYG(67L),
  Paste(81L),
  Undo(82L),
  Boldface(142L),
  Italic(143L),
  Underline(144L),
  Strikeout(145L),
  AlignLeft(146L),
  AlignRight(147L),
  AlignCenter(148L),
  Enumeration(149L),
  Color(150L),
  Superscript(151L),
  Subscript(152L),
  IncrementOffset(153L),
  DecrementOffset(154L),
  FormulaWizard(168L),
  AlignJustify(169L),
  LineSpacing(170L),
  InsertOLEObject(268L),
  Redo(767L),
  ;
  private long numVal;

  LlRTFEditorAction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
