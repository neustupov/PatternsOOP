package factories.elements.scrollbar;

public class MacScrollBar extends ScrollBar {

  @Override
  void scrollTo() {
    System.out.println("MacScrollBar");
  }
}
