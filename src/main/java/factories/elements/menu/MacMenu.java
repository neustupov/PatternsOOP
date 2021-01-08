package factories.elements.menu;

import lombok.NoArgsConstructor;

/**
 * ���� ��� Mac
 */
@NoArgsConstructor
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
