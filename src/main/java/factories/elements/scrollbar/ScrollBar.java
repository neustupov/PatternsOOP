package factories.elements.scrollbar;

import common.Glyph;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Абстрактный класс полосы прокрутки
 */
@NoArgsConstructor
public abstract class ScrollBar extends Glyph {

  @Getter
  @Setter
  private Integer randomScrollPoint;

  /**
   * Конструктор прототипа полосы прокрутки
   *
   * @param scrollBar Меню
   */
  public ScrollBar(ScrollBar scrollBar) {
    randomScrollPoint = scrollBar.getRandomScrollPoint();
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
