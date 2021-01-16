package visitor;

import elements.Char;
import elements.Column;
import elements.Row;
import lombok.Getter;

/**
 * ��������� ���������� - ���������� � �������� "����������"
 */
public class GlyphVisitor implements Visitor {

  @Getter
  private String allSymbolsInRow = "";

  /**
   * ����� ������
   *
   * @param row ������
   */
  @Override
  public void visitRow(Row row) {
    System.out.println("Visit Row");
  }

  /**
   * ����� �������
   *
   * @param ch ������
   */
  @Override
  public void visitChar(Char ch) {
    System.out.println("Visit Char");
    this.allSymbolsInRow += ch.getCharacter().toString();
  }

  /**
   * ����� �������
   *
   * @param column �������
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
