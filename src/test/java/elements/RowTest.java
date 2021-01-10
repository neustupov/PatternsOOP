package elements;

import static org.junit.jupiter.api.Assertions.*;

import common.Glyph;
import display.ApplicationWindow;
import display.Window;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;

class RowTest {

  private Row row;
  @Spy
  private Window window;
  private Glyph glyph;
  private Glyph glyph1;

  @BeforeEach
  void setUp() {
    row = new Row();
    glyph = new Char('A', null);
    glyph1 = new Char('B', null);
    window = new ApplicationWindow(null);
  }

  /**
   * Проверяем правильность простановки родителя у дочернего компонента при добавлении в список к
   * родителю
   */
  @Test
  void insert() {
    row.insert(glyph, 0);
    assertTrue(row.getChilds().size() > 0);
    assertEquals(row.child(0).parent(), row);
  }

  @Test
  void draw() {
    row.insert(glyph);
    row.insert(glyph1);
    assertEquals(row.draw(window), "A WinWindowImpl B WinWindowImpl ");
  }
}