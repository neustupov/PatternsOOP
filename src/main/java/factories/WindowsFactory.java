package factories;

import factories.elements.button.Button;
import factories.elements.button.WindowsButton;
import factories.elements.menu.Menu;
import factories.elements.menu.WindowsMenu;
import factories.elements.scrollbar.ScrollBar;
import factories.elements.scrollbar.WindowsScrollBar;

public class WindowsFactory implements GUIFactory {

  private static volatile WindowsFactory instance = null;

  private WindowsFactory() {

  }

  public static WindowsFactory getInstance() {
    if (instance == null) {
      synchronized(WindowsFactory.class) {
        if (instance == null) {
          instance = new WindowsFactory();
        }
      }
    }
    return instance;
  }

  public Button getButton(){
    return new WindowsButton();
  }

  public Menu getMenu(){
    return new WindowsMenu();
  }

  public ScrollBar getScrollBar(){
    return new WindowsScrollBar();
  }
}
