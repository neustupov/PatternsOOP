package app;

import doc.Document;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Application {

  private List<Document> documents;

  public void addDoc(Document document){
    documents.add(document);
  }
}
