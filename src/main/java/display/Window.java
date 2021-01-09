package display;

import common.Glyph;
import java.util.Map;
import lombok.Setter;

/**
 * Рисует компонент
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
   * Рисует символ
   *
   * @param character Символ
   */
  public String drawCharacter(Character character) {
    return character.toString();
  }

  /**
   * Рисует прямоугольник
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
   * Рисует многоугольник
   *
   * @param coords Мапа координат
   * @return Строка с результатом
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
   * Рисует строку
   *
   * @param row Строка
   */
  public void drawRow(String row) {

  }

  /**
   * Рисует рамку
   */
  public String drawBorder() {
    return "Draw border";
  }

  /**
   * Рисует полосу прокрутки
   */
  public String drawScroller() {
    return "Draw scroller";
  }

  public String draw(){
    return glyph.draw(this);
  }
}
