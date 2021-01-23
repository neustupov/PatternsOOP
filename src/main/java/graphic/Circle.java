package graphic;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle implements Shape {

  private int radius;

  @Override
  public String draw(Context context) {
    return "Circle with radius: " + radius + "and color: " + context.color.getRGB();
  }
}
