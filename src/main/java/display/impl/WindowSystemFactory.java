package display.impl;

public class WindowSystemFactory {

  private static WindowSystemFactory instance;

  private WindowSystemFactory(){}

  /**
   * Текущая система
   */
  private static String envelope = System.getenv("OS");

  /**
   * Синхронизированный синглетон
   *
   * @return WindowSystemFactory
   */
  public static WindowSystemFactory getInstance() {
    if (instance == null) {
      synchronized (WindowSystemFactory.class) {
        if (instance == null) {
            instance = new WindowSystemFactory();
        }
      }
    }
    return instance;
  }

  /**
   * В зависимости от системы подбирает актуальную реализацию windowImpl
   *
   * @return Фабрика
   */
  public WindowImpl getWIInstance() {
    WindowImpl impl = null;
    switch (envelope) {
      case "Windows_NT":
        impl = new WinWindowImpl();
        break;
      case "Mac":
        impl = new MacWindowImpl();
        break;
    }
    return impl;
  }
}
