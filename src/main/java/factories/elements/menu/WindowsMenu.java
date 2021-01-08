package factories.elements.menu;

/**
 * ���� ��� Win
 */
public class WindowsMenu extends Menu {

  /**
   * ����������� ����������� ���������
   */
  public WindowsMenu(Menu menu) {
    super(menu);
  }

  /**
   * ���������� ����
   *
   * @return ������ � �����������
   */
  @Override
  public String popup() {
    return "WindowsMenu";
  }

  /**
   * ����� ������������
   *
   * @return ����
   */
  @Override
  public Menu clone() {
    return new WindowsMenu(this);
  }
}
