package app.handlers;

import static app.handlers.BaseHandler.Attrs.SECOND;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SecondHandler extends BaseHandler {

  public SecondHandler(Handler nextHandler) {
    super(nextHandler);
  }

  @Override
  public String handle(Request request) {
    String result = "";
    if (request.getParams().get(SECOND) != null){
      result = "Handle in SecondHandler";
    } else if (nextHandler != null){
      result = nextHandler.handle(request);
    }
    return result;
  }
}
