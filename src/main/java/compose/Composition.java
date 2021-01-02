package compose;

import common.Glyph;
import java.util.List;

public class Composition extends Glyph {

  private Compositor compositor;

  private List<Glyph> glyphs;

  public Composition(Compositor compositor) {
    this.compositor = compositor;
  }

  public void repair(){
    compositor.compose(glyphs);
  }

  public void insert(Glyph glyph, int index){
    glyph.setParent(this);
    glyphs.add(index, glyph);
  }
}
