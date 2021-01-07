package factories.elements.button;

import common.Glyph;

/**
 * Абстрактный класс кнопки
 */
public abstract class Button extends Glyph {

  /**
   * Нажать
   *
   * @return Строка с результатом
   */
  public String press() {
    throw new UnsupportedOperationException();
  }
}
