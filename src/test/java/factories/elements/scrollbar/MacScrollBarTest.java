package factories.elements.scrollbar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MacScrollBarTest {

  private MacScrollBar macScrollBar;

  @BeforeEach
  void setUp() {
    macScrollBar = new MacScrollBar();
    Random rand = new Random(47);
    macScrollBar.setRandomScrollPoint(rand.nextInt());
  }

  /**
   * Проверка прототипа и клонирования объекта
   */
  @Test
  void cloneTest() {
    ScrollBar cloneScrollBar = macScrollBar.clone();
    assertEquals(macScrollBar.getRandomScrollPoint(), cloneScrollBar.getRandomScrollPoint());
  }
}