package common;

import display.Window;
import lombok.Setter;
import position.Point;

/**
 * Родительский интерфейс элементов
 */
public abstract class Glyph {

  @Setter
  private Glyph parent;

  /**
   * Отрисовывает компонент
   *
   * @param window Window
   */
  public String draw(Window window) {
    throw new UnsupportedOperationException();
  }

  /**
   * Границы
   *
   * @param glyph Объект компонента
   */
  public void bounds(Glyph glyph) {
    throw new UnsupportedOperationException();
  }

  /**
   * Пересечения компонентов
   *
   * @param point Point
   */
  public boolean intersects(Point point) {
    throw new UnsupportedOperationException();
  }

  /**
   * Добавить дочерний компонент
   *
   * @param glyph Объект компонента
   */
  public void insert(Glyph glyph) {
    throw new UnsupportedOperationException();
  }

  /**
   * Добавить дочерний компонент по индексу
   *
   * @param glyph Объект компонента
   * @param i Индекс
   */
  public void insert(Glyph glyph, int i) {
    throw new UnsupportedOperationException();
  }

  /**
   * Удалить дочерний компонент
   *
   * @param glyph Объект компонента
   */
  public void remove(Glyph glyph) {
    throw new UnsupportedOperationException();
  }

  /**
   * Возвращает дочерний компонент
   *
   * @param i Индекс
   */
  public Glyph child(int i) {
    throw new UnsupportedOperationException();
  }

  /**
   * Возвращает родителя компонента
   */
  public Glyph parent() {
    return this.parent;
  }
}
