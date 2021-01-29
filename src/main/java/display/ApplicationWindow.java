package display;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Окно приложения
 */
@AllArgsConstructor
@NoArgsConstructor
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

  /**
   * Оповещает компонент
   *
   * @param message Сообщение
   * @return Результат выполнения
   */
  @Override
  public String notify(String message) {
    return "ApplicationWindow get message: " + message;
  }
}
