package display;

import lombok.AllArgsConstructor;

/**
 * ���� ������
 */
@AllArgsConstructor
public class IconWindow extends Window {

  /**
   * ��������
   */
  private Window owner;

  /**
   * ���������� ������
   *
   * @return ��������� ������
   */
  @Override
  public String iconify() {
    return owner.iconify();
  }
}
