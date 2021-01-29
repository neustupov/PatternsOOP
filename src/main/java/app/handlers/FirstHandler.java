package app.handlers;

import static app.handlers.BaseHandler.Attrs.FIRST;

/**
 * Конкретный участник цепочки обязанностей
 */
public class FirstHandler extends BaseHandler {

  public FirstHandler(Handler nextHandler) {
    super(nextHandler);
  }

  /**
   * Обработка запроса
   *
   * @param request Запрос
   * @return Результат
   */
  @Override
  public String handle(Request request) {
    String result = "";
    if (request.getParams().get(FIRST) != null){
      result = "Handle in FirstHandler";
    } else if (nextHandler != null){
      result = nextHandler.handle(request);
    }
    return result;
  }
}
