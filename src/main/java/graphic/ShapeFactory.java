package graphic;

import java.util.HashMap;
import java.util.Map;

public abstract class ShapeFactory {

  private static Point onePoint;
  private static Map<Integer, Circle> circles;
  private static Map<Integer, Square> squares;

  public ShapeFactory() {
    circles = new HashMap<>();
    squares = new HashMap<>();
  }

  public static synchronized Picture createPicture(Shape... childs) {
    return new Picture(childs);
  }

  public static synchronized Circle createCircle(int radius) {
    Circle circle = circles.getOrDefault(radius, new Circle(radius));
    circles.putIfAbsent(radius, circle);
    return circle;
  }

  public static synchronized Square createSquare(int height, int width) {
    Square square = squares.getOrDefault(height * 10 + width, new Square(height, width));
    squares.putIfAbsent(height * 10 + width, square);

    return square;
  }

  public static synchronized Point createPoint() {
    return onePoint != null ? onePoint : new Point();
  }
}
