package command;

/**
 * ������� - ���������
 */
public class SaveCommand implements Command {

  /**
   * ���������
   *
   * @return ��������� ����������
   */
  @Override
  public String execute() {
    return "Doc save";
  }

  /**
   * ��������
   *
   * @return ��������� ����������
   */
  @Override
  public String unexecute() {
    return null;
  }

  /**
   * ����������� ������
   *
   * @return boolean
   */
  @Override
  public boolean reversible() {
    return false;
  }
}
