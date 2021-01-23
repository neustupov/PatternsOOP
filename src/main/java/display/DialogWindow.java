package display;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ���� �������
 */
@NoArgsConstructor
@AllArgsConstructor
public class DialogWindow extends Window {

  /**
   * ��������
   */
  @Setter
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
