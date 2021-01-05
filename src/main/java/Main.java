import compose.ArrayCompositor;
import compose.Composition;
import factories.GUIFactory;
import factories.GUIFactorySingleton;
import factories.elements.button.Button;
import factories.elements.menu.Menu;
import factories.elements.scrollbar.ScrollBar;

public class Main {

    private static GUIFactory factory = GUIFactorySingleton.getInstance();

    public static void main(String[] args) {

        Button button = factory.getButton();
        Menu menu = factory.getMenu();
        ScrollBar scrollBar = factory.getScrollBar();

        Composition composition = new Composition(new ArrayCompositor());
        composition.repair();
    }
}
