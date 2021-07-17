package Behavior.mediator;

import Behavior.mediator.components.*;
import Behavior.mediator.mediator.Editor;
import Behavior.mediator.mediator.Mediator;

import javax.swing.*;

/**
 * 中介者是一种行为设计模式， 让程序组件通过特殊的中介者对象进行间接沟通， 达到减少组件之间依赖关系的目的。
 * 1、当一些对象和其他对象紧密耦合以致难以对其进行修改时， 可使用中介者模式。
 * 2、当组件因过于依赖其他组件而无法在不同应用中复用时， 可使用中介者模式。
 * 3、如果为了能在不同情景下复用一些基本行为， 导致你需要被迫创建大量组件子类时， 可使用中介者模式。
 */
/**
 * @ClassName: Demo
 * @Description: 笔记程序
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
