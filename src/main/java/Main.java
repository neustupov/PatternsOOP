import compose.ReverseCompositor;
import compose.Composition;
import factories.GUIFactory;
import factories.GUIFactorySingleton;
import factories.elements.button.Button;
import factories.elements.menu.Menu;
import factories.elements.scrollbar.ScrollBar;

public class Main {

    private static GUIFactory factory = GUIFactorySingleton.getInstance();

    public static void main(String[] args) {

        getComponents();

        Composition composition = new Composition(new ReverseCompositor());
        composition.repair();
    }

    public static void getComponents(){
        Button button = factory.getButton();
        Menu menu = factory.getMenu();
        ScrollBar scrollBar = factory.getScrollBar();
    }
}
