package compose;

import common.Glyph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lombok.NoArgsConstructor;

/**
 * Алгоритм(стратегия) композиции - реверс списка
 */
@NoArgsConstructor
public class ReverseCompositor extends Compositor {

  /**
   * Реализуем алгоритм композиции - разворачиваем список
   *
   * @param glyphs Данные для обработки
   */
  @Override
  List<Glyph> compose(List<Glyph> glyphs) {
    List<Glyph> result = new ArrayList<>(glyphs);
    Collections.reverse(result);
    return result;
  }
}
