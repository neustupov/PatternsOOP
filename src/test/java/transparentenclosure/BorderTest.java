package transparentenclosure;

import static org.junit.jupiter.api.Assertions.*;

import display.ApplicationWindow;
import display.Window;
import elements.Char;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Тест патерна "Декоратор"
 */
class BorderTest {

  private Border border;
  private Window window;

  @BeforeEach
  void setUp() {
    window = new ApplicationWindow(null);
    border = new Border(new Char('A', null));
  }

  /**
   * проверяем декоратор
   */
  @Test
  void draw() {
    assertEquals(border.draw(window), "A WinWindowImpl Draw WinWindowImpl border");
  }
}