package transparentenclosure;

import common.Glyph;
import common.MonoGlyph;
import display.Window;

/**
 * Декоратор прокрутки
 */
public class Scroller extends MonoGlyph {

  public Scroller(Glyph component) {
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
    drawScroller(window);
  }

  /**
   * Отрисовывает полосу прокрутки
   *
   * @param window Window
   */
  private void drawScroller(Window window){}
}
