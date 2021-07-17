package Behavior.command;

import Behavior.command.editor.Editor;

/**
 * 命令模式是一种行为设计模式， 它可将请求或简单操作转换为一个对象。
 * 1、如果你需要通过操作来参数化对象， 可使用命令模式。
 * 2、如果你想要将操作放入队列中、 操作的执行或者远程执行操作， 可使用命令模式。
 * 3、如果你想要实现操作回滚功能， 可使用命令模式。
 */
/**
 * @ClassName: Demo
 * @Description: 文字编辑器和撤销
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class Demo {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
