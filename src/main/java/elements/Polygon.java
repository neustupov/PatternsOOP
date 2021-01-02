package elements;

import common.Glyph;
import display.Window;
import position.Point;

/**
 * Конечный компонент многоугольника
 */
public class Polygon extends Glyph {

  public Polygon(Glyph parent) {
    super.setParent(parent);
  }

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
    return super.parent();
  }
}
