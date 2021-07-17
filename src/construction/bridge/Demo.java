package construction.bridge;

import construction.bridge.devices.Device;
import construction.bridge.devices.Radio;
import construction.bridge.devices.Tv;
import construction.bridge.remotes.AdvancedRemote;
import construction.bridge.remotes.BasicRemote;

/**
 * 桥接模式是一种结构型设计模式，可将业务逻辑或一个大类拆分为不同的层次结构，从而能独立地进行开发。
 */
/**
 * @ClassName: Demo
 * @Description: 设备和远程控制之间的桥接
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class Demo {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
