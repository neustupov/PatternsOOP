package factories;

import factories.elements.button.Button;
import factories.elements.menu.Menu;
import factories.elements.scrollbar.ScrollBar;

/**
 * ��������� ����������� �������
 */
public interface GUIFactory {

  /**
   * ������� ��������� ������
   *
   * @return ������
   */
  Button getButton();

  /**
   * ������� ��������� ����
   *
   * @return ����
   */
  Menu getMenu();

  /**
   * ������� ��������� ������ ���������
   *
   * @return ������ ���������
   */
  ScrollBar getScrollBar();
}
