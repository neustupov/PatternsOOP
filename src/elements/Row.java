package elements;

import display.Window;
import position.Point;

public class Row extends Glyph implements Shape {

  @Override
  void draw(Window window) {

  }

  @Override
  void bounds(Shape shape) {

  }

  @Override
  boolean intersects(Point point) {
    return false;
  }

  @Override
  void insert(Glyph glyph, int i) {

  }

  @Override
  void remove(Glyph glyph) {

  }

  @Override
  Glyph child(int i) {
    return null;
  }

  @Override
  Glyph parent() {
    return null;
  }
}
