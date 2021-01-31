package menu.state;

public interface State {

  String getName();
  String open(StateContext context);
  String close(StateContext context);

}
