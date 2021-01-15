package display;

import lombok.AllArgsConstructor;

/**
 * Окно иконок
 */
@AllArgsConstructor
public class IconWindow extends Window {

  /**
   * Родитель
   */
  private Window owner;

  /**
   * Отобразить иконки
   *
   * @return Результат работы
   */
  @Override
  public String iconify() {
    return owner.iconify();
  }
}
