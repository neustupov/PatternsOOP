package graphic;

import java.util.HashMap;
import java.util.Map;

/**
 * ������� ��������������
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
   * ������� ������ ������ Picture
   *
   * @param childs �������� �������
   * @return Picture
   */
  public synchronized Picture createPicture(Shape... childs) {
    return new Picture(childs);
  }

  /**
   * ������� ������ ������ Circle
   *
   * @param radius ������
   * @return ��������� ����������
   */
  public synchronized Circle createCircle(int radius) {
    Circle circle = circles.getOrDefault(radius, new Circle(radius));
    circles.putIfAbsent(radius, circle);
    return circle;
  }

  /**
   * ������� ������ ������ Square
   *
   * @param height ������
   * @param width ������
   * @return ��������� ����������
   */
  public synchronized Square createSquare(int height, int width) {
    Square square = squares.getOrDefault(height * 10 + width, new Square(height, width));
    squares.putIfAbsent(height * 10 + width, square);

    return square;
  }

  /**
   * ������� ������ ������ Point
   *
   * @return ��������� ����������
   */
  public synchronized Point createPoint() {
    return onePoint != null ? onePoint : new Point();
  }
}
