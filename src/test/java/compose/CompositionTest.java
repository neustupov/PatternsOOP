package compose;

import static org.junit.jupiter.api.Assertions.*;

import common.Glyph;
import elements.Char;
import elements.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Тест патерна "Стратегия"
 */
class CompositionTest {

  private Composition compositionReverse;
  private Composition compositionTex;
  private Compositor reverse;
  private Compositor tex;
  private List<Glyph> glyphs;

  @BeforeEach
  void setUp() {
    tex = new TeXCompositor();
    reverse = new ReverseCompositor();
    compositionReverse = new Composition(reverse);
    compositionTex = new Composition(tex);
    glyphs = Arrays.asList(new Char('A', null),
        new Char('B', null),
        new Rectangle(1,2,3,4, null));
  }

  /**
   * Проверяем корректность работы стратегий
   */
  @Test
  void repair() {
    compositionReverse.setGlyphs(glyphs);
    List<Glyph> reversedCollection = new ArrayList<>(glyphs);
    Collections.reverse(reversedCollection);
    assertEquals(compositionReverse.repair(), reversedCollection);

    compositionTex.setGlyphs(glyphs);
    assertEquals(2, compositionTex.repair().size());
  }

  @Test
  void insert() {
  }
}