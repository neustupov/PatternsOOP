package display;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * ���� �������
 */
@NoArgsConstructor
@AllArgsConstructor
public class DialogWindow extends Window {

  /**
   * ��������
   */
  private Window owner;

  /**
   * ���������
   *
   * @return ��������� ������
   */
  @Override
  public String lower() {
    return owner.lower();
  }
}
