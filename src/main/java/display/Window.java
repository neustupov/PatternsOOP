package display;

import common.Glyph;
import display.impl.WindowImpl;
import display.impl.WindowsImplFactory;
import java.util.Map;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ������ ���������
 */
@NoArgsConstructor
public abstract class Window {

  @Setter
  private Glyph glyph;

  @Setter
  private static WindowImpl windowImpl = WindowsImplFactory.getInstance();

  //������ ���������� ������

  public String redraw(){
    return "redraw";
  }

  public String iconify(){
    return "Iconify";
  }

  public String lower(){
    return "lower";
  }

  //������ ��������� �������

  /**
   * ������ ������
   *
   * @param character ������
   */
  public String drawCharacter(Character character) {
    return windowImpl.deviceChar(character);
  }

  /**
   * ������ �������������
   *
   * @param x0 x0
   * @param y0 y0
   * @param x1 x1
   * @param y1 y1
   */
  public String drawRectangle(int x0, int y0, int x1, int y1) {
    return windowImpl.deviceRect(x0, y0, x1, y1);
  }

  /**
   * ������ �������������
   *
   * @param coords ���� ���������
   * @return ������ � �����������
   */
  public String drawPolygon(Map<Integer, Integer> coords) {
    return windowImpl.devicePoly(coords);
  }

  /**
   * ������ ������
   *
   * @param row ������
   */
  public void drawRow(String row) {
  }

  /**
   * ������ �����
   */
  public String drawBorder() {
    return windowImpl.drawBorder();
  }

  /**
   * ������ ������ ���������
   */
  public String drawScroller() {
    return windowImpl.drawScroller();
  }

  public String draw(){
    return glyph.draw(this);
  }
}
