package compose;

import common.Glyph;
import java.util.List;
import lombok.Setter;

/**
 * ���������� �����������
 */
public class Composition extends Glyph {

  /**
   * �������� ���������� - ����� ���������
   */
  private Compositor compositor;

  /**
   * ������ �����������
   */
  @Setter
  private List<Glyph> glyphs;

  public Composition(Compositor compositor) {
    this.compositor = compositor;
  }

  /**
   * ��������� �������� ���������� ����������� - � ���������� �������� �������, � �������
   * ����������� ��������(���������)
   */
  public List<Glyph> repair() {
    return compositor.compose(glyphs);
  }

  /**
   * ��������� ���������� � ������
   *
   * @param glyph ������ ����������
   * @param index index
   */
  public void insert(Glyph glyph, int index) {
    glyph.setParent(this);
    glyphs.add(index, glyph);
  }
}
