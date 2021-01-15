package menu;

import command.Command;
import common.Glyph;
import lombok.AllArgsConstructor;

/**
 * Компонент элемента меню - учавствует в паттерне "Команда"
 */
@AllArgsConstructor
public class MenuItem extends Glyph {

  /**
   * Команда меню
   */
  private Command command;

  public String clicked(){
    return command.execute();
  }
}
