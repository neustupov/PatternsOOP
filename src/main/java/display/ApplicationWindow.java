package display;

import display.attributes.Size;
import display.observer.Observable;
import display.observer.Observer;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;

/**
 * ���� ���������� - �������� �������� "�����������" - ��������� ���������
 */
@AllArgsConstructor
public class ApplicationWindow extends Window implements Observable {

  /**
   * ������ ������������
   */
  private List<Observer> observers;

  /**
   * ��������
   */
  private Window owner;

  public ApplicationWindow() {
    this.observers = new ArrayList<>();
  }

  public ApplicationWindow(Window owner) {
    this.owner = owner;
  }

  /**
   * ������������
   *
   * @return ��������� ����������
   */
  @Override
  public String redraw() {
    return owner.redraw();
  }

  public void setSize(Size size) {
    this.size = size;
    notifyObservers();
  }

  /**
   * ��������� ���������
   *
   * @param message ���������
   * @return ��������� ����������
   */
  @Override
  public String notify(String message) {
    return "ApplicationWindow get message: " + message;
  }

  /**
   * �������� �����������
   *
   * @param o �����������
   */
  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  /**
   * ������� �����������
   *
   * @param o �����������
   */
  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  /**
   * ���������� ������������
   */
  @Override
  public void notifyObservers() {
    observers.forEach(observer -> observer.update(size));
  }
}
