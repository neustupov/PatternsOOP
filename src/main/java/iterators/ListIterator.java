package iterators;

import common.Glyph;
import java.util.List;

/**
 * »тератор списков
 */
public class ListIterator implements Iterator {

  /**
   * »ндекс
   */
  private int index;
  /**
   * —писок
   */
  private List<Glyph> glyphs;

  public ListIterator(List<Glyph> glyphs) {
    this.glyphs = glyphs;
  }

  /**
   * —ледующий Ёлемент
   *
   * @return Ёлемент
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
   * Ќаличие следующего элемента
   *
   * @return boolean
   */
  @Override
  public boolean hasNext() {
    return index < glyphs.size();
  }
}
