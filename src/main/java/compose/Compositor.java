package compose;

import common.Glyph;
import java.util.List;

/**
 * ����������� ����� ���������(���������)
 */
abstract class Compositor {

  /**
   * ��������� �������� ��� ����������� �� ������� �������
   *
   * @param glyphs ������ ��� ���������
   */
  abstract void compose(List<Glyph> glyphs);
}
