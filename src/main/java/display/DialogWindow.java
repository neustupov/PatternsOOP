package display;

import display.attributes.Size;
import display.observer.Observer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Окно диалога
 */
@NoArgsConstructor
@AllArgsConstructor
public class DialogWindow extends Window implements Observer {

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

  /**
   * Обновить объект
   *
   * @param size Размер
   */
  @Override
  public void update(Size size) {
    this.size = size;
  }
}
