package factories.elements.button;

import common.Glyph;

/**
 * Абстрактный класс кнопки
 */
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
