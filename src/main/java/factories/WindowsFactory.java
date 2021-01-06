package factories;

import factories.elements.button.Button;
import factories.elements.button.WindowsButton;
import factories.elements.menu.Menu;
import factories.elements.menu.WindowsMenu;
import factories.elements.scrollbar.ScrollBar;
import factories.elements.scrollbar.WindowsScrollBar;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WindowsFactory implements GUIFactory {

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
