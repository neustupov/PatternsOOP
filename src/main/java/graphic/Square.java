package graphic;

import lombok.AllArgsConstructor;

/**
 * Конкретный компонент приспособленца
 */
@AllArgsConstructor
public class Square implements Shape {

  /**
   * Внутреннее состояние - высота, ширина
   */
  private int height, width;

  /**
   * Отрисовывоет компонент в рамках контекста
   *
   * @param context Контекст
   * @return Результат выполнения
   */
  @Override
  public String draw(Context context) {
    return "Square with height and width: " + height + "-" + width + " and RGB color " + context.color.getRGB();
  }
}
