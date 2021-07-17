package Behavior.interpreter;

import Behavior.interpreter.context.Context;

/**
 * 解释器模式是一个行为型设计模式，给分析对象定义一个语言，并定义该语言的文法表示，再设计一个解析器来解释语言中的句子。
 */
/**
 * @ClassName: Demo
 * @Description: “韶粵通”公交车卡的读卡器程序
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class Demo {

    public static void main(String[] args) {
        Context bus = new Context();
        bus.freeRide("韶关的老人");
        bus.freeRide("韶关的年轻人");
        bus.freeRide("广州的妇女");
        bus.freeRide("广州的儿童");
        bus.freeRide("山东的儿童");
    }
}
