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
  abstract List<Glyph> compose(List<Glyph> glyphs);
}
