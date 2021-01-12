package iterators;

import common.Glyph;

public interface Iterator {

  Glyph next();
  boolean hasNext();
}
