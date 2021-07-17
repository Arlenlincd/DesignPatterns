package Behavior.interpreter.expression;

/**
 * @ClassName: Expression
 * @Description: 抽象表达式类
 * @Author: arlin
 * @Date: 2021/6/28
 */
public interface Expression {
    boolean interpret(String info);
}
