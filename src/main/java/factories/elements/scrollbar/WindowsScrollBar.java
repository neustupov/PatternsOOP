package factories.elements.scrollbar;

import lombok.NoArgsConstructor;

/**
 * ������ ��������� ��� Win
 */
@NoArgsConstructor
public class WindowsScrollBar extends ScrollBar {

  /**
   * ����������� ����������� ���������
   */
  public WindowsScrollBar(ScrollBar scrollBar) {
    super(scrollBar);
  }

  /**
   * ���������
   *
   * @return ������ � �����������
   */
  @Override
  public String scrollTo() {
    return "WindowsScrollBar";
  }

  /**
   * ����� ������������
   *
   * @return ������ ���������
   */
  @Override
  public ScrollBar clone() {
    return new WindowsScrollBar(this);
  }
}
