package command;

import doc.Document;
import lombok.AllArgsConstructor;

/**
 * Команда - вставить
 */
@AllArgsConstructor
public class PasteCommand implements Command {

  /**
   * Буфер
   */
  private String buffer;
  /**
   * Документ
   */
  private Document doc;

  /**
   * Выполнить
   *
   * @return Результат выполнения
   */
  @Override
  public String execute() {
    return doc.paste(buffer);
  }

  /**
   * Отменить
   *
   * @return Результат выполнения
   */
  @Override
  public String unexecute() {
    doc.cut(buffer);
    return buffer + " delete from Doc";
  }

  /**
   * Возможность отмены
   *
   * @return boolean
   */
  @Override
  public boolean reversible() {
    return true;
  }
}
