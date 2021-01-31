package menu.state;

public class OpenState implements State {

  private final String NAME = "Open State";

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public String open(StateContext context) {
    return "Nothing happens";
  }

  @Override
  public String close(StateContext context) {
    context.setState(new BlurState());
    return "set Blur State";
  }
}
