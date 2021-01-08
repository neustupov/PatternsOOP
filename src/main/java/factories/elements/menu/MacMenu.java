package factories.elements.menu;

/**
 * ���� ��� Mac
 */
public class MacMenu extends Menu {

  /**
   * ����������� ����������� ���������
   */
  public MacMenu(Menu menu) {
    super(menu);
  }

  /**
   * ���������� ����
   *
   * @return ������ � �����������
   */
  @Override
  public String popup() {
    return "MacMenu";
  }

  /**
   * ����� ������������
   *
   * @return ����
   */
  @Override
  public Menu clone() {
    return new MacMenu(this);
  }
}
