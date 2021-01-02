package elements;

import common.Glyph;
import display.Window;
import position.Point;

/**
 * �������� ��������� ��������������
 */
public class Polygon extends Glyph {

  public Polygon(Glyph parent) {
    super.setParent(parent);
  }

  /**
   * ������������ ���������
   *
   * @param window Window
   */
  @Override
  public void draw(Window window) {
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
