package iterators;

import common.Glyph;
import org.apache.commons.lang3.ArrayUtils;

public class ReverseIterator implements Iterator {

  private int index;
  private Glyph[] glyphs;

  public ReverseIterator(Glyph[] glyphs) {
    this.glyphs = glyphs;
  }

  @Override
  public Glyph next() {
    ArrayUtils.reverse(glyphs);
    Glyph result = null;
    if(hasNext()){
      result = glyphs[index];
      index++;
    }
    return result;
  }

  @Override
  public boolean hasNext() {
    return index < glyphs.length;
  }
}
