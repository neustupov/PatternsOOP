package factories.elements.scrollbar;

/**
 * Полоса прокрутки для Mac
 */
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
