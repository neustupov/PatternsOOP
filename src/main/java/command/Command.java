package command;

/**
 * Интерфейс команды
 */
public interface Command {

  /**
   * Выполнить
   *
   * @return Результат выполнения
   */
  String execute();

  /**
   * Отменить
   *
   * @return Результат выполнения
   */
  String unexecute();

  /**
   * Возможность отмены
   *
   * @return boolean
   */
  boolean reversible();
}
