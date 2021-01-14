package visitor;

import elements.Char;
import elements.Column;
import elements.Row;

public class GlyphVisitor implements Visitor {

  @Override
  public void visitRow(Row row) {
    System.out.println("Visit Row");
    row.getChilds().forEach(System.out::print);
  }

  @Override
  public void visitChar(Char ch) {
    System.out.println("Visit Char");
    System.out.println(ch);
  }

  @Override
  public void visitColumn(Column column) {
    System.out.println("Visit Column");
    System.out.println(column.getNumber());
  }
}
