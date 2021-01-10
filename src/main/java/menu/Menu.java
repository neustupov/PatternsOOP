package menu;

import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Menu {

  private List<MenuItem> menuItems;

  public void addMenuItem(MenuItem item){
    menuItems.add(item);
  }
}
