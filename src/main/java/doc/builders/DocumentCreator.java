package doc.builders;

import doc.Document;
import lombok.Setter;

/**
 * Director
 */
public class DocumentCreator {

  /**
   * Объект билдера
   */
  @Setter
  private DocBuilder builder;

  public Document getDocument(){
    return builder.getDoc();
  }

  /**
   * Сборка объекта документа
   */
  public void constructDoc(){
    builder.createNewDocument();
    builder.setFont();
    builder.setSymbols();
    builder.setName();
  }
}
