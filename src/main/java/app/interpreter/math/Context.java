package app.interpreter.math;

import app.interpreter.math.expressions.Expression;
import app.interpreter.math.expressions.MinusExpression;
import app.interpreter.math.expressions.NumberExpression;
import app.interpreter.math.expressions.PlusExpresion;

/**
 * Контекст интерпретатора
 */
public class Context {

  /**
   * Произвести действие над лексическим деревом выражения
   *
   * @param s Выражение
   * @return Экспресия
   */
  public Expression evaluate(String s) {

    int pos = s.length() - 1;
    while (pos > 0) {
      if (Character.isDigit(s.charAt(pos))) {
        pos--;
      } else {
        Expression left = evaluate(s.substring(0, pos));
        Expression right = new NumberExpression(Integer.valueOf(s.substring(pos + 1)));
        char operator = s.charAt(pos);
        switch (operator) {
          case '-':
            return new MinusExpression(left, right);
          case '+':
            return new PlusExpresion(left, right);
        }
      }
    }
    int result = Integer.valueOf(s);
    return new NumberExpression(result);
  }
}
