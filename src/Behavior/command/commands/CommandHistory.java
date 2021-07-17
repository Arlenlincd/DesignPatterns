package Behavior.command.commands;

import java.util.Stack;

/**
 * @ClassName: CommandHistory
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}