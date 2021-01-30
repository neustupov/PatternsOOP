package display;

import display.attributes.Size;
import display.observer.Observable;
import display.observer.Observer;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;

/**
 * Окно приложения - участник паттерна "Наблюдатель" - рассылает сообщения
 */
@AllArgsConstructor
public class ApplicationWindow extends Window implements Observable {

  /**
   * Список наблюдателей
   */
  private List<Observer> observers;

  /**
   * Родитель
   */
  private Window owner;

  public ApplicationWindow() {
    this.observers = new ArrayList<>();
  }

  public ApplicationWindow(Window owner) {
    this.owner = owner;
  }

  /**
   * Перерисовать
   *
   * @return Результат выполнения
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
   * Оповещает компонент
   *
   * @param message Сообщение
   * @return Результат выполнения
   */
  @Override
  public String notify(String message) {
    return "ApplicationWindow get message: " + message;
  }

  /**
   * Добавить наблюдателя
   *
   * @param o Наблюдатель
   */
  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  /**
   * Удалить наблюдателя
   *
   * @param o Наблюдатель
   */
  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  /**
   * Оповестить наблюдателей
   */
  @Override
  public void notifyObservers() {
    observers.forEach(observer -> observer.update(size));
  }
}
