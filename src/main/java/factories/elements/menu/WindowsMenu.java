package factories.elements.menu;

import lombok.NoArgsConstructor;

/**
 * ���� ��� Win
 */
@NoArgsConstructor
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
