package display;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Окно диалога
 */
@NoArgsConstructor
@AllArgsConstructor
public class DialogWindow extends Window {

  /**
   * Родитель
   */
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
}
