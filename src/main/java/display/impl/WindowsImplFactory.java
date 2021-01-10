package display.impl;

import java.util.HashMap;
import java.util.Map;

public class WindowsImplFactory {

  private static WindowImpl instance;

  private WindowsImplFactory(){}

  /**
   * ��������� ������
   */
  private static Map<String, Object> objectFactory = new HashMap<>();

  /**
   * ������� �������
   */
  private static String envelope = System.getenv("OS");

  /**
   * � ����������� �� ������� ��������� ���������� �������
   *
   * @return �������
   */
  public static WindowImpl getInstance() {
    switch (envelope) {
      case "Windows_NT":
        instance = getClassInstance(WinWindowImpl.class);
        break;
      case "Mac":
        instance = getClassInstance(MacWindowImpl.class);
        break;
    }
    return instance;
  }

  /**
   * ������������������ ���������
   *
   * @param clazz ���������� ����� �������
   * @param <T> T
   * @return T
   */
  private static <T> T getClassInstance(Class<T> clazz) {
    String key = clazz.toString();
    Object instance = objectFactory.get(key);
    if (instance == null) {
      synchronized (clazz) {
        if (instance == null) {
          try {
            instance = clazz.newInstance();
            objectFactory.put(key, instance);
          } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(
                "Exception while creating singleton instance for class : " + key
                    + " - Exception Message : " + e);
          }
        }
      }
    }
    return clazz.cast(instance);
  }
}
