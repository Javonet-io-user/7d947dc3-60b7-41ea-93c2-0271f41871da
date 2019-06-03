package combit.ListLabel24;

public enum LlExpressionPart {
  Unknown(0L),
  Boolean(1L),
  Text(2L),
  Number(3L),
  Date(4L),
  UnaryOperatorSign(5L),
  UnaryOperatorNegation(6L),
  BinaryOperatorAdd(7L),
  BinaryOperatorSubtract(8L),
  BinaryOperatorMultiply(9L),
  BinaryOperatorDivide(10L),
  BinaryOperatorModulo(11L),
  BinaryOperatorAppend(12L),
  BinaryOperatorAddDateTime(13L),
  RelationXor(14L),
  RelationOr(15L),
  RelationAnd(16L),
  RelationEqual(17L),
  RelationNotEqual(18L),
  RelationGreaterThan(19L),
  RelationGreaterThanOrEqual(20L),
  RelationLessThan(21L),
  RelationLessThanOrEqual(22L),
  Function(23L),
  Field(24L),
  Initialize(25L),
  ;
  private long numVal;

  LlExpressionPart(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
