package display;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DialogWindow extends Window {

  private Window owner;

  @Override
  public String lower() {
    return owner.lower();
  }
}
