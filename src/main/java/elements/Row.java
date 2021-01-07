package elements;

import common.Glyph;
import display.Window;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import position.Point;

/**
 * Промежуточный компонент строки
 */
public class Row extends Glyph {

  /**
   * Потомки
   */
  @Getter
  private List<Glyph> childs;

  public Row(){
    childs = new ArrayList<>();
  }

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
  public String draw(Window window) {
    StringBuffer sb = new StringBuffer();
    childs.forEach(child -> sb.append(child.draw(window)));
    return sb.toString();
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
   */
  @Override
  public void insert(Glyph glyph) {
    glyph.setParent(this);
    childs.add(glyph);
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
