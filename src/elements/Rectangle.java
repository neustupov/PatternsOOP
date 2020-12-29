package elements;

import display.Window;
import position.Point;

public class Rectangle implements Glyph {

  private int x0, y0, x1, y1;

  private Glyph parent;

  public Rectangle(int x0, int y0, int x1, int y1) {
    this.x0 = x0;
    this.y0 = y0;
    this.x1 = x1;
    this.y1 = y1;
  }

  @Override
  public void draw(Window window) {
    window.drawRectangle(x0, y0, x1, y1);
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
