package elements;

import static org.junit.jupiter.api.Assertions.*;

import common.Glyph;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RowTest {

  private Row row;
  private Glyph glyph;

  @BeforeEach
  void setUp() {
    row = new Row();
    glyph = new Char('A', null);
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
}