package iterators;

import common.Glyph;
import org.apache.commons.lang3.ArrayUtils;

/**
 * Обратный итератор
 */
public class ReverseIterator implements Iterator {

  /**
   * Индекс
   */
  private int index;
  /**
   * Массив
   */
  private Glyph[] glyphs;

  public ReverseIterator(Glyph[] glyphs) {
    this.glyphs = glyphs;
  }

  /**
   * Следующий Элемент
   *
   * @return Элемент
   */
  @Override
  public Glyph next() {
    ArrayUtils.reverse(glyphs);
    Glyph result = null;
    if (hasNext()) {
      result = glyphs[index];
      index++;
    }
    return result;
  }

  /**
   * Наличие следующего элемента
   *
   * @return boolean
   */
  @Override
  public boolean hasNext() {
    return index < glyphs.length;
  }
}
