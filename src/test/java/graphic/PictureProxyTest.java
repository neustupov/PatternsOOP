package graphic;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Тест прокси
 */
@ExtendWith(MockitoExtension.class)
class PictureProxyTest {

  @Spy
  private ShapeFactory factory;
  private PictureProxy pictureProxy;
  private Context context;

  @BeforeEach
  void setUp() {
    context = new Context(3, 4, new Color(100500));
    pictureProxy = new PictureProxy(factory.createCircle(10));
  }

  @Test
  void draw() {
    assertNull(pictureProxy.getPicture());
    assertEquals(pictureProxy.getPictureSize(), "10");
    assertEquals(pictureProxy.draw(context), "Circle with radius: 10and color: -16676716 ");
    assertEquals(pictureProxy.getPicture().getPictureSize(), "100500");
  }
}