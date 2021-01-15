package elements;

import common.Glyph;
import display.Window;
import iterators.Iterable;
import iterators.Iterator;
import iterators.ReverseIterator;
import lombok.Getter;
import visitor.Visitor;

/**
 * Компонент столбца
 */
@Getter
public class Column extends Glyph implements Iterable {

  /**
   * Порядковый номер
   */
  private Integer number;

  /**
   * Потомки
   */
  private Glyph[] childs;

  public Column(Integer number) {
    this.number = number;
  }

  public Column(Glyph parent, Glyph[] glyphs) {
    super.setParent(parent);
    childs = glyphs;
  }

  public Column(Integer number, Glyph parent, Glyph[] childs) {
    this.number = number;
    super.setParent(parent);
    this.childs = childs;
  }

  /**
   * Отрисовывает компонент
   *
   * @param window Window
   */
  @Override
  public String draw(Window window) {
    StringBuffer sb = new StringBuffer();
    for (Glyph child : childs) {
      sb.append(child.draw(window));
      sb.append(" ");
    }
    return sb.toString();
  }

  /**
   * Добавить дочерний компонент по индексу
   *
   * @param glyph Объект компонента
   * @param i Индекс
   */
  public void insert(Glyph glyph, int i) {
    glyph.setParent(this);
    childs[i] = glyph;
  }

  /**
   * Удалить дочерний компонент
   *
   * @param glyph Объект компонента
   */
  @Override
  public void remove(Glyph glyph) {
    glyph.setParent(null);
    for (int i = 0; i < childs.length; i++) {
      if (childs[i].equals(glyph)) {
        childs[i] = null;
      }
    }
  }

  /**
   * Возвращает дочерний компонент
   *
   * @param i Индекс
   */
  @Override
  public Glyph child(int i) {
    return childs[i];
  }

  /**
   * Возвращает родителя компонента
   */
  @Override
  public Glyph parent() {
    return super.parent();
  }

  /**
   * Получить итератор
   *
   * @return Итератор
   */
  @Override
  public Iterator iterator() {
    return new ReverseIterator(this.getChilds());
  }

  /**
   * Реализация метода обхода для посетителя
   *
   * @param v Интерфейс посетителя
   */
  @Override
  public void accept(Visitor v) {
    v.visitColumn(this);
  }
}
