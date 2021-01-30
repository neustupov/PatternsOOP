package graphic;

import java.util.HashMap;
import java.util.Map;

/**
 * Фабрика приспособленца
 */
public abstract class ShapeFactory {

  private static Point onePoint;
  private static Map<Integer, Circle> circles;
  private static Map<Integer, Square> squares;

  public ShapeFactory() {
    circles = new HashMap<>();
    squares = new HashMap<>();
  }

  /**
   * Создает объект класса Picture
   *
   * @param childs Дочерние объекты
   * @return Picture
   */
  public synchronized Picture createPicture(Shape... childs) {
    return new Picture(childs);
  }

  /**
   * Создает объект класса Circle
   *
   * @param radius Радиус
   * @return Результат выполнения
   */
  public synchronized Circle createCircle(int radius) {
    Circle circle = circles.getOrDefault(radius, new Circle(radius));
    circles.putIfAbsent(radius, circle);
    return circle;
  }

  /**
   * Создает объект класса Square
   *
   * @param height Высота
   * @param width Ширина
   * @return Результат выполнения
   */
  public synchronized Square createSquare(int height, int width) {
    Square square = squares.getOrDefault(height * 10 + width, new Square(height, width));
    squares.putIfAbsent(height * 10 + width, square);

    return square;
  }

  /**
   * Создает объект класса Point
   *
   * @return Результат выполнения
   */
  public synchronized Point createPoint() {
    return onePoint != null ? onePoint : new Point();
  }
}
