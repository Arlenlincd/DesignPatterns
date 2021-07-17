package Behavior.interpreter.expression;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: TerminalExpression
 * @Description: 终结表达式类
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class TerminalExpression implements Expression {

    private Set<String> set = new HashSet<String>();

    public TerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) set.add(data[i]);
    }

    public boolean interpret(String info) {
        if (set.contains(info)) {
            return true;
        }
        return false;
    }
}
