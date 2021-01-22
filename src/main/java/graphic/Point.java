package graphic;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Point implements Shape {

  @Override
  public String draw(Context context) {
    return context.color.toString();
  }
}
