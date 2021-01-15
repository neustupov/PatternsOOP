package visitor;

import elements.Char;
import elements.Column;
import elements.Row;

/**
 * Компонент посетителя - учавствует в паттерне "Посетитель"
 */
public class GlyphVisitor implements Visitor {

  /**
   * Обход строки
   *
   * @param row Строка
   */
  @Override
  public void visitRow(Row row) {
    System.out.println("Visit Row");
    row.getChilds().forEach(System.out::print);
  }

  /**
   * Обход символа
   *
   * @param ch Символ
   */
  @Override
  public void visitChar(Char ch) {
    System.out.println("Visit Char");
    System.out.println(ch);
  }

  /**
   * Обход столбца
   *
   * @param column Столбец
   */
  @Override
  public void visitColumn(Column column) {
    System.out.println("Visit Column");
    System.out.println(column.getNumber());
  }
}
