package command;

/**
 * Команда выхода из приложения
 */
public class QuitCommand implements Command {

  /**
   * Выполнить
   *
   * @return Результат выполнения
   */
  @Override
  public String execute() {
    SaveCommand saveCommand = new SaveCommand();
    return saveCommand.execute() + " and exit from App";
  }

  /**
   * Отменить
   *
   * @return Результат выполнения
   */
  @Override
  public String unexecute() {
    return null;
  }

  /**
   * Возможность отмены
   *
   * @return boolean
   */
  @Override
  public boolean reversible() {
    return false;
  }
}
