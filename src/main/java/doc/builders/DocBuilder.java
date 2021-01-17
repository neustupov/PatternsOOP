package doc.builders;

import doc.Document;

/**
 * ����������� ������
 */
public abstract class DocBuilder {

  /**
   * ������ �������������
   */
  protected Document doc;

  public Document getDoc(){
    return doc;
  }

  public void createNewDocument(){
    doc = new Document();
  }

  /**
   * ������ ��������� �������
   */
  public abstract void setFont();
  public abstract void setSymbols();
  public abstract void setName();

}
