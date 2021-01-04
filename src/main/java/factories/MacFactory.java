package factories;

import factories.elements.button.Button;
import factories.elements.button.MacButton;
import factories.elements.menu.MacMenu;
import factories.elements.menu.Menu;
import factories.elements.scrollbar.MacScrollBar;
import factories.elements.scrollbar.ScrollBar;

public class MacFactory implements GUIFactory {

  private static volatile MacFactory instance = null;

  private MacFactory() {

  }

  public static MacFactory getInstance() {
    if (instance == null) {
      synchronized(MacFactory.class) {
        if (instance == null) {
          instance = new MacFactory();
        }
      }
    }
    return instance;
  }

  public Button getButton(){
    return new MacButton();
  }

  public Menu getMenu(){
    return new MacMenu();
  }

  public ScrollBar getScrollBar(){
    return new MacScrollBar();
  }
}
