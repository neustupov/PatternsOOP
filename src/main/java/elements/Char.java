package elements;

import display.Window;
import lombok.AllArgsConstructor;
import lombok.Setter;
import position.Point;

/**
 * �������� ��������� �������
 */
@AllArgsConstructor
public class Char implements Glyph {

  /**
   * ������
   */
  private Character character;

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
    window.drawCharacter(character);
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
