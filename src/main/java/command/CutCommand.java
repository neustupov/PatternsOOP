package command;

import doc.Document;
import lombok.AllArgsConstructor;

/**
 * Команда - вырезать
 */
@AllArgsConstructor
public class CutCommand implements Command {

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
    doc.cut(buffer);
    return buffer + " cut in Doc";
  }

  /**
   * Отменить
   *
   * @return Результат выполнения
   */
  @Override
  public String unexecute() {
    doc.paste(buffer);
    return buffer + " insert to Doc";
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
