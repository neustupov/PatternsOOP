package iterators;

import common.Glyph;

/**
 * ќсновной интерфейс итератора
 */
public interface Iterator {

  /**
   * —ледующий Ёлемент
   *
   * @return Ёлемент
   */
  Glyph next();

  /**
   * Ќаличие следующего элемента
   *
   * @return boolean
   */
  boolean hasNext();
}
