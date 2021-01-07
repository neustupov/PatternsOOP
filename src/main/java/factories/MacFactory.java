package factories;

import factories.elements.button.Button;
import factories.elements.button.MacButton;
import factories.elements.menu.MacMenu;
import factories.elements.menu.Menu;
import factories.elements.scrollbar.MacScrollBar;
import factories.elements.scrollbar.ScrollBar;
import lombok.NoArgsConstructor;

/**
 * ������� ��� Mac
 */
@NoArgsConstructor
public class MacFactory implements GUIFactory {

  /**
   * ������� ��������� ������
   *
   * @return ������
   */
  public Button getButton() {
    return new MacButton();
  }

  /**
   * ������� ��������� ����
   *
   * @return ����
   */
  public Menu getMenu() {
    return new MacMenu();
  }

  /**
   * ������� ��������� ������ ���������
   *
   * @return ������ ���������
   */
  public ScrollBar getScrollBar() {
    return new MacScrollBar();
  }
}
