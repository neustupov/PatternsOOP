package compose;

import common.Glyph;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.NoArgsConstructor;

/**
 * ��������(���������) ���������� �������� ������� - ��������� ������ 1� ������ � ������
 */
@NoArgsConstructor
public class SimpleCompositor extends Compositor {

  /**
   * ��������� �������� ����������
   *
   * @param glyphs ������ ��� ���������
   */
  @Override
  List<Glyph> compose(List<Glyph> glyphs) {
    return new ArrayList<>(Collections.singleton(glyphs.get(0)));
  }
}
