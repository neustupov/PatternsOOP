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
  public void draw(Window window) {
    super.draw(window);
    drawBorder(window);
  }

  /**
   * Отрисовывает рамку
   *
   * @param window Window
   */
  private void drawBorder(Window window) {
  }
}
