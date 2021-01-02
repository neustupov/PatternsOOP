package elements;

import common.Glyph;
import display.Window;
import position.Point;

/**
 * Конечный компонент прямоугольника
 */
public class Rectangle extends Glyph {

  /**
   * Координаты
   */
  private int x0, y0, x1, y1;

  public Rectangle(int x0, int y0, int x1, int y1, Glyph parent) {
    this.x0 = x0;
    this.y0 = y0;
    this.x1 = x1;
    this.y1 = y1;
    super.setParent(parent);
  }

  /**
   * Отрисовывает компонент
   *
   * @param window Window
   */
  @Override
  public void draw(Window window) {
    window.drawRectangle(x0, y0, x1, y1);
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
