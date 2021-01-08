package factories.elements.button;

import common.Glyph;
import lombok.NoArgsConstructor;

/**
 * ����������� ����� ������
 */
@NoArgsConstructor
public abstract class Button extends Glyph {

  /**
   * ����������� ��������� ������
   *
   * @param button ������
   */
  public Button(Button button) {
  }

  /**
   * ������
   *
   * @return ������ � �����������
   */
  public String press() {
    throw new UnsupportedOperationException();
  }

  /**
   * ����� ������������
   *
   * @return ������
   */
  public abstract Button clone();
}
