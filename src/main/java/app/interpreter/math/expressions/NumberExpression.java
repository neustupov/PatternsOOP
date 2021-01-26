package app.interpreter.math.expressions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NumberExpression implements Expression {

  private int number;

  @Override
  public int interpret() {
    return number;
  }
}
