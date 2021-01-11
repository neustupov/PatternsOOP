package factories;

import java.util.HashMap;
import java.util.Map;

/**
 * Синглетон абстрактной фабрики, в зависимости от параметров системы выдает ту или иную фабрику
 */
public class GUIFactorySingleton {

  private static volatile GUIFactory instance;

  /**
   * Хранилище фабрик
   */
  private static Map<String, Object> objectFactory = new HashMap<>();

  /**
   * Текущая система
   */
  private static String envelope = System.getenv("OS");

  private GUIFactorySingleton() {
  }

  /**
   * В зависимости от системы подбирает актуальную фабрику
   *
   * @return Фабрика
   */
  public static GUIFactory getInstance() {
    switch (envelope) {
      case "Windows_NT":
        instance = getClassInstance(WindowsFactory.class);
        break;
      case "Mac":
        instance = getClassInstance(MacFactory.class);
        break;
    }
    return instance;
  }

  /**
   * Синхронизированный синглетон
   *
   * @param clazz Необходимы класс объекта
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
