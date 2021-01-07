package elements;

import common.Glyph;
import display.Window;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import position.Point;

/**
 * Конечный компонент многоугольника
 */
public class Polygon extends Glyph {

  private Map<Integer, Integer> coords = new HashMap<>();

  public Polygon(Glyph parent) {
    super.setParent(parent);
  }

  public Polygon(Glyph parent, Map<Integer, Integer> coords) {
    super.setParent(parent);
    this.coords = coords;
  }

  /**
   * Отрисовывает компонент
   *
   * @param window Window
   */
  @Override
  public String draw(Window window) {
    return window.drawPolygon(coords);
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
