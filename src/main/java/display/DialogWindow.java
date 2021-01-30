package display;

import display.attributes.Size;
import display.observer.Observer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ���� �������
 */
@NoArgsConstructor
@AllArgsConstructor
public class DialogWindow extends Window implements Observer {

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

  /**
   * ��������� ���������
   *
   * @param message ���������
   * @return ��������� ����������
   */
  @Override
  public String notify(String message) {
    return "DialogWindow get message: " + message;
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
