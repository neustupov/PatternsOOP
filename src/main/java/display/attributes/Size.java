package display.attributes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
public class Size {

  @Getter
  private int height;
  @Getter
  private int width;
}
