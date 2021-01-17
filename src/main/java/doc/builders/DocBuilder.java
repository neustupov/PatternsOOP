package doc.builders;

import doc.Document;

/**
 * Абстрактный билдер
 */
public abstract class DocBuilder {

  /**
   * Объект строительства
   */
  protected Document doc;

  public Document getDoc(){
    return doc;
  }

  public void createNewDocument(){
    doc = new Document();
  }

  /**
   * Методы настройки объекта
   */
  public abstract void setFont();
  public abstract void setSymbols();
  public abstract void setName();

}
