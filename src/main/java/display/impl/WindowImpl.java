package display.impl;

import java.util.Map;

/**
 * �������� ��������� ����� - ��������� �������� � Window �������������� ������, �������� ����������
 * �� ����������
 */
public interface WindowImpl {

  /**
   * ������ Char
   *
   * @param character Character
   * @return String
   */
  String deviceChar(Character character);

  /**
   * ������ Rectangle
   *
   * @param x0 x0
   * @param y0 y0
   * @param x1 x1
   * @param y1 y1
   * @return String
   */
  String deviceRect(int x0, int y0, int x1, int y1);

  /**
   * ������ Polygon
   *
   * @param coords ����������
   * @return String
   */
  String devicePoly(Map<Integer, Integer> coords);

  /**
   * ������ Border
   *
   * @return String
   */
  String drawBorder();

  /**
   * ������ Scroller
   *
   * @return String
   */
  String drawScroller();

  /**
   * ��������������� �����
   *
   * @param coords ����������
   * @return String
   */
  default String appendSb(Map<Integer, Integer> coords) {
    StringBuffer sb = new StringBuffer();
    coords.keySet().forEach(key -> {
      sb.append("x: ");
      sb.append(key);
      sb.append(" ");
      sb.append("y:");
      sb.append(coords.get(key));
      sb.append(" ");
    });
    return sb.toString();
  }
}
