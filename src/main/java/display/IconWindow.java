package display;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * ���� ������
 */
@NoArgsConstructor
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

  /**
   * ��������� ���������
   *
   * @param message ���������
   * @return ��������� ����������
   */
  @Override
  public String notify(String message) {
    return "IconWindow get message: " + message;
  }
}
