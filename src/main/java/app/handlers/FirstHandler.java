package app.handlers;

import static app.handlers.BaseHandler.Attrs.FIRST;

public class FirstHandler extends BaseHandler {

  public FirstHandler(Handler nextHandler) {
    super(nextHandler);
  }

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
