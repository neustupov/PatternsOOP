package display;

import common.Glyph;
import java.util.Map;
import lombok.Setter;

/**
 * ������ ���������
 */
public class Window {

  @Setter
  private Glyph glyph;

  public String redraw(){
    return "redraw";
  }

  public String iconify(){
    return "Iconify";
  }

  public String lower(){
    return "lower";
  }

  /**
   * ������ ������
   *
   * @param character ������
   */
  public String drawCharacter(Character character) {
    return character.toString();
  }

  /**
   * ������ �������������
   *
   * @param x0 x0
   * @param y0 y0
   * @param x1 x1
   * @param y1 y1
   */
  public String drawRectangle(int x0, int y0, int x1, int y1) {
    return "Rectangle coords " + x0 + " " + y0 + " " + x1 + " " + y1;
  }

  /**
   * ������ �������������
   *
   * @param coords ���� ���������
   * @return ������ � �����������
   */
  public String drawPolygon(Map<Integer, Integer> coords) {
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

  /**
   * ������ ������
   *
   * @param row ������
   */
  public void drawRow(String row) {

  }

  /**
   * ������ �����
   */
  public String drawBorder() {
    return "Draw border";
  }

  /**
   * ������ ������ ���������
   */
  public String drawScroller() {
    return "Draw scroller";
  }

  public String draw(){
    return glyph.draw(this);
  }
}
