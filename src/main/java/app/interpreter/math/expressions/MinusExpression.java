package app.interpreter.math.expressions;

import lombok.AllArgsConstructor;

/**
 * Ёкспресси€ выражни€ "-"
 */
@AllArgsConstructor
public class MinusExpression implements Expression {

  private Expression left;
  private Expression right;

  /**
   * »нтерпретировать
   *
   * @return –езультат интерпретации
   */
  @Override
  public int interpret() {
    return left.interpret() - right.interpret();
  }
}
