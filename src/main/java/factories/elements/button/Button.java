package factories.elements.button;

import common.Glyph;
import lombok.NoArgsConstructor;

/**
 * Абстрактный класс кнопки
 */
@NoArgsConstructor
public abstract class Button extends Glyph {

  /**
   * Конструктор прототипа кнопки
   *
   * @param button Кнопка
   */
  public Button(Button button) {
  }

  /**
   * Нажать
   *
   * @return Строка с результатом
   */
  public String press() {
    throw new UnsupportedOperationException();
  }

  /**
   * Метод клонирования
   *
   * @return Кнопка
   */
  public abstract Button clone();
}
