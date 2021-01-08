package factories.elements.scrollbar;

import lombok.NoArgsConstructor;

/**
 * Полоса прокрутки для Mac
 */
@NoArgsConstructor
public class MacScrollBar extends ScrollBar {

  /**
   * Конструктор конкретного прототипа
   */
  public MacScrollBar(ScrollBar scrollBar) {
    super(scrollBar);
  }

  /**
   * Прокрутка
   *
   * @return Строка с результатом
   */
  @Override
  public String scrollTo() {
    return "MacScrollBar";
  }

  /**
   * Метод клонирования
   *
   * @return Полоса прокрутки
   */
  @Override
  public ScrollBar clone() {
    return new MacScrollBar(this);
  }
}
