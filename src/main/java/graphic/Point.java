package graphic;

import lombok.AllArgsConstructor;

/**
 * Коспонент приспособленца
 */
@AllArgsConstructor
public class Point implements Shape {

  /**
   * Отрисовывоет компонент в рамках контекста
   *
   * @param context Контекст
   * @return Результат выполнения
   */
  @Override
  public String draw(Context context) {
    return "Point with color " + context.color.getRGB();
  }
}
