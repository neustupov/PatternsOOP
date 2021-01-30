package display.observer;

/**
 * �������� ��������� ��� ����������� � ���������� ������������
 */
public interface Observable {

  /**
   * �������� �����������
   *
   * @param o �����������
   */
  void registerObserver(Observer o);

  /**
   * ������� �����������
   *
   * @param o �����������
   */
  void removeObserver(Observer o);

  /**
   * ���������� ������������
   */
  void notifyObservers();
}
