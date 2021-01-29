package display;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Окно диалога
 */
@NoArgsConstructor
@AllArgsConstructor
public class DialogWindow extends Window {

  /**
   * Родитель
   */
  @Setter
  private Window owner;

  /**
   * Уменьшить
   *
   * @return Результат работы
   */
  @Override
  public String lower() {
    return owner.lower();
  }

  /**
   * Оповещает компонент
   *
   * @param message Сообщение
   * @return Результат выполнения
   */
  @Override
  public String notify(String message) {
    return "DialogWindow get message: " + message;
  }
}
