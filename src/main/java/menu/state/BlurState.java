package menu.state;

public class BlurState implements State {

  private final String NAME = "Blur State";

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public String open(StateContext context) {
    context.setState(new OpenState());
    return "set Open State";
  }

  @Override
  public String close(StateContext context) {
    context.setState(new CloseState());
    return "set Close State";
  }
}
