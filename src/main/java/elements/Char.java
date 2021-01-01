package elements;

import display.Window;
import lombok.AllArgsConstructor;
import lombok.Setter;
import position.Point;

/**
 * Конечный компонент символа
 */
@AllArgsConstructor
public class Char implements Glyph {

  /**
   * Символ
   */
  private Character character;

  /**
   * Родитель
   */
  @Setter
  private Glyph parent;

  /**
   * Отрисовывает компонент
   *
   * @param window Window
   */
  @Override
  public void draw(Window window) {
    window.drawCharacter(character);
  }

  /**
   * Пересечения компонентов
   *
   * @param point Point
   */
  @Override
  public boolean intersects(Point point) {
    return false;
  }

  /**
   * Возвращает родителя компонента
   */
  @Override
  public Glyph parent() {
    return parent;
  }
}
