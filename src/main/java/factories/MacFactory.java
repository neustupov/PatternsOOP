package factories;

import factories.elements.button.Button;
import factories.elements.button.MacButton;
import factories.elements.menu.MacMenu;
import factories.elements.menu.Menu;
import factories.elements.scrollbar.MacScrollBar;
import factories.elements.scrollbar.ScrollBar;
import lombok.NoArgsConstructor;

/**
 * Фабрика для Mac
 */
@NoArgsConstructor
public class MacFactory implements GUIFactory {

  /**
   * Вернуть компонент кнопки
   *
   * @return Кнопка
   */
  public Button getButton() {
    return new MacButton();
  }

  /**
   * Вернуть компонент меню
   *
   * @return Меню
   */
  public Menu getMenu() {
    return new MacMenu();
  }

  /**
   * Вернуть компонент полосы прокрутки
   *
   * @return Полоса прокрутки
   */
  public ScrollBar getScrollBar() {
    return new MacScrollBar();
  }
}
