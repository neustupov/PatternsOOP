package visitor;

import elements.Char;
import elements.Column;
import elements.Row;

public interface Visitor {

  void visitRow(Row row);
  void visitChar(Char ch);
  void visitColumn(Column column);
}
