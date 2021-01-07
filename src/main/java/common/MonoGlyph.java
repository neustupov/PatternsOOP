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
  public String draw(Window window) {
    return component.draw(window);
  }
}
