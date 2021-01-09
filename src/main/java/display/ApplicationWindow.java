package display;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ApplicationWindow extends Window {

  private Window owner;

  @Override
  public String redraw() {
    return owner.redraw();
  }
}
