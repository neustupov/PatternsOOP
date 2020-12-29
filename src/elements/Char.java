package elements;

import display.Window;
import position.Point;

public class Char extends Glyph implements Shape {

  private Character character;

  public Char(Character character) {
    this.character = character;
  }

  @Override
  void draw(Window window) {
    window.drawCharacter(character);
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
