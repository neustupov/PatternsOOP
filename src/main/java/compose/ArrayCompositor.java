package compose;

import common.Glyph;
import java.util.List;
import lombok.NoArgsConstructor;

/**
 * Алгоритм(стратегия) композиции массивов
 */
@NoArgsConstructor
public class ArrayCompositor extends Compositor {

  /**
   * Реализуем алгоритм композиции
   *
   * @param glyphs Данные для обработки
   */
  @Override
  void compose(List<Glyph> glyphs) {
  }
}
