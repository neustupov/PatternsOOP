package display.observer;

import display.attributes.Size;

/**
 * Основной интерфейс наблюдателя
 */
public interface Observer {

  /**
   * Обновить состояние
   *
   * @param size Размер
   */
  void update(Size size);
}
