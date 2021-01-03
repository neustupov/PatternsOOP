package common;

import display.Window;
import lombok.AllArgsConstructor;

/**
 * Абстрактный класс декоратора
 */
@AllArgsConstructor
public abstract class MonoGlyph extends Glyph {

  /**
   * Декорируемый компонент
   */
  private Glyph component;

  /**
   * Отрисовывает компонент
   *
   * @param window Window
   */
  @Override
  public void draw(Window window) {
    component.draw(window);
  }
}
