package elements;

import display.Window;
import position.Point;

/**
 * Родительский интерфейс элементов
 */
interface Glyph {

  /**
   * Отрисовывает компонент
   *
   * @param window Window
   */
  default void draw(Window window) {
    throw new UnsupportedOperationException();
  }

  /**
   * Границы
   *
   * @param glyph Объект компонента
   */
  default void bounds(Glyph glyph) {
    throw new UnsupportedOperationException();
  }

  /**
   * Пересечения компонентов
   *
   * @param point Point
   */
  default boolean intersects(Point point) {
    throw new UnsupportedOperationException();
  }

  /**
   * Добавить дочерний компонент по индексу
   *
   * @param glyph Объект компонента
   * @param i Индекс
   */
  default void insert(Glyph glyph, int i) {
    throw new UnsupportedOperationException();
  }

  /**
   * Удалить дочерний компонент
   *
   * @param glyph Объект компонента
   */
  default void remove(Glyph glyph) {
    throw new UnsupportedOperationException();
  }

  /**
   * Возвращает дочерний компонент
   *
   * @param i Индекс
   */
  default Glyph child(int i) {
    throw new UnsupportedOperationException();
  }

  /**
   * Возвращает родителя компонента
   */
  default Glyph parent() {
    throw new UnsupportedOperationException();
  }
}
