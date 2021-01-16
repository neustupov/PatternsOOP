package elements;

import common.Glyph;
import display.Window;
import iterators.Iterable;
import iterators.Iterator;
import iterators.ListIterator;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import position.Point;
import visitor.Visitor;

/**
 * ������������� ��������� ������
 */
public class Row extends Glyph implements Iterable {

  /**
   * �������
   */
  @Getter
  private List<Glyph> childs;

  public Row() {
    childs = new ArrayList<>();
  }

  public Row(Glyph parent) {
    super.setParent(parent);
    childs = new ArrayList<>();
  }

  /**
   * ������������ ���������
   *
   * @param window Window
   */
  @Override
  public String draw(Window window) {
    StringBuffer sb = new StringBuffer();
    childs.forEach(child -> {
      sb.append(child.draw(window));
      sb.append(" ");
    });
    return sb.toString();
  }

  /**
   * �������
   *
   * @param glyph ������ ����������
   */
  @Override
  public void bounds(Glyph glyph) {

  }

  /**
   * ����������� �����������
   *
   * @param point Point
   */
  @Override
  public boolean intersects(Point point) {
    return false;
  }

  /**
   * �������� �������� ��������� �� �������
   *
   * @param glyph ������ ����������
   */
  @Override
  public void insert(Glyph glyph) {
    glyph.setParent(this);
    childs.add(glyph);
  }

  /**
   * �������� �������� ��������� �� �������
   *
   * @param glyph ������ ����������
   * @param i ������
   */
  @Override
  public void insert(Glyph glyph, int i) {
    glyph.setParent(this);
    childs.add(i, glyph);
  }

  /**
   * ������� �������� ���������
   *
   * @param glyph ������ ����������
   */
  @Override
  public void remove(Glyph glyph) {
    glyph.setParent(null);
    childs.remove(glyph);
  }

  /**
   * ���������� �������� ���������
   *
   * @param i ������
   */
  @Override
  public Glyph child(int i) {
    return childs.get(i);
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
    return new ListIterator(this.getChilds());
  }

  /**
   * ���������� ������ ������ ��� ����������
   * @param v ��������� ����������
   */
  @Override
  public void accept(Visitor v) {
    getChilds().forEach(child -> v.visitChar((Char) child));
  }
}
