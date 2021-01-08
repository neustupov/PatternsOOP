package factories.elements.scrollbar;

import common.Glyph;
import lombok.NoArgsConstructor;

/**
 * Абстрактный класс полосы прокрутки
 */
@NoArgsConstructor
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
