package Behavior.observer;

import Behavior.observer.editor.Editor;
import Behavior.observer.listeners.EmailNotificationListener;
import Behavior.observer.listeners.LogOpenListener;

/**
 * 观察者模式是一种行为设计模式， 允许你定义一种订阅机制， 可在对象事件发生时通知多个 “观察” 该对象的其他对象。
 * 1、当一个对象状态的改变需要改变其他对象， 或实际对象是事先未知的或动态变化的时， 可使用观察者模式。
 * 2、当应用中的一些对象必须观察其他对象时， 可使用该模式。 但仅能在有限时间内或特定情况下使用。
 */
/**
 * @ClassName: Demo
 * @Description: 事件订阅
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class Demo {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
