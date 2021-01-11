package app;

import doc.Document;
import factories.elements.menu.Menu;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Application {

  private List<Document> documents;
  private Menu menu;

  public void addDoc(Document document){
    documents.add(document);
  }
}
