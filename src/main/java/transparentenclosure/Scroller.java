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
  public String draw(Window window) {
    return super.draw(window) + " " + drawScroller(window);
  }

  /**
   * ������������ ������ ���������
   *
   * @param window Window
   */
  private String drawScroller(Window window){
    return window.drawScroller();
  }
}
