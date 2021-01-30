package doc.memento;

import lombok.Builder;
import lombok.Getter;

/**
 * ��������� ��� ������ Document
 */
@Builder
public class DocMemento {

  /**
   * �����
   */
  @Getter
  private String font;
  /**
   * ����������
   */
  @Getter
  private String symbols;
}
