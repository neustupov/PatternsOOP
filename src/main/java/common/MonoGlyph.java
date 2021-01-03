package common;

import display.Window;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class MonoGlyph extends Glyph{

  private Glyph component;

  @Override
  public void draw(Window window) {
    component.draw(window);
  }
}
