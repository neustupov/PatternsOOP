package factories.elements.scrollbar;

/**
 * Полоса прокрутки для Mac
 */
public class MacScrollBar extends ScrollBar {

  /**
   * Прокрутка
   *
   * @return Строка с результатом
   */
  @Override
  public String scrollTo() {
    return "MacScrollBar";
  }
}
