package compose;

import common.Glyph;
import java.util.List;
import lombok.Getter;

public class Composition extends Glyph {

  private Compositor compositor;

  @Getter
  private List<Glyph> childs;

  public void insert(Glyph glyph, int index){
    compositor.compose();
  }

}
