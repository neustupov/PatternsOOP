package doc;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ����� ��������� - ���������� � �������� "�������"
 */
@NoArgsConstructor
@AllArgsConstructor
public class Document {

  /**
   * �����
   */
  @Setter
  private String font;
  /**
   * ����������
   */
  private String symbols;
  /**
   * ��������
   */
  private String name;

  /**
   * �������
   *
   * @return ��������� ����������
   */
  public String open() {
    return "Doc is open";
  }

  /**
   * �������
   *
   * @return ��������� ����������
   */
  public String close() {
    return "Doc is close";
  }

  /**
   * ��������
   *
   * @param buffer ������
   * @return ��������� ����������
   */
  public String cut(String buffer) {
    return symbols.replace(buffer, "");
  }

  /**
   * ����������
   *
   * @return ��������� ����������
   */
  public String copy() {
    return "Doc is copy";
  }

  /**
   * ��������
   *
   * @param buffer �����
   * @return ��������� ����������
   */
  public String paste(String buffer) {
    return symbols.concat(buffer);
  }
}
