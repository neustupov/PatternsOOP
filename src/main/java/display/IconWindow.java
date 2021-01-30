package display;

import display.attributes.Size;
import display.observer.Observer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * ���� ������
 */
@NoArgsConstructor
@AllArgsConstructor
public class IconWindow extends Window implements Observer {

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

  /**
   * �������� ������
   *
   * @param size ������
   */
  @Override
  public void update(Size size) {
    this.size = size;
  }
}
