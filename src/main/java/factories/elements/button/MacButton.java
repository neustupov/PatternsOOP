package factories.elements.button;

/**
 * ����� ������ ��� ������� Mac
 */
public class MacButton extends Button {

  /**
   * ����������� ����������� ���������
   */
  public MacButton(Button button) {
    super(button);
  }

  /**
   * ������
   *
   * @return ������ � �����������
   */
  @Override
  public String press() {
    return "MacButton";
  }

  /**
   * ����� ������������
   *
   * @return ������
   */
  @Override
  public Button clone() {
    return new MacButton(this);
  }
}
