package display.observer;

/**
 * Основной интерфейс для регистрации и оповещения наблюдателей
 */
public interface Observable {

  /**
   * Добавить наблюдателя
   *
   * @param o Наблюдатель
   */
  void registerObserver(Observer o);

  /**
   * Удалить наблюдателя
   *
   * @param o Наблюдатель
   */
  void removeObserver(Observer o);

  /**
   * Оповестить наблюдателей
   */
  void notifyObservers();
}
