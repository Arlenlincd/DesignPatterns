package Behavior.interpreter.expression;

/**
 * @ClassName: AndExpression
 * @Description: 非终结表达式类
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class AndExpression implements Expression {

    private Expression city = null;
    private Expression person = null;

    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    public boolean interpret(String info) {
        String s[] = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
