package command;

import app.Application;
import doc.Document;
import lombok.AllArgsConstructor;

/**
 * Команда открытия документа
 */
@AllArgsConstructor
public class OpenCommand implements Command {

  /**
   * Название документа
   */
  private String name;
  /**
   * Приложение
   */
  private Application app;

  /**
   * Выполнить
   *
   * @return Результат выполнения
   */
  @Override
  public String execute() {
    Document doc = new Document(null, "", name);
    app.addDoc(doc);
    doc.open();
    return "Doc with name" + name + "  is open";
  }

  /**
   * Отменить
   *
   * @return Результат выполнения
   */
  @Override
  public String unexecute() {
    return null;
  }

  /**
   * Возможность отмены
   *
   * @return boolean
   */
  @Override
  public boolean reversible() {
    return false;
  }
}
