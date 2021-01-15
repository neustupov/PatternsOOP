package elements;

import common.Glyph;
import display.Window;
import iterators.Iterable;
import iterators.Iterator;
import iterators.ReverseIterator;
import lombok.Getter;
import visitor.Visitor;

/**
 * ��������� �������
 */
@Getter
public class Column extends Glyph implements Iterable {

  /**
   * ���������� �����
   */
  private Integer number;

  /**
   * �������
   */
  private Glyph[] childs;

  public Column(Integer number) {
    this.number = number;
  }

  public Column(Glyph parent, Glyph[] glyphs) {
    super.setParent(parent);
    childs = glyphs;
  }

  public Column(Integer number, Glyph parent, Glyph[] childs) {
    this.number = number;
    super.setParent(parent);
    this.childs = childs;
  }

  /**
   * ������������ ���������
   *
   * @param window Window
   */
  @Override
  public String draw(Window window) {
    StringBuffer sb = new StringBuffer();
    for (Glyph child : childs) {
      sb.append(child.draw(window));
      sb.append(" ");
    }
    return sb.toString();
  }

  /**
   * �������� �������� ��������� �� �������
   *
   * @param glyph ������ ����������
   * @param i ������
   */
  public void insert(Glyph glyph, int i) {
    glyph.setParent(this);
    childs[i] = glyph;
  }

  /**
   * ������� �������� ���������
   *
   * @param glyph ������ ����������
   */
  @Override
  public void remove(Glyph glyph) {
    glyph.setParent(null);
    for (int i = 0; i < childs.length; i++) {
      if (childs[i].equals(glyph)) {
        childs[i] = null;
      }
    }
  }

  /**
   * ���������� �������� ���������
   *
   * @param i ������
   */
  @Override
  public Glyph child(int i) {
    return childs[i];
  }

  /**
   * ���������� �������� ����������
   */
  @Override
  public Glyph parent() {
    return super.parent();
  }

  /**
   * �������� ��������
   *
   * @return ��������
   */
  @Override
  public Iterator iterator() {
    return new ReverseIterator(this.getChilds());
  }

  /**
   * ���������� ������ ������ ��� ����������
   *
   * @param v ��������� ����������
   */
  @Override
  public void accept(Visitor v) {
    v.visitColumn(this);
  }
}
