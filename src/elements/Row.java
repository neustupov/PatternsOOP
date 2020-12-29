package elements;

import display.Window;
import java.util.ArrayList;
import java.util.List;
import position.Point;

public class Row implements Glyph {

  private String row;

  private Glyph parent;
  private List<Glyph> childs = new ArrayList<>();

  public Row(String row) {
    this.row = row;
  }

  @Override
  public void draw(Window window) {
    window.drawRow(row);
    childs.forEach(child -> child.draw(window));
  }

  public void bounds(Glyph glyph) {

  }

  @Override
  public boolean intersects(Point point) {
    return false;
  }

  public void insert(Glyph glyph, int i) {
    childs.add(i, glyph);
  }

  public void remove(Glyph glyph) {
    childs.remove(glyph);
  }

  public Glyph child(int i) {
    return childs.get(i);
  }

  @Override
  public Glyph parent() {
    return parent;
  }

  public void setParent(Glyph parent) {
    this.parent = parent;
  }
}
