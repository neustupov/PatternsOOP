package elements;

import display.Window;
import lombok.AllArgsConstructor;
import lombok.Setter;
import position.Point;

/**
 * �������� ��������� ��������������
 */
@AllArgsConstructor
public class Rectangle implements Glyph {

  /**
   * ����������
   */
  private int x0, y0, x1, y1;

  /**
   * ��������
   */
  @Setter
  private Glyph parent;

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
    return parent;
  }
}
