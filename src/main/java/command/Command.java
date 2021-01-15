package command;

/**
 * ��������� �������
 */
public interface Command {

  /**
   * ���������
   *
   * @return ��������� ����������
   */
  String execute();

  /**
   * ��������
   *
   * @return ��������� ����������
   */
  String unexecute();

  /**
   * ����������� ������
   *
   * @return boolean
   */
  boolean reversible();
}
