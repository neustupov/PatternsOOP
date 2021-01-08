package factories.elements.scrollbar;

import common.Glyph;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ����������� ����� ������ ���������
 */
@NoArgsConstructor
public abstract class ScrollBar extends Glyph {

  @Getter
  @Setter
  private Integer randomScrollPoint;

  /**
   * ����������� ��������� ������ ���������
   *
   * @param scrollBar ����
   */
  public ScrollBar(ScrollBar scrollBar) {
    randomScrollPoint = scrollBar.getRandomScrollPoint();
  }

  /**
   * ���������
   *
   * @return ������ � �����������
   */
  public String scrollTo() {
    throw new UnsupportedOperationException();
  }

  /**
   * ����� ������������
   *
   * @return ������ ���������
   */
  public abstract ScrollBar clone();
}
