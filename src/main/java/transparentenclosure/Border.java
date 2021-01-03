package transparentenclosure;

import common.Glyph;
import common.MonoGlyph;
import display.Window;

public class Border extends MonoGlyph {

  public Border(Glyph component) {
    super(component);
  }

  @Override
  public void draw(Window window) {
    super.draw(window);
    drawBorder(window);
  }

  private void drawBorder(Window window){}
}
