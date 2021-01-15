package command;

import doc.Document;

/**
 * Команда смены шрифта
 */
public class FontCommand implements Command {

  /**
   * Старый шрифт
   */
  private String oldFont;
  /**
   * Новый шрифт
   */
  private String newFont;
  /**
   * Документ
   */
  private Document doc;

  public FontCommand(String newFont, Document doc) {
    this.newFont = newFont;
    this.doc = doc;
  }

  /**
   * Выполнить
   *
   * @return Результат выполнения
   */
  @Override
  public String execute() {
    oldFont = newFont;
    doc.setFont(newFont);
    return "Doc rewrite with font: " + newFont;
  }

  /**
   * Отменить
   *
   * @return Результат выполнения
   */
  @Override
  public String unexecute() {
    if (oldFont != null) {
      doc.setFont(oldFont);
    }
    return "Return font: " + oldFont + " in Doc";
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
