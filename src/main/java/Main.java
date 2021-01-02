import compose.ArrayCompositor;
import compose.Composition;

public class Main {

    public static void main(String[] args) {
        Composition composition = new Composition(new ArrayCompositor());
        composition.repair();
    }
}
