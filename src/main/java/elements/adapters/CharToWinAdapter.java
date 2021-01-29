package elements.adapters;

import common.Glyph;
import display.ApplicationWindow;
import display.Window;
import elements.Char;

/**
 * Адаптер
 */
public class CharToWinAdapter extends Char {

  /**
   * Компонент, интерфейс которого нужно адаптировать
   */
  private ApplicationWindow window;

  public CharToWinAdapter(Character character, Glyph parent,  ApplicationWindow window) {
    super(character, parent);
    this.window = window;
  }

  @Override
  public String draw(Window window) {
    return window.redraw();
  }
}
