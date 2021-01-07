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
  public String draw(Window window) {
    return super.draw(window) + " " + drawScroller(window);
  }

  /**
   * Отрисовывает полосу прокрутки
   *
   * @param window Window
   */
  private String drawScroller(Window window){
    return window.drawScroller();
  }
}
