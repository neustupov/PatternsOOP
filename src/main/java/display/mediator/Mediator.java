package display.mediator;

import display.Window;

/**
 * ����������� ����� ����������
 */
public abstract class Mediator {

  /**
   * ��������� ��������� �� ����������
   *
   * @param message ���������
   * @param sender ���������
   * @return ��������� ��������
   */
  public abstract String send(String message, Window sender);
}
