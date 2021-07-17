package Behavior.memento.commands;

/**
 * @ClassName: Command
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/4/1
 */
public interface Command {
    String getName();
    void execute();
}