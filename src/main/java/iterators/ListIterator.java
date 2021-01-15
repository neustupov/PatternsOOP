package iterators;

import common.Glyph;
import java.util.List;

/**
 * �������� �������
 */
public class ListIterator implements Iterator {

  /**
   * ������
   */
  private int index;
  /**
   * ������
   */
  private List<Glyph> glyphs;

  public ListIterator(List<Glyph> glyphs) {
    this.glyphs = glyphs;
  }

  /**
   * ��������� �������
   *
   * @return �������
   */
  @Override
  public Glyph next() {
    Glyph result = null;
    if (hasNext()) {
      result = glyphs.get(index);
      index++;
    }
    return result;
  }

  /**
   * ������� ���������� ��������
   *
   * @return boolean
   */
  @Override
  public boolean hasNext() {
    return index < glyphs.size();
  }
}
