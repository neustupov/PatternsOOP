package factories.elements.menu;

import common.Glyph;

/**
 * ����������� ����� ����
 */
public abstract class Menu extends Glyph {

  /**
   * ����������� ��������� ����
   *
   * @param menu ����
   */
  public Menu(Menu menu) {
  }

  /**
   * ���������� ����
   *
   * @return ������ � �����������
   */
  public String popup() {
    throw new UnsupportedOperationException();
  }

  /**
   * ����� ������������
   *
   * @return ����
   */
  public abstract Menu clone();
}
