package display;

import common.Glyph;
import display.impl.WindowImpl;
import display.impl.WindowSystemFactory;
import java.util.Map;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Рисует компонент
 */
@NoArgsConstructor
public abstract class Window {

  @Setter
  private Glyph glyph;

  @Setter
  private static WindowImpl windowImpl = WindowSystemFactory.getInstance().getWIInstance();

  //Методы управления окнами

  public String redraw(){
    return "redraw";
  }

  public String iconify(){
    return "Iconify";
  }

  public String lower(){
    return "lower";
  }

  //Методы отрисовки графики

  /**
   * Рисует символ
   *
   * @param character Символ
   */
  public String drawCharacter(Character character) {
    return windowImpl.deviceChar(character);
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
    return windowImpl.deviceRect(x0, y0, x1, y1);
  }

  /**
   * Рисует многоугольник
   *
   * @param coords Мапа координат
   * @return Строка с результатом
   */
  public String drawPolygon(Map<Integer, Integer> coords) {
    return windowImpl.devicePoly(coords);
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
    return windowImpl.drawBorder();
  }

  /**
   * Рисует полосу прокрутки
   */
  public String drawScroller() {
    return windowImpl.drawScroller();
  }

  public String draw(){
    return glyph.draw(this);
  }
}
