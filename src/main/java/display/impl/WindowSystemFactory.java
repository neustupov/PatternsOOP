package display.impl;

/**
 * Фабрика для WindowImpl
 */
public class WindowSystemFactory {

  private static volatile WindowSystemFactory instance;

  private WindowSystemFactory() {
  }

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
    WindowSystemFactory localInstance = instance;
    if (localInstance  == null) {
      synchronized (WindowSystemFactory.class) {
        localInstance = instance;
        if (localInstance == null) {
          instance = localInstance = new WindowSystemFactory();
        }
      }
    }
    return localInstance;
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
