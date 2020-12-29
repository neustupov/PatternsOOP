package elements;

import display.Window;
import position.Point;

public class Rectangle extends Glyph implements Shape {

  private int x0, y0, x1, y1;

  public Rectangle(int x0, int y0, int x1, int y1) {
    this.x0 = x0;
    this.y0 = y0;
    this.x1 = x1;
    this.y1 = y1;
  }

  public Rectangle() {
  }

  @Override
  void draw(Window window) {
    window.drawRectangle(x0, y0, x1, y1);
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
