package menu;

import java.util.List;
import lombok.AllArgsConstructor;

/**
 * Компонент меню - учавствует в паттерне "Команда"
 */
@AllArgsConstructor
public class Menu {

  /**
   * Содержимое меню
   */
  private List<MenuItem> menuItems;

  public void addMenuItem(MenuItem item){
    menuItems.add(item);
  }
}
