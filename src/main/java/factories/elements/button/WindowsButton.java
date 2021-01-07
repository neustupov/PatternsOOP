package factories.elements.button;

/**
 * Класс кнопки для системы Win
 */
public class WindowsButton extends Button {

  /**
   * Нажать
   *
   * @return Строка с результатом
   */
  @Override
  public String press() {
    return "WindowsButton";
  }
}
