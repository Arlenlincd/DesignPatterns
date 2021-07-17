package construction.bridge.devices;

/**
 * @ClassName: Device
 * @Description: 所有设备的通用接口
 * @Author: arlin
 * @Date: 2021/6/27
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
