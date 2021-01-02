package elements;

import common.Glyph;
import display.Window;
import position.Point;

/**
 * �������� ��������� ��������������
 */
public class Rectangle extends Glyph {

  /**
   * ����������
   */
  private int x0, y0, x1, y1;

  public Rectangle(int x0, int y0, int x1, int y1, Glyph parent) {
    this.x0 = x0;
    this.y0 = y0;
    this.x1 = x1;
    this.y1 = y1;
    super.setParent(parent);
  }

  /**
   * ������������ ���������
   *
   * @param window Window
   */
  @Override
  public void draw(Window window) {
    window.drawRectangle(x0, y0, x1, y1);
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
   * ���������� �������� ����������
   */
  @Override
  public Glyph parent() {
    return super.parent();
  }
}
