package elements;

import common.
    Glyph;
import display.Window;
import position.Point;

/**
 * �������� ��������� �������
 */
public class Char extends Glyph {

  /**
   * ������
   */
  private Character character;

  public Char(Character character, Glyph parent) {
    this.character = character;
    super.setParent(parent);
  }

  /**
   * ������������ ���������
   *
   * @param window Window
   */
  @Override
  public String draw(Window window) {
    return window.drawCharacter(character);
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
