package transparentenclosure;

import static org.junit.jupiter.api.Assertions.*;

import display.Window;
import elements.Char;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BorderTest {

  private Border border;
  @Spy
  private Window window;

  @BeforeEach
  void setUp() {
    border = new Border(new Char('A', null));
  }

  /**
   * проверяем декоратор
   */
  @Test
  void draw() {
    assertEquals(border.draw(window), "A" + " " + "Draw border");
  }
}