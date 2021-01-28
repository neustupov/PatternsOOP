package display.mediator;

import display.Window;

public abstract class Mediator {

  public abstract String send(String message, Window sender);
}
