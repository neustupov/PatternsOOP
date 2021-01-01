package elements;

import display.Window;
import position.Point;

/**
 * Конечный компонент символа
 */
public class Char implements Glyph {

  /**
   * Символ
   */
  private Character character;

  /**
   * Родитель
   */
  private Glyph parent;

  public Char(Character character) {
    this.character = character;
  }

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

  public void setParent(Glyph parent) {
    this.parent = parent;
  }
}
