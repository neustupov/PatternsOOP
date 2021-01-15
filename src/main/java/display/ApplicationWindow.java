package display;

import lombok.AllArgsConstructor;

/**
 * ���� ����������
 */
@AllArgsConstructor
public class ApplicationWindow extends Window {

  /**
   * ��������
   */
  private Window owner;

  /**
   * ������������
   *
   * @return ��������� ����������
   */
  @Override
  public String redraw() {
    return owner.redraw();
  }
}
