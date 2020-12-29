package elements;

import display.Window;
import java.util.ArrayList;
import java.util.List;
import position.Point;

public class Row extends Glyph implements Shape {

  private Glyph parent;
  private List<Glyph> childs = new ArrayList<>();

  public Row(String string) {
    for(Character ch : string.toCharArray()){
      childs.add(new Char(ch));
    }
  }

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
    childs.add(i, glyph);
  }

  @Override
  void remove(Glyph glyph) {
    childs.remove(glyph);
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
