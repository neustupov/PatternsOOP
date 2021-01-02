package compose;

import common.Glyph;
import java.util.List;

abstract class Compositor {

  abstract void compose(List<Glyph> glyphs);
}
