package iterators;

import common.Glyph;

/**
 * �������� ��������� ���������
 */
public interface Iterator {

  /**
   * ��������� �������
   *
   * @return �������
   */
  Glyph next();

  /**
   * ������� ���������� ��������
   *
   * @return boolean
   */
  boolean hasNext();
}
