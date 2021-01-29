package display.mediator;

import display.Window;

/**
 * Абстрактный класс посредника
 */
public abstract class Mediator {

  /**
   * Обработка сообщения от компонента
   *
   * @param message Сообщение
   * @param sender Компонент
   * @return Результат полнения
   */
  public abstract String send(String message, Window sender);
}
