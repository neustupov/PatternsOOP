package graphic;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ShapeFactoryTest {

  private Context context;
  @Spy
  private ShapeFactory factory;
  private Picture picture;

  @BeforeEach
  void setUp() {
    context = new Context(3, 4, new Color(100500));
    picture = new Picture(factory.createCircle(10),
        factory.createPoint(),
        factory.createSquare(1, 2));
  }

  @Test
  void testPictureDraw() {
    assertEquals(picture.draw(context), "Circle with radius: 10and color: -16676716 Point with color -16676716 Square with height and width: 1-2 and RGB color -16676716 ");
  }
}