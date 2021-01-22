package graphic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Picture implements Shape {

  private List<Shape> childs;

  public Picture(Shape ...shapes) {
    this.childs = new LinkedList<>();
    this.childs.addAll(Arrays.asList(shapes));
  }

  @Override
  public String draw(Context context) {
    StringBuilder sb = new StringBuilder();
    for (Shape p: childs) {
      sb.append(p.draw(context));
    }
    return sb.toString();
  }
}
