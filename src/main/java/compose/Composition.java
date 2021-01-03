package compose;

import common.Glyph;
import java.util.List;

/**
 * Композиция компонентов
 */
public class Composition extends Glyph {

  /**
   * Алгоритм композиции - класс стратегии
   */
  private Compositor compositor;

  /**
   * Список компонентов
   */
  private List<Glyph> glyphs;

  public Composition(Compositor compositor) {
    this.compositor = compositor;
  }

  /**
   * Применяет алгоритм композиции компонентов - в агрументах передаем объекты, к которым
   * применяется алгоритм(стратегия)
   */
  public void repair() {
    compositor.compose(glyphs);
  }

  /**
   * Добавляет компоненты в список
   *
   * @param glyph Объект компонента
   * @param index index
   */
  public void insert(Glyph glyph, int index) {
    glyph.setParent(this);
    glyphs.add(index, glyph);
  }
}
