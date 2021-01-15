package display;

import lombok.AllArgsConstructor;

/**
 * Окно приложения
 */
@AllArgsConstructor
public class ApplicationWindow extends Window {

  /**
   * Родитель
   */
  private Window owner;

  /**
   * Перерисовать
   *
   * @return Результат выполнения
   */
  @Override
  public String redraw() {
    return owner.redraw();
  }
}
