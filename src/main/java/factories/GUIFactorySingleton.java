package factories;

public class GUIFactorySingleton {

  private static volatile GUIFactory instance = null;

  private GUIFactorySingleton() {
  }

  public static GUIFactory getInstance() {
    if (instance == null) {
      synchronized (GUIFactorySingleton.class) {
        if (instance == null) {
          String envelope = System.getenv("System");
          switch (envelope) {
            case "Windows":
              instance = WindowsFactory.getInstance();
              break;
            case "Mac":
              instance = MacFactory.getInstance();
              break;
          }
        }
      }
    }
    return instance;
  }

}
