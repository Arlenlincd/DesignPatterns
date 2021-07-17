package Behavior.state;

import Behavior.state.ui.Player;
import Behavior.state.ui.UI;

/**
 * 状态模式是一种行为设计模式， 让你能在一个对象的内部状态变化时改变其行为。
 * 1、如果对象需要根据自身当前状态进行不同行为， 同时状态的数量非常多且与状态相关的代码会频繁变更的话， 可使用状态模式。
 * 2、如果某个类需要根据成员变量的当前值改变自身行为， 从而需要使用大量的条件语句时， 可使用该模式。
 * 3、当相似状态和基于条件的状态机转换中存在许多重复代码时， 可使用状态模式。
 */
/**
 * @ClassName: Demo
 * @Description: 媒体播放器的接口
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
