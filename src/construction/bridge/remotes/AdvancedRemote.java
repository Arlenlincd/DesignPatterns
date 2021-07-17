package construction.bridge.remotes;

import construction.bridge.devices.Device;

/**
 * @ClassName: AdvancedRemote
 * @Description: 高级远程控制器
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}