package display;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IconWindow extends Window {

  private Window owner;

  @Override
  public String iconify() {
    return owner.iconify();
  }
}
