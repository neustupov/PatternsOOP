package transparentenclosure;

import static org.junit.jupiter.api.Assertions.*;

import display.ApplicationWindow;
import display.Window;
import display.impl.MacWindowImpl;
import display.impl.WindowImpl;
import elements.Char;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BorderTest {

  private Border border;
  private Window window;
  private WindowImpl windowImpl;

  @BeforeEach
  void setUp() {
    window = new ApplicationWindow(null);
    windowImpl = new MacWindowImpl();
    window.setWindowImpl(windowImpl);
    border = new Border(new Char('A', null));
  }

  /**
   * проверяем декоратор
   */
  @Test
  void draw() {
    assertEquals(border.draw(window), "A MacWindowImpl Draw MacWindowImpl border");
  }
}