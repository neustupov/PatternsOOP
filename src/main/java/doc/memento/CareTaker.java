package doc.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * "������" ��� ������ Document
 */
public class CareTaker {

  /**
   * ������, ���������� ��������� ��������� ������� ������ Document
   */
  @Getter
  @Setter
  private DocMemento docMemento;
}
