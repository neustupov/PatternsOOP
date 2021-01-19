package visitor;

import static org.junit.jupiter.api.Assertions.*;

import elements.Char;
import elements.Row;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Тест "посетителя"
 */
class GlyphVisitorTest {

  private Char ch1;
  private Char ch2;
  private Row row;
  private Visitor visitor;

  @BeforeEach
  void setUp() {
    ch1 = new Char('A', null);
    ch2 = new Char('B', null);
    row = new Row();
    row.insert(ch1);
    row.insert(ch2);
    visitor = new GlyphVisitor();
  }

  @Test
  void visitRow() {
    row.accept(visitor);
    assertEquals(visitor.getState(), "AB");
  }
}