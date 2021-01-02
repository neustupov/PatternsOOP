package elements;

import common.Glyph;
import display.Window;
import java.util.ArrayList;
import java.util.List;
import position.Point;

/**
 * ������������� ��������� ������
 */
public class Row extends Glyph {

  /**
   * �������
   */
  private List<Glyph> childs;

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
  public void draw(Window window) {
    childs.forEach(child -> child.draw(window));
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
}
