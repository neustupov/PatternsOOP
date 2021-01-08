package factories.elements.menu;

import lombok.NoArgsConstructor;

/**
 * Меню для Mac
 */
@NoArgsConstructor
public class MacMenu extends Menu {

  /**
   * Конструктор конкретного прототипа
   */
  public MacMenu(Menu menu) {
    super(menu);
  }

  /**
   * Отобразить меню
   *
   * @return Строка с результатом
   */
  @Override
  public String popup() {
    return "MacMenu";
  }

  /**
   * Метод клонирования
   *
   * @return Меню
   */
  @Override
  public Menu clone() {
    return new MacMenu(this);
  }
}
