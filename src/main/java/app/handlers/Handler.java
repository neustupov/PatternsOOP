package app.handlers;

/**
 * Интерфейс цепочки обязанностей
 */
public interface Handler {

  /**
   * Обработка запроса
   *
   * @param request Запрос
   * @return Результат
   */
  String handle(Request request);
}
