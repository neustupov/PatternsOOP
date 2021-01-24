package app.handlers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseHandler implements Handler{

  protected Handler nextHandler;

  interface Attrs {
    String FIRST = "First";
    String SECOND = "Second";
  }

  public String handle(Request request){
      return "Error when handle request";
  }
}
