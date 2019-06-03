package combit.ListLabel24;

public enum LlChartType {
  Pie2D(0L),
  Pie3D(1L),
  Bar3D(2L),
  Bar3DMultiRow(3L),
  Bar3DClustered(4L),
  Bar3DStacked(5L),
  Bar3DStackedRelative(6L),
  Bar2D(7L),
  Bar2DClustered(8L),
  Bar2DStacked(9L),
  Bar2DStackedRelative(10L),
  LineStacked(11L),
  LineStackedRelative(12L),
  LineMultiRow(13L),
  LineSimple(14L),
  AreaSimple(15L),
  AreaStacked(16L),
  AreaStackedRelative(17L),
  BubbleSorted(18L),
  BubbleScattered(19L),
  FunnelVertical(20L),
  FunnelHorizontal(21L),
  Donut2D(22L),
  Donut3D(23L),
  ShapeFile(24L),
  RadarSimple(25L),
  RadarClustered(26L),
  RadarStacked(27L),
  RadarStackedRelative(28L),
  TreeMapSimple(29L),
  TreeMapClustered(30L),
  Unknown(31L),
  ;
  private long numVal;

  LlChartType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
