package app;

import doc.Document;
import factories.elements.menu.Menu;
import java.util.List;
import lombok.AllArgsConstructor;

/**
 * Приложение
 */
@AllArgsConstructor
public class Application {

  /**
   * Документы
   */
  private List<Document> documents;

  /**
   * Меню
   */
  private Menu menu;

  /**
   * Добавить документ
   *
   * @param document документ
   */
  public void addDoc(Document document) {
    documents.add(document);
  }
}
