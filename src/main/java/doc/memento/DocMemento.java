package doc.memento;

import lombok.Builder;
import lombok.Getter;

/**
 * Хранитель для класса Document
 */
@Builder
public class DocMemento {

  /**
   * Шрифт
   */
  @Getter
  private String font;
  /**
   * Содержимое
   */
  @Getter
  private String symbols;
}
