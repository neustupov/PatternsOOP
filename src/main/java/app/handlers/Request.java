package app.handlers;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

public class Request {

  @Getter
  private Map<String, String> params;

  public Request() {
    this.params = new HashMap<>();
  }
}
