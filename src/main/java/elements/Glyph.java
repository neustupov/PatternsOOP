package elements;

import display.Window;
import position.Point;

/**
 * ������������ ��������� ���������
 */
interface Glyph {

  /**
   * ������������ ���������
   *
   * @param window Window
   */
  default void draw(Window window) {
    throw new UnsupportedOperationException();
  }

  /**
   * �������
   *
   * @param glyph ������ ����������
   */
  default void bounds(Glyph glyph) {
    throw new UnsupportedOperationException();
  }

  /**
   * ����������� �����������
   *
   * @param point Point
   */
  default boolean intersects(Point point) {
    throw new UnsupportedOperationException();
  }

  /**
   * �������� �������� ��������� �� �������
   *
   * @param glyph ������ ����������
   * @param i ������
   */
  default void insert(Glyph glyph, int i) {
    throw new UnsupportedOperationException();
  }

  /**
   * ������� �������� ���������
   *
   * @param glyph ������ ����������
   */
  default void remove(Glyph glyph) {
    throw new UnsupportedOperationException();
  }

  /**
   * ���������� �������� ���������
   *
   * @param i ������
   */
  default Glyph child(int i) {
    throw new UnsupportedOperationException();
  }

  /**
   * ���������� �������� ����������
   */
  default Glyph parent() {
    throw new UnsupportedOperationException();
  }
}
