package display.observer;

import display.attributes.Size;

/**
 * �������� ��������� �����������
 */
public interface Observer {

  /**
   * �������� ���������
   *
   * @param size ������
   */
  void update(Size size);
}
