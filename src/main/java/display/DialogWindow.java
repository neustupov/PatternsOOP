package display;

import lombok.AllArgsConstructor;

/**
 * Окно диалога
 */
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
