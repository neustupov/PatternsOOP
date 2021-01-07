package factories;

import factories.elements.button.Button;
import factories.elements.menu.Menu;
import factories.elements.scrollbar.ScrollBar;

/**
 * Интерфейс абстрактной фабрики
 */
public interface GUIFactory {

  /**
   * Вернуть компонент кнопки
   *
   * @return Кнопка
   */
  Button getButton();

  /**
   * Вернуть компонент меню
   *
   * @return Меню
   */
  Menu getMenu();

  /**
   * Вернуть компонент полосы прокрутки
   *
   * @return Полоса прокрутки
   */
  ScrollBar getScrollBar();
}
