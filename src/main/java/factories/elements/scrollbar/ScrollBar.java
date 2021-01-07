package factories.elements.scrollbar;

import common.Glyph;

/**
 * Абстрактный класс полосы прокрутки
 */
public abstract class ScrollBar extends Glyph {

  /**
   * Прокрутка
   *
   * @return Строка с результатом
   */
  public String scrollTo() {
    throw new UnsupportedOperationException();
  }
}
