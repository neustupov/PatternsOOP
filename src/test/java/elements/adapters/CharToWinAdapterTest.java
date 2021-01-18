package elements.adapters;

import static org.junit.jupiter.api.Assertions.*;

import display.ApplicationWindow;
import display.Window;
import elements.Char;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Тест адаптера
 */
@ExtendWith(MockitoExtension.class)
class CharToWinAdapterTest {

  private Char adapter;
  @Spy
  private Window parentWindow;
  private ApplicationWindow window;

  @BeforeEach
  void setUp() {
    window = new ApplicationWindow(parentWindow);
    adapter = new CharToWinAdapter('A', null, window);
  }

  @Test
  void draw() {
    assertEquals(adapter.draw(window), "redraw");
  }
}