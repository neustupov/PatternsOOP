package command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FontCommand implements Command{

  private String oldFont;
  private String newFont;

  @Override
  public String execute() {
    oldFont = newFont;
    return "Doc rewrite with font: " + newFont;
  }

  @Override
  public String unexecute() {
    return "Return font: " + oldFont + " in Doc";
  }

  @Override
  public boolean reversible() {
    return true;
  }
}
