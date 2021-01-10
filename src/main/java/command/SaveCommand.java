package command;

public class SaveCommand implements Command{

  @Override
  public String execute() {
    return "Doc save";
  }

  @Override
  public String unexecute() {
    return null;
  }

  @Override
  public boolean reversible() {
    return false;
  }
}
