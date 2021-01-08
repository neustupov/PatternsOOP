package factories.elements.menu;

/**
 * Меню для Win
 */
public class WindowsMenu extends Menu {

  /**
   * Конструктор конкретного прототипа
   */
  public WindowsMenu(Menu menu) {
    super(menu);
  }

  /**
   * Отобразить меню
   *
   * @return Строка с результатом
   */
  @Override
  public String popup() {
    return "WindowsMenu";
  }

  /**
   * Метод клонирования
   *
   * @return Меню
   */
  @Override
  public Menu clone() {
    return new WindowsMenu(this);
  }
}
