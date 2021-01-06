import static org.junit.jupiter.api.Assertions.*;

import factories.GUIFactory;
import factories.GUIFactorySingleton;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void checkComponents() {
    GUIFactory factory = GUIFactorySingleton.getInstance();

    assertEquals(factory.getButton().press(), "WindowsButton");
    assertEquals(factory.getMenu().popup(), "WindowsMenu");
    assertEquals(factory.getScrollBar().scrollTo(), "WindowsScrollBar");
  }

  @Test
  void checkSingleton() {
    GUIFactory factoryOne = GUIFactorySingleton.getInstance();
    GUIFactory factoryTwo = GUIFactorySingleton.getInstance();

    assertEquals(factoryOne.hashCode(), factoryTwo.hashCode());
  }
}