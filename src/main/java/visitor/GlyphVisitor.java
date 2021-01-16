package visitor;

import elements.Char;
import elements.Column;
import elements.Row;
import lombok.Getter;

/**
 * Компонент посетителя - учавствует в паттерне "Посетитель"
 */
public class GlyphVisitor implements Visitor {

  @Getter
  private String allSymbolsInRow = "";

  /**
   * Обход строки
   *
   * @param row Строка
   */
  @Override
  public void visitRow(Row row) {
    System.out.println("Visit Row");
  }

  /**
   * Обход символа
   *
   * @param ch Символ
   */
  @Override
  public void visitChar(Char ch) {
    System.out.println("Visit Char");
    this.allSymbolsInRow += ch.getCharacter().toString();
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

  @Override
  public Object getState() {
    return getAllSymbolsInRow();
  }
}
