package factories.elements.scrollbar;

public class WindowsScrollBar extends ScrollBar {

  @Override
  void scrollTo() {
    System.out.println("WindowsScrollBar");
  }
}
