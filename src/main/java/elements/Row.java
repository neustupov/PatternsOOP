package elements;

import common.Glyph;
import display.Window;
import java.util.ArrayList;
import java.util.List;
import position.Point;

/**
 * Промежуточный компонент строки
 */
public class Row extends Glyph {

  /**
   * Потомки
   */
  private List<Glyph> childs;

  public Row(Glyph parent) {
    super.setParent(parent);
    childs = new ArrayList<>();
  }

  /**
   * Отрисовывает компонент
   *
   * @param window Window
   */
  @Override
  public void draw(Window window) {
    childs.forEach(child -> child.draw(window));
  }

  /**
   * Границы
   *
   * @param glyph Объект компонента
   */
  @Override
  public void bounds(Glyph glyph) {

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
   * Добавить дочерний компонент по индексу
   *
   * @param glyph Объект компонента
   * @param i Индекс
   */
  @Override
  public void insert(Glyph glyph, int i) {
    glyph.setParent(this);
    childs.add(i, glyph);
  }

  /**
   * Удалить дочерний компонент
   *
   * @param glyph Объект компонента
   */
  @Override
  public void remove(Glyph glyph) {
    glyph.setParent(null);
    childs.remove(glyph);
  }

  /**
   * Возвращает дочерний компонент
   *
   * @param i Индекс
   */
  @Override
  public Glyph child(int i) {
    return childs.get(i);
  }

  /**
   * Возвращает родителя компонента
   */
  @Override
  public Glyph parent() {
    return super.parent();
  }
}
