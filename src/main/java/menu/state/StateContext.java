package menu.state;

import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class StateContext {

  @Setter
  private State state;

  public String open() {
    return state.open(this);
  }

  public String close() {
    return state.close(this);
  }
}
