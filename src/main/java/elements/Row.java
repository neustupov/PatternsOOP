package elements;

import display.Window;
import java.util.ArrayList;
import java.util.List;
import position.Point;

/**
 * ������������� ��������� ������
 */
public class Row implements Glyph {

  /**
   * ������
   */
  private String row;

  /**
   * ��������
   */
  private Glyph parent;

  /**
   * �������
   */
  private List<Glyph> childs = new ArrayList<>();

  public Row(String row) {
    this.row = row;
  }

  /**
   * ������������ ���������
   *
   * @param window Window
   */
  @Override
  public void draw(Window window) {
    window.drawRow(row);
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
    childs.add(i, glyph);
  }

  /**
   * ������� �������� ���������
   *
   * @param glyph ������ ����������
   */
  @Override
  public void remove(Glyph glyph) {
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
    return parent;
  }

  public void setParent(Glyph parent) {
    this.parent = parent;
  }
}
