package graphic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Объект прокси для класса Picture
 */
@AllArgsConstructor
public class PictureProxy implements Shape{

  @Getter
  @Setter
  private String pictureSize;
  /**
   * Проксируемый объект
   */
  @Getter
  private Picture picture;
  private List<Shape> childs;

  public PictureProxy(Shape ...shapes) {
    this.childs = new LinkedList<>();
    this.childs.addAll(Arrays.asList(shapes));
    this.setPictureSize("10");
  }

  /**
   * Отрисовывоет компонент в рамках контекста
   *
   * @param context Контекст
   * @return Результат выполнения
   */
  @Override
  public String draw(Context context) {
    if (this.picture == null){
      this.picture = new Picture(childs);
      this.picture.setPictureSize("100500");
    }
    return picture.draw(context);
  }
}
