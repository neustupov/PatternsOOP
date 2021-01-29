package app.interpreter.math.expressions;

import lombok.AllArgsConstructor;

/**
 * ���������� �������� "-"
 */
@AllArgsConstructor
public class MinusExpression implements Expression {

  private Expression left;
  private Expression right;

  /**
   * ����������������
   *
   * @return ��������� �������������
   */
  @Override
  public int interpret() {
    return left.interpret() - right.interpret();
  }
}
