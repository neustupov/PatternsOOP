package factories.elements.scrollbar;

/**
 * Полоса прокрутки для Win
 */
public class WindowsScrollBar extends ScrollBar {

  /**
   * Прокрутка
   *
   * @return Строка с результатом
   */
  @Override
  public String scrollTo() {
    return "WindowsScrollBar";
  }
}
