package elements;

import display.Window;
import position.Point;

public class Char implements Glyph {

  private Character character;
  private Glyph parent;

  public Char(Character character) {
    this.character = character;
  }

  @Override
  public void draw(Window window) {
    window.drawCharacter(character);
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
