package factories.elements.button;

import common.Glyph;

/**
 * ����������� ����� ������
 */
public abstract class Button extends Glyph {

  /**
   * ������
   *
   * @return ������ � �����������
   */
  public String press() {
    throw new UnsupportedOperationException();
  }
}
