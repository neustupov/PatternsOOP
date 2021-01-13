package iterators;

import static org.junit.jupiter.api.Assertions.*;

import common.Glyph;
import elements.Column;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseIteratorTest {

  private Column parentColumn;

  @BeforeEach
  void setUp() {
    parentColumn = new Column(100, null, new Glyph[3]);
    for(int i =0; i < 3; i++){
      parentColumn.insert(new Column(i), i);
    }
  }

  @Test
  void next() {
    Glyph gl = parentColumn.getChilds()[2];
    assertEquals(parentColumn.iterator().next(), gl);
  }

  @Test
  void hasNext() {
    assertTrue(parentColumn.iterator().hasNext());
  }
}