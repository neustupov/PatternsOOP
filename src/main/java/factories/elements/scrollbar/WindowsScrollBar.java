package factories.elements.scrollbar;

/**
 * Полоса прокрутки для Win
 */
public class WindowsScrollBar extends ScrollBar {

  /**
   * Конструктор конкретного прототипа
   */
  public WindowsScrollBar(ScrollBar scrollBar) {
    super(scrollBar);
  }

  /**
   * Прокрутка
   *
   * @return Строка с результатом
   */
  @Override
  public String scrollTo() {
    return "WindowsScrollBar";
  }

  /**
   * Метод клонирования
   *
   * @return Полоса прокрутки
   */
  @Override
  public ScrollBar clone() {
    return new WindowsScrollBar(this);
  }
}
