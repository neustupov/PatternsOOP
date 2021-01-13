package common;

import display.Window;
import lombok.Setter;
import position.Point;

/**
 * ������������ ��������� ���������
 */
public abstract class Glyph {

  @Setter
  private Glyph parent;

  /**
   * ������������ ���������
   *
   * @param window Window
   */
  public String draw(Window window) {
    throw new UnsupportedOperationException();
  }

  /**
   * �������
   *
   * @param glyph ������ ����������
   */
  public void bounds(Glyph glyph) {
    throw new UnsupportedOperationException();
  }

  /**
   * ����������� �����������
   *
   * @param point Point
   */
  public boolean intersects(Point point) {
    throw new UnsupportedOperationException();
  }

  /**
   * �������� �������� ���������
   *
   * @param glyph ������ ����������
   */
  public void insert(Glyph glyph) {
    throw new UnsupportedOperationException();
  }

  /**
   * �������� �������� ��������� �� �������
   *
   * @param glyph ������ ����������
   * @param i ������
   */
  public void insert(Glyph glyph, int i) {
    throw new UnsupportedOperationException();
  }

  /**
   * ������� �������� ���������
   *
   * @param glyph ������ ����������
   */
  public void remove(Glyph glyph) {
    throw new UnsupportedOperationException();
  }

  /**
   * ���������� �������� ���������
   *
   * @param i ������
   */
  public Glyph child(int i) {
    throw new UnsupportedOperationException();
  }

  /**
   * ���������� �������� ����������
   */
  public Glyph parent() {
    return this.parent;
  }
}
