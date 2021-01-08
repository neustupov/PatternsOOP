package factories.elements.scrollbar;

import lombok.NoArgsConstructor;

/**
 * ������ ��������� ��� Mac
 */
@NoArgsConstructor
public class MacScrollBar extends ScrollBar {

  /**
   * ����������� ����������� ���������
   */
  public MacScrollBar(ScrollBar scrollBar) {
    super(scrollBar);
  }

  /**
   * ���������
   *
   * @return ������ � �����������
   */
  @Override
  public String scrollTo() {
    return "MacScrollBar";
  }

  /**
   * ����� ������������
   *
   * @return ������ ���������
   */
  @Override
  public ScrollBar clone() {
    return new MacScrollBar(this);
  }
}
