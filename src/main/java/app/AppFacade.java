package app;

import display.Window;
import doc.Document;
import elements.Row;
import graphic.Context;
import graphic.Square;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class AppFacade {

  private Document doc;
  private Square square;
  private Context context;
  private Row row;
  private Window window;

  public String startApp() {
    StringBuffer sb = new StringBuffer();

    sb.append(doc.open());
    sb.append(" ");
    sb.append(square.draw(context));
    sb.append(" ");
    row.getChilds().forEach(ch -> {
      sb.append(ch.draw(window));
      sb.append(" ");
    });

    return sb.toString();
  }
}
