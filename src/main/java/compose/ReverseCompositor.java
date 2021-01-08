package compose;

import common.Glyph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lombok.NoArgsConstructor;

/**
 * ��������(���������) ���������� - ������ ������
 */
@NoArgsConstructor
public class ReverseCompositor extends Compositor {

  /**
   * ��������� �������� ���������� - ������������� ������
   *
   * @param glyphs ������ ��� ���������
   */
  @Override
  List<Glyph> compose(List<Glyph> glyphs) {
    List<Glyph> result = new ArrayList<>(glyphs);
    Collections.reverse(result);
    return result;
  }
}
