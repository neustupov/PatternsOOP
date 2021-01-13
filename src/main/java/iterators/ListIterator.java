package iterators;

import common.Glyph;
import java.util.List;

public class ListIterator implements Iterator {

  private int index;
  private List<Glyph> glyphs;

  public ListIterator(List<Glyph> glyphs) {
    this.glyphs = glyphs;
  }

  @Override
  public Glyph next() {
    Glyph result = null;
    if(hasNext()){
      result = glyphs.get(index);
      index++;
    }
    return result;
  }

  @Override
  public boolean hasNext() {
    return index < glyphs.size();
  }
}
