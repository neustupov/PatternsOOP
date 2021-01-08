package factories.elements.scrollbar;

import common.Glyph;

/**
 * ����������� ����� ������ ���������
 */
public abstract class ScrollBar extends Glyph {

  /**
   * ����������� ��������� ������ ���������
   *
   * @param scrollBar ����
   */
  public ScrollBar(ScrollBar scrollBar) {
  }

  /**
   * ���������
   *
   * @return ������ � �����������
   */
  public String scrollTo() {
    throw new UnsupportedOperationException();
  }

  /**
   * ����� ������������
   *
   * @return ������ ���������
   */
  public abstract ScrollBar clone();
}
