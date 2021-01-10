package command;

public class QuitCommand implements Command{

  @Override
  public String execute() {
    SaveCommand saveCommand = new SaveCommand();
    return saveCommand.execute() + " and exit from App";
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
