package app.handlers;

/**
 * ��������� ������� ������������
 */
public interface Handler {

  /**
   * ��������� �������
   *
   * @param request ������
   * @return ���������
   */
  String handle(Request request);
}
