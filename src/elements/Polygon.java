package elements;

import display.Window;
import position.Point;

public class Polygon implements Glyph {

  private Glyph parent;

  @Override
  public void draw(Window window) {

  }

  @Override
  public boolean intersects(Point point) {
    return false;
  }

  @Override
  public Glyph parent() {
    return parent;
  }

  public void setParent(Glyph parent) {
    this.parent = parent;
  }
}
