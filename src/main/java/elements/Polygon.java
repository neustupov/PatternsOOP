package elements;

import display.Window;
import lombok.AllArgsConstructor;
import lombok.Setter;
import position.Point;

/**
 * Конечный компонент многоугольника
 */
@AllArgsConstructor
public class Polygon implements Glyph {

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
