package doc.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * "Опекун" для класса Document
 */
public class CareTaker {

  /**
   * Объект, содержащий внутренее состояние объекта класса Document
   */
  @Getter
  @Setter
  private DocMemento docMemento;
}
