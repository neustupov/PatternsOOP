package graphic;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square implements Shape {

  private int height, width;

  @Override
  public String draw(Context context) {
    return "Square with height and width: " + height + "-" + width + " and RGB color " + context.color.getRGB();
  }
}
