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

  @Test
  void insert() {
    row.insert(glyph, 0);
    assertEquals(row.child(0).parent(), row);
  }
}