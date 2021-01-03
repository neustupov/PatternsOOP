package transparentenclosure;

import common.Glyph;
import common.MonoGlyph;
import display.Window;

/**
 * ��������� ���������
 */
public class Scroller extends MonoGlyph {

  public Scroller(Glyph component) {
    super(component);
  }

  /**
   * ��������� ���� ���������� � �������� ��������� ����������
   *
   * @param window Window
   */
  @Override
  public void draw(Window window) {
    super.draw(window);
    drawScroller(window);
  }

  /**
   * ������������ ������ ���������
   *
   * @param window Window
   */
  private void drawScroller(Window window){}
}
