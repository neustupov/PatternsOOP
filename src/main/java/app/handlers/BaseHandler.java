package app.handlers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Абсрактный класс участников цепочки обязанностей
 */
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseHandler implements Handler {

  protected Handler nextHandler;

  interface Attrs {

    String FIRST = "First";
    String SECOND = "Second";
  }

  /**
   * Обработка запроса
   *
   * @param request Запрос
   * @return Результат
   */
  public String handle(Request request) {
    return "Error when handle request";
  }
}
