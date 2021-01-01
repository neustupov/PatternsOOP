package elements;

import display.Window;
import lombok.AllArgsConstructor;
import lombok.Setter;
import position.Point;

/**
 * Конечный компонент прямоугольника
 */
@AllArgsConstructor
public class Rectangle implements Glyph {

  /**
   * Координаты
   */
  private int x0, y0, x1, y1;

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
    return parent;
  }
}
