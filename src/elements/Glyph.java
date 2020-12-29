package elements;

import display.Window;
import position.Point;

public abstract class Glyph {

  abstract void draw(Window window);
  abstract void bounds(Shape shape);

  abstract boolean intersects(Point point);

  abstract void insert(Glyph glyph, int i);
  abstract void remove(Glyph glyph);
  abstract Glyph child(int i);
  abstract Glyph parent();
}
