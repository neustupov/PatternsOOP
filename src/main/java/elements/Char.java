package elements;

import common.Glyph;
import display.Window;
import lombok.Getter;
import position.Point;
import visitor.Visitor;

/**
 * Конечный компонент символа
 */
public class Char extends Glyph {

  /**
   * Символ
   */
  @Getter
  private Character character;

  public Char(Character character, Glyph parent) {
    this.character = character;
    super.setParent(parent);
  }

  /**
   * Отрисовывает компонент
   *
   * @param window Window
   */
  @Override
  public String draw(Window window) {
    return window.drawCharacter(character);
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

  /**
   * Реализация метода обхода для посетителя
   * @param v Интерфейс посетителя
   */
  @Override
  public void accept(Visitor v) {
    v.visitChar(this);
  }
}
