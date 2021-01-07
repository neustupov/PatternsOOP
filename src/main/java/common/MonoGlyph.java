package common;

import display.Window;
import lombok.AllArgsConstructor;

/**
 * ����������� ����� ����������
 */
@AllArgsConstructor
public abstract class MonoGlyph extends Glyph {

  /**
   * ������������ ���������
   */
  private Glyph component;

  /**
   * ������������ ���������
   *
   * @param window Window
   */
  @Override
  public String draw(Window window) {
    return component.draw(window);
  }
}
