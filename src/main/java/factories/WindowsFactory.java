package factories;

import factories.elements.button.Button;
import factories.elements.button.WindowsButton;
import factories.elements.menu.Menu;
import factories.elements.menu.WindowsMenu;
import factories.elements.scrollbar.ScrollBar;
import factories.elements.scrollbar.WindowsScrollBar;
import lombok.NoArgsConstructor;

/**
 * Фабрика для Win
 */
@NoArgsConstructor
public class WindowsFactory implements GUIFactory {

  /**
   * Вернуть компонент кнопки
   *
   * @return Кнопка
   */
  public Button getButton() {
    return new WindowsButton();
  }

  /**
   * Вернуть компонент меню
   *
   * @return Меню
   */
  public Menu getMenu() {
    return new WindowsMenu();
  }

  /**
   * Вернуть компонент полосы прокрутки
   *
   * @return Полоса прокрутки
   */
  public ScrollBar getScrollBar() {
    return new WindowsScrollBar();
  }
}
