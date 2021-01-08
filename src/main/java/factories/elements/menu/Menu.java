package factories.elements.menu;

import common.Glyph;

/**
 * Абстрактный класс меню
 */
public abstract class Menu extends Glyph {

  /**
   * Конструктор прототипа меню
   *
   * @param menu Меню
   */
  public Menu(Menu menu) {
  }

  /**
   * Отобразить меню
   *
   * @return Строка с результатом
   */
  public String popup() {
    throw new UnsupportedOperationException();
  }

  /**
   * Метод клонирования
   *
   * @return Меню
   */
  public abstract Menu clone();
}
