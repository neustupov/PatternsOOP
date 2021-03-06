package display.impl;

import java.util.Map;

/**
 * �������� � �������� Mac
 */
public class MacWindowImpl implements WindowImpl {

  /**
   * ������ Char
   *
   * @param character Character
   * @return String
   */
  @Override
  public String deviceChar(Character character) {
    return character.toString() + " MacWindowImpl";
  }

  /**
   * ������ Rectangle
   *
   * @param x0 x0
   * @param y0 y0
   * @param x1 x1
   * @param y1 y1
   * @return String
   */
  @Override
  public String deviceRect(int x0, int y0, int x1, int y1) {
    return "Rectangle coords " + x0 + " " + y0 + " " + x1 + " " + y1 + " MacWindowImpl";
  }

  /**
   * ������ Polygon
   *
   * @param coords ����������
   * @return String
   */
  @Override
  public String devicePoly(Map<Integer, Integer> coords) {
    return appendSb(coords) + " MacWindowImpl";
  }

  /**
   * ������ Border
   *
   * @return String
   */
  @Override
  public String drawBorder() {
    return "Draw MacWindowImpl border";
  }

  /**
   * ������ Scroller
   *
   * @return String
   */
  @Override
  public String drawScroller() {
    return "Draw MacWindowImpl scroller";
  }
}
