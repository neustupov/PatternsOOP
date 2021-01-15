package visitor;

import elements.Char;
import elements.Column;
import elements.Row;

/**
 * Основной интерфейс "посетителя" - учавствует в паттерне "Посетитель"
 */
public interface Visitor {

  /**
   * Обход строки
   *
   * @param row Строка
   */
  void visitRow(Row row);

  /**
   * Обход символа
   *
   * @param ch Символ
   */
  void visitChar(Char ch);

  /**
   * Обход столбца
   *
   * @param column Столбец
   */
  void visitColumn(Column column);
}
