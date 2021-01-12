package iterators;

import common.Glyph;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PreorderIterator implements Iterator {

  private Glyph glyph;

  @Override
  public Glyph next() {
    return null;
  }

  @Override
  public boolean hasNext() {
    return false;
  }
}
