package graphic;

import java.awt.Color;
import lombok.AllArgsConstructor;

/**
 * Контекст приспособленца - передает внешнее состояние
 */
@AllArgsConstructor
public class Context {

  /**
   * Внешнее состояние
   */
  public final int x;
  public final int y;
  public final Color color;

}
