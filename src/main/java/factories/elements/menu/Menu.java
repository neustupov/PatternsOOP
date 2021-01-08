package factories.elements.menu;

import common.Glyph;
import lombok.NoArgsConstructor;

/**
 * Абстрактный класс меню
 */
@NoArgsConstructor
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
