package doc.builders;

/**
 * ���������� ������
 */
public class MacDocBuilder extends DocBuilder {

  /**
   * ��������� ������
   */
  @Override
  public void setFont() {
    doc.setFont("MacFont");
  }

  /**
   * ��������� ������
   */
  @Override
  public void setSymbols() {
    doc.setSymbols("MacSymbols");
  }

  /**
   * �������� ��������
   */
  @Override
  public void setName() {
    doc.setName("MacDoc");
  }
}
