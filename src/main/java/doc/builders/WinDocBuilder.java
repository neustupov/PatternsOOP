package doc.builders;

/**
 * ���������� ������
 */
public class WinDocBuilder extends DocBuilder{

  /**
   * ��������� ������
   */
  @Override
  public void setFont() {
    doc.setFont("WinFont");
  }

  /**
   * ��������� ������
   */
  @Override
  public void setSymbols() {
    doc.setSymbols("WinSymbols");
  }

  /**
   * �������� ��������
   */
  @Override
  public void setName() {
    doc.setName("WinDoc");
  }
}
