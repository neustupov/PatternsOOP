package factories;

import factories.elements.button.Button;
import factories.elements.menu.Menu;
import factories.elements.scrollbar.ScrollBar;

public interface GUIFactory {

  Button getButton();

  Menu getMenu();

  ScrollBar getScrollBar();
}
