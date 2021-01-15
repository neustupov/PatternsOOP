package command;

import doc.Document;
import lombok.AllArgsConstructor;

/**
 * ������� - ��������
 */
@AllArgsConstructor
public class CutCommand implements Command {

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
    doc.cut(buffer);
    return buffer + " cut in Doc";
  }

  /**
   * ��������
   *
   * @return ��������� ����������
   */
  @Override
  public String unexecute() {
    doc.paste(buffer);
    return buffer + " insert to Doc";
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
