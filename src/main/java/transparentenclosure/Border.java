package transparentenclosure;

import common.Glyph;
import common.MonoGlyph;
import display.Window;

/**
 * Декоратор рамки
 */
public class Border extends MonoGlyph {

  public Border(Glyph component) {
    super(component);
  }

  /**
   * Добавляет свою реализацию к основной отрисовке компонента
   *
   * @param window Window
   */
  @Override
  public String draw(Window window) {
    return super.draw(window) + " " + drawBorder(window);
  }

  /**
   * Отрисовывает рамку
   *
   * @param window Window
   */
  private String drawBorder(Window window) {
    return window.drawBorder();
  }
}
