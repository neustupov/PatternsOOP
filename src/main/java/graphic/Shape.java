package graphic;

/**
 * Интерфейс приспособленца
 */
public interface Shape {

  /**
   * Отрисовывоет компонент в рамках контекста
   *
   * @param context Контекст
   * @return Результат выполнения
   */
  String draw(Context context);

}
