package menu;

import command.Command;
import common.Glyph;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MenuItem extends Glyph {

  private Command command;

  public String clicked(){
    return command.execute();
  }
}
