package factories.elements.menu;

import common.Glyph;

/**
 * Абстрактный класс меню
 */
public abstract class Menu extends Glyph {

  /**
   * Отобразить меню
   *
   * @return Строка с результатом
   */
  public String popup() {
    throw new UnsupportedOperationException();
  }
}
