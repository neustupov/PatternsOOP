package factories.elements.button;

/**
 * Класс кнопки для системы Mac
 */
public class MacButton extends Button {

  /**
   * Нажать
   *
   * @return Строка с результатом
   */
  @Override
  public String press() {
    return "MacButton";
  }
}
