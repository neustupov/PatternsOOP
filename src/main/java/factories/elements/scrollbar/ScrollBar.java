package factories.elements.scrollbar;

import common.Glyph;

/**
 * Абстрактный класс полосы прокрутки
 */
public abstract class ScrollBar extends Glyph {

  /**
   * Конструктор прототипа полосы прокрутки
   *
   * @param scrollBar Меню
   */
  public ScrollBar(ScrollBar scrollBar) {
  }

  /**
   * Прокрутка
   *
   * @return Строка с результатом
   */
  public String scrollTo() {
    throw new UnsupportedOperationException();
  }

  /**
   * Метод клонирования
   *
   * @return Полоса прокрутки
   */
  public abstract ScrollBar clone();
}
