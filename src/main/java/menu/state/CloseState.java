package menu.state;

public class CloseState implements State {

  private final String NAME = "C lose State";

  @Override
  public String getName() {
    return null;
  }

  @Override
  public String open(StateContext context) {
    context.setState(new BlurState());
    return "set Blur State";
  }

  @Override
  public String close(StateContext context) {
    return "Nothing happens";
  }
}
