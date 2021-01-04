import compose.ArrayCompositor;
import compose.Composition;
import factories.GUIFactory;
import factories.MacFactory;
import factories.WindowsFactory;
import factories.elements.button.Button;
import factories.elements.menu.Menu;
import factories.elements.scrollbar.ScrollBar;

public class Main {

    private static GUIFactory factory;

    public static void main(String[] args) {
        switch (args[0]){
            case "Windows":
                factory = WindowsFactory.getInstance();
                break;
            case "Mac":
                factory = MacFactory.getInstance();
                break;
        }

        Button button = factory.getButton();
        Menu menu = factory.getMenu();
        ScrollBar scrollBar = factory.getScrollBar();

        Composition composition = new Composition(new ArrayCompositor());
        composition.repair();
    }
}
