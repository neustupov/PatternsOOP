package factories.elements.button;

import lombok.NoArgsConstructor;

/**
 * Класс кнопки для системы Mac
 */
@NoArgsConstructor
public class MacButton extends Button {

  /**
   * Конструктор конкретного прототипа
   */
  public MacButton(Button button) {
    super(button);
  }

  /**
   * Нажать
   *
   * @return Строка с результатом
   */
  @Override
  public String press() {
    return "MacButton";
  }

  /**
   * Метод клонирования
   *
   * @return Кнопка
   */
  @Override
  public Button clone() {
    return new MacButton(this);
  }
}
