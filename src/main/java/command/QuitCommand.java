package command;

/**
 * ������� ������ �� ����������
 */
public class QuitCommand implements Command {

  /**
   * ���������
   *
   * @return ��������� ����������
   */
  @Override
  public String execute() {
    SaveCommand saveCommand = new SaveCommand();
    return saveCommand.execute() + " and exit from App";
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
