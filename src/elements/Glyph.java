package elements;

import display.Window;
import position.Point;

interface Glyph {

  void draw(Window window);

  boolean intersects(Point point);

  Glyph parent();
}
