package app.interpreter.math;

import static org.junit.jupiter.api.Assertions.*;

import app.interpreter.math.expressions.Expression;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Тест паттерна "Интерпретатор"
 */
@ExtendWith(MockitoExtension.class)
class ContextTest {

  @Spy
  private Context context;

  @Test
  void testInterpreter() {
    String line = "1+2+10";
    Expression expression = context.evaluate(line);
    assertEquals(13, expression.interpret());
    line = "10-5+2";
    expression = context.evaluate(line);
    assertEquals(7, expression.interpret());
  }
}