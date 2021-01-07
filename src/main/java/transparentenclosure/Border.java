package transparentenclosure;

import common.Glyph;
import common.MonoGlyph;
import display.Window;

/**
 * ��������� �����
 */
public class Border extends MonoGlyph {

  public Border(Glyph component) {
    super(component);
  }

  /**
   * ��������� ���� ���������� � �������� ��������� ����������
   *
   * @param window Window
   */
  @Override
  public String draw(Window window) {
    return super.draw(window) + " " + drawBorder(window);
  }

  /**
   * ������������ �����
   *
   * @param window Window
   */
  private String drawBorder(Window window) {
    return window.drawBorder();
  }
}
