package graphic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Сщставной коспонент приспособленца
 */
@AllArgsConstructor
public class Picture implements Shape {

  /**
   * Внутренее состояние - размер
   */
  @Getter
  @Setter
  private String pictureSize;
  private List<Shape> childs;

  public Picture(Shape ...shapes) {
    this.childs = new LinkedList<>();
    this.childs.addAll(Arrays.asList(shapes));
  }

  public Picture(List<Shape> shapes) {
    this.childs = new LinkedList<>();
    this.childs.addAll(shapes);
  }

  /**
   * Отрисовывоет компонент в рамках контекста
   *
   * @param context Контекст
   * @return Результат выполнения
   */
  @Override
  public String draw(Context context) {
    StringBuilder sb = new StringBuilder();
    for (Shape p: childs) {
      sb.append(p.draw(context));
      sb.append(" ");
    }
    return sb.toString();
  }
}
