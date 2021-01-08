package compose;

import common.Glyph;
import elements.Char;
import java.util.List;
import java.util.stream.Collectors;
import lombok.NoArgsConstructor;

/**
 * ��������(���������) ���������� ������ - ���������, ��� � ������ - ���������� ������ Char -
 * ���� ������� �� ������
 */
@NoArgsConstructor
public class TeXCompositor extends Compositor {

  /**
   * ��������� �������� ����������
   *
   * @param glyphs ������ ��� ���������
   */
  @Override
  List<Glyph> compose(List<Glyph> glyphs) {
    return glyphs.stream().filter(glyph -> glyph instanceof Char).collect(Collectors.toList());
  }
}
