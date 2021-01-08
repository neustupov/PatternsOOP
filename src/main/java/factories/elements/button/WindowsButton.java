package factories.elements.button;

import lombok.NoArgsConstructor;

/**
 * ����� ������ ��� ������� Win
 */
@NoArgsConstructor
public class WindowsButton extends Button {

  /**
   * ����������� ����������� ���������
   */
  public WindowsButton(Button button) {
    super(button);
  }

  /**
   * ������
   *
   * @return ������ � �����������
   */
  @Override
  public String press() {
    return "WindowsButton";
  }

  /**
   * ����� ������������
   *
   * @return ������
   */
  @Override
  public Button clone() {
    return new WindowsButton(this);
  }
}
