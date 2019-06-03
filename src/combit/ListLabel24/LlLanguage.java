package combit.ListLabel24;

public enum LlLanguage {
  German(0L),
  English(1L),
  Chinese(9L),
  Czech(11L),
  Danish(12L),
  Dutch(13L),
  French(18L),
  Italian(24L),
  Japanese(25L),
  Polish(30L),
  Portuguese(31L),
  Russian(33L),
  Slovak(34L),
  Spanish(37L),
  SerbianLatin(42L),
  Default(-1L),
  ;
  private long numVal;

  LlLanguage(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
