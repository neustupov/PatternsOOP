package compose;

import common.Glyph;
import java.util.List;

/**
 * Абстрактный класс алгоритма(стратегии)
 */
abstract class Compositor {

  /**
   * Выполняет алгоритм над полученными от клиента данными
   *
   * @param glyphs Данные для обработки
   */
  abstract List<Glyph> compose(List<Glyph> glyphs);
}
