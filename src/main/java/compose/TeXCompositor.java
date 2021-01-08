package compose;

import common.Glyph;
import elements.Char;
import java.util.List;
import java.util.stream.Collectors;
import lombok.NoArgsConstructor;

/**
 * Алгоритм(стратегия) композиции текста - проверяем, что в глифах - экземпляры класса Char -
 * иное удаляем из списка
 */
@NoArgsConstructor
public class TeXCompositor extends Compositor {

  /**
   * Реализуем алгоритм композиции
   *
   * @param glyphs Данные для обработки
   */
  @Override
  List<Glyph> compose(List<Glyph> glyphs) {
    return glyphs.stream().filter(glyph -> glyph instanceof Char).collect(Collectors.toList());
  }
}
