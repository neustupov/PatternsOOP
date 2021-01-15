package command;

import doc.Document;
import lombok.AllArgsConstructor;

/**
 * ������� - ��������
 */
@AllArgsConstructor
public class PasteCommand implements Command {

  /**
   * �����
   */
  private String buffer;
  /**
   * ��������
   */
  private Document doc;

  /**
   * ���������
   *
   * @return ��������� ����������
   */
  @Override
  public String execute() {
    return doc.paste(buffer);
  }

  /**
   * ��������
   *
   * @return ��������� ����������
   */
  @Override
  public String unexecute() {
    doc.cut(buffer);
    return buffer + " delete from Doc";
  }

  /**
   * ����������� ������
   *
   * @return boolean
   */
  @Override
  public boolean reversible() {
    return true;
  }
}
