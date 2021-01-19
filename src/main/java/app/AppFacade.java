package app;

import display.DialogWindow;
import doc.Document;
import elements.Row;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class AppFacade {

  private Document doc;
  private Row row;
  private DialogWindow window;

  public void startApp(){
    System.out.println(window.lower());
    row.getChilds().forEach(System.out::println);
    System.out.println(doc.open());
  }
}
