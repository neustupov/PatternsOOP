package command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PasteCommand implements Command {

  private String buffer;

  @Override
  public String execute() {
    return buffer + " paste in Doc";
  }

  @Override
  public String unexecute() {
    return buffer + " delete from Doc";
  }

  @Override
  public boolean reversible() {
    return true;
  }
}
