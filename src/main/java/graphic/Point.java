package graphic;

import lombok.AllArgsConstructor;

/**
 * ��������� ��������������
 */
@AllArgsConstructor
public class Point implements Shape {

  /**
   * ������������ ��������� � ������ ���������
   *
   * @param context ��������
   * @return ��������� ����������
   */
  @Override
  public String draw(Context context) {
    return "Point with color " + context.color.getRGB();
  }
}
