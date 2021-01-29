package app.interpreter.math.expressions;

import lombok.AllArgsConstructor;

/**
 * Терминальная экспрессия числового значения
 */
@AllArgsConstructor
public class NumberExpression implements Expression {

  private int number;

  /**
   * Интерпретировать
   *
   * @return Результат интерпретации
   */
  @Override
  public int interpret() {
    return number;
  }
}
