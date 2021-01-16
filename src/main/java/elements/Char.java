package elements;

import common.Glyph;
import display.Window;
import lombok.Getter;
import position.Point;
import visitor.Visitor;

/**
 * �������� ��������� �������
 */
public class Char extends Glyph {

  /**
   * ������
   */
  @Getter
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

  /**
   * ���������� ������ ������ ��� ����������
   * @param v ��������� ����������
   */
  @Override
  public void accept(Visitor v) {
    v.visitChar(this);
  }
}
