package doc;

import doc.memento.DocMemento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ����� ��������� - ���������� � �������� "�������"
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {

  /**
   * �����
   */
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

  /**
   * ��������� ���� ��������� �� ������� ������
   *
   * @return DocMemento
   */
  public DocMemento createMemento() {
    return DocMemento.builder()
        .font(this.font)
        .symbols(this.symbols)
        .build();
  }

  /**
   * ������������� ��������� �� �������� �������
   *
   * @param memento DocMemento
   */
  public void setMemento(DocMemento memento) {
    this.setFont(memento.getFont());
    this.setSymbols(memento.getSymbols());
  }
}
