package display.impl;

/**
 * ������� ��� WindowImpl
 */
public class WindowSystemFactory {

  private static volatile WindowSystemFactory instance;

  private WindowSystemFactory() {
  }

  /**
   * ������� �������
   */
  private static String envelope = System.getenv("OS");

  /**
   * ������������������ ���������
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
   * � ����������� �� ������� ��������� ���������� ���������� windowImpl
   *
   * @return �������
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
