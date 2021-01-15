package visitor;

import elements.Char;
import elements.Column;
import elements.Row;

/**
 * �������� ��������� "����������" - ���������� � �������� "����������"
 */
public interface Visitor {

  /**
   * ����� ������
   *
   * @param row ������
   */
  void visitRow(Row row);

  /**
   * ����� �������
   *
   * @param ch ������
   */
  void visitChar(Char ch);

  /**
   * ����� �������
   *
   * @param column �������
   */
  void visitColumn(Column column);
}
