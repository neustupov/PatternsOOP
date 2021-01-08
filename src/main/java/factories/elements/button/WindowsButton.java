package factories.elements.button;

/**
 * Класс кнопки для системы Win
 */
public class WindowsButton extends Button {

  /**
   * Конструктор конкретного прототипа
   */
  public WindowsButton(Button button) {
    super(button);
  }

  /**
   * Нажать
   *
   * @return Строка с результатом
   */
  @Override
  public String press() {
    return "WindowsButton";
  }

  /**
   * Метод клонирования
   *
   * @return Кнопка
   */
  @Override
  public Button clone() {
    return new WindowsButton(this);
  }
}
