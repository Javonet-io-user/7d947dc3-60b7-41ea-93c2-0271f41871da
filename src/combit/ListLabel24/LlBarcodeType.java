package combit.ListLabel24;

public enum LlBarcodeType {
  EAN13(1073741824L),
  EAN8(1073741825L),
  UPCA(1073741826L),
  UPCE(1073741827L),
  Code3of9(1073741828L),
  Code2of5_Industrial(1073741829L),
  Code2of5_Interleaved(1073741830L),
  Code2of5_Datalogic(1073741831L),
  Code2of5_Matrix(1073741832L),
  Postnet(1073741833L),
  FIM(1073741834L),
  Codabar(1073741835L),
  EAN128(1073741836L),
  CODE128(1073741837L),
  DP_Leitcode(1073741838L),
  DP_Identcode(1073741839L),
  German_Parcel(1073741840L),
  Code93(1073741841L),
  MSI(1073741842L),
  Code11(1073741843L),
  MSI_10_CD(1073741844L),
  MSI_10_10(1073741845L),
  MSI_11_10(1073741846L),
  MSI_10_Plain(1073741847L),
  GTIN14(1073741848L),
  UCC14(1073741849L),
  Code39(1073741850L),
  Code39_CRC43(1073741851L),
  PZN(1073741852L),
  Code39_Ext(1073741853L),
  Japanese_Postal(1073741854L),
  Rm4SCC(1073741855L),
  Rm4SCC_CRC(1073741856L),
  SCC(1073741857L),
  ISBN(1073741858L),
  GS1(1073741859L),
  GS1Truncated(1073741860L),
  GS1Stacked(1073741861L),
  GS1StackedOmni(1073741862L),
  GS1Limited(1073741863L),
  GS1Expanded(1073741864L),
  IntelligentMail(1073741865L),
  PZN8(1073741866L),
  Code128_Full(1073741867L),
  EAN128_Full(1073741868L),
  CodablockF(1073741869L),
  PDF417(1073741888L),
  Maxicode(1073741889L),
  Maxicode_UPS(1073741890L),
  Datamatrix(1073741892L),
  Aztec(1073741893L),
  QRCode(1073741894L),
  MicroPDF417(1073741896L),
  ;
  private long numVal;

  LlBarcodeType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
