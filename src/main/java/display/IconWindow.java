package display;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Окно иконок
 */
@NoArgsConstructor
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

  /**
   * Оповещает компонент
   *
   * @param message Сообщение
   * @return Результат выполнения
   */
  @Override
  public String notify(String message) {
    return "IconWindow get message: " + message;
  }
}
