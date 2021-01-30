package graphic;

import lombok.AllArgsConstructor;

/**
 * Коспонент приспособленца
 */
@AllArgsConstructor
public class Circle implements Shape {

  /**
   * Внутреннее состояние - радиус
   */
  private int radius;

  /**
   * Отрисовывоет компонент в рамках контекста
   *
   * @param context Контекст
   * @return Результат выполнения
   */
  @Override
  public String draw(Context context) {
    return "Circle with radius: " + radius + "and color: " + context.color.getRGB();
  }
}
