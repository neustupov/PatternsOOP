package display;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * ���� ����������
 */
@AllArgsConstructor
@NoArgsConstructor
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

  /**
   * ��������� ���������
   *
   * @param message ���������
   * @return ��������� ����������
   */
  @Override
  public String notify(String message) {
    return "ApplicationWindow get message: " + message;
  }
}
